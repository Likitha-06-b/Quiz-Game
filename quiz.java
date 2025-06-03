import java.util.Scanner;

class Question {
    String questionText;
    String[] options;
    char correctOption;

    public Question(String questionText, String[] options, char correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public boolean isCorrect(char answer) {
        return Character.toUpperCase(answer) == Character.toUpperCase(correctOption);
    }

    public void displayQuestion() {
        System.out.println("\n" + questionText);
        char optionLabel = 'A';
        for (String option : options) {
            System.out.println(optionLabel + ". " + option);
            optionLabel++;
        }
    }
}

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define quiz questions
        Question[] questions = {
            new Question(
                "What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"},
                'C'
            ),
            new Question(
                "Which language is primarily used for Android development?",
                new String[]{"Kotlin", "Swift", "JavaScript", "Python"},
                'A'
            ),
            new Question(
                "Who wrote 'Romeo and Juliet'?",
                new String[]{"William Wordsworth", "William Shakespeare", "Jane Austen", "Charles Dickens"},
                'B'
            ),
            new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Venus", "Saturn", "Mars", "Jupiter"},
                'C'
            )
        };

        int score = 0;

        System.out.println("=== Welcome to the Quiz Game ===");
        for (int i = 0; i < questions.length; i++) {
            questions[i].displayQuestion();
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);

            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                Syste
