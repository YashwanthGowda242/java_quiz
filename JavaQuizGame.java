import java.io.*;
import java.util.*;

public class JavaQuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Absolute file path to quizQue.txt (update based on your operating system)
        String filePath = "C:\\Users\\yashu\\OneDrive\\Desktop\\quizQue.txt";  // Adjust path as needed

        // Lists to hold questions, options, and answers
        List<String> questions = new ArrayList<>();
        List<String[]> options = new ArrayList<>();
        List<String> correctAnswers = new ArrayList<>();

        // Read quiz data from file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder currentQuestion = new StringBuilder();
            String[] currentOptions = new String[4];
            String correctAnswer = "";

            while ((line = br.readLine()) != null) {
                line = line.trim();

                // Skip empty lines
                if (line.isEmpty()) continue;

                // If line starts with "Question", it's a new question
                if (line.startsWith("Question")) {
                    if (currentQuestion.length() > 0) {
                        questions.add(currentQuestion.toString());
                        options.add(currentOptions);
                        correctAnswers.add(correctAnswer);
                    }

                    // Reset for next question
                    currentQuestion = new StringBuilder();
                    currentOptions = new String[4];
                    correctAnswer = ""; // Reset correct answer
                }

                // Collect options (A, B, C, D)
                else if (line.startsWith("A.") || line.startsWith("B.") || line.startsWith("C.") || line.startsWith("D.")) {
                    int index = line.charAt(0) - 'A';
                    currentOptions[index] = line;
                }

                // Collect the correct answer (just the letter)
                else if (line.length() == 1 && "ABCD".contains(line)) {
                    correctAnswer = line;
                }
                else {
                    // Collect the question text
                    currentQuestion.append(line).append("\n");
                }
            }

            // Add the last question after reading the file
            if (currentQuestion.length() > 0) {
                questions.add(currentQuestion.toString());
                options.add(currentOptions);
                correctAnswers.add(correctAnswer);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        // Start the quiz
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            for (String option : options.get(i)) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A/B/C/D): ");
            String answer = scanner.nextLine().toUpperCase();

            // Check if the answer is correct
            if (answer.equals(correctAnswers.get(i))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers.get(i));
            }
            System.out.println();
        }

        // Display final score
        System.out.println("Your final score is: " + score + "/" + questions.size());
    }
}
