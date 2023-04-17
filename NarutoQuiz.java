import java.util.Scanner;

public class NarutoQuiz {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "Who was Naruto's teacher at the Ninja Academy?",
            "What is the name of the demon that was sealed inside Naruto?",
            "What is the name of the Fourth Hokage who sealed the demon inside Naruto?",
            "What is Sasuke's last name?",
            "What is the name of the village where Naruto grew up?"
        };
        String[][] choices = {
            {"Iruka", "Jiraiya", "Kakashi"},
            {"Kurama", "Shukaku", "Matatabi"},
            {"Minato", "Hiruzen", "Tobirama"},
            {"Uzumaki", "Uchiha", "Senju"},
            {"Konohagakure", "Kumogakure", "Sunagakure"}
        };
        int[] answers = {0, 0, 0, 1, 0};
        
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            System.out.println("   A. " + choices[i][0]);
            System.out.println("   B. " + choices[i][1]);
            System.out.println("   C. " + choices[i][2]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("A")) {
                if (answers[i] == 0) {
                    score++;
                }
            } else if (answer.equalsIgnoreCase("B")) {
                if (answers[i] == 1) {
                    score++;
                }
            } else if (answer.equalsIgnoreCase("C")) {
                if (answers[i] == 2) {
                    score++;
                }
            }
        }
        
        System.out.println("Your score is " + score + " out of " + questions.length);
    }
    
}
