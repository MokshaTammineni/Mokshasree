import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Quiz Application!");
        System.out.println("You will have 30 seconds to answer each question.");
        System.out.println("Press Enter to start the quiz.");
        scanner.nextLine();

        String[] questions = {
            "What is the capital of France?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the chemical symbol for water?",
            "What is the largest mammal in the world?"
        };
        String[] answers = {"Paris", "William Shakespeare", "H2O", "Blue whale"};
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.length);

        scanner.close();
    }
}
