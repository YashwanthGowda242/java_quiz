
# Java Quiz Game

## Description

The **Java Quiz Game** is a simple command-line quiz application developed in Java. The game allows users to answer multiple-choice questions based on a quiz provided in a text file. Each question has four options (A, B, C, D), and the player has to select the correct option. After answering each question, the game will display whether the answer is correct or incorrect and provide the correct answer if necessary. At the end of the game, the total score will be shown.

### Features:
- Reads quiz questions, options, and correct answers from an external text file (`quizQue.txt`).
- Displays one question at a time with four options (A, B, C, D).
- Allows the user to input their answer (A/B/C/D).
- Gives immediate feedback on whether the answer is correct or incorrect.
- Displays the total score at the end of the quiz.

## How to Run

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/your-username/java-quiz-game.git
    ```

2. Navigate to the project directory:

    ```bash
    cd java-quiz-game
    ```

3. Compile the Java file:

    ```bash
    javac JavaQuizGame.java
    ```

4. Run the program:

    ```bash
    java JavaQuizGame
    ```

## File Structure

- `JavaQuizGame.java`: The main program file that runs the quiz game.
- `quizQue.txt`: A text file containing the questions, options, and correct answers. It should be formatted as follows:
  
    ```
    Question 1: What is the capital of India?
    A. Mumbai
    B. New Delhi
    C. Kolkata
    D. Chennai
    B
    
    Question 2: Who is the president of the United States?
    A. Barack Obama
    B. Donald Trump
    C. Joe Biden
    D. George Bush
    C
    ```

## How the Program Works

- The program reads the questions, options, and answers from the `quizQue.txt` file.
- Each question is displayed along with its options (A, B, C, D), and the user can input their answer.
- After each question, the program gives immediate feedback on whether the selected answer is correct or incorrect.
- At the end of the quiz, the total score (out of total questions) is displayed.

## Customization

You can modify the `quizQue.txt` file to add your own questions and answers. Ensure that the format is correct (questions, followed by options, and then the correct answer on a separate line).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
