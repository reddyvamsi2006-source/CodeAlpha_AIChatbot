import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 Hello! I’m CodeAlpha Chatbot.");
        System.out.println("Type 'bye' anytime to end the chat.");
        System.out.println("----------------------------------------");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("hi") || userInput.contains("hello")) {
                System.out.println("Bot: Hi there! How can I help you today?");
            } 
            else if (userInput.contains("how are you")) {
                System.out.println("Bot: I’m doing great! Thanks for asking 😊");
            } 
            else if (userInput.contains("your name")) {
                System.out.println("Bot: I’m your friendly Java chatbot created for CodeAlpha Internship!");
            } 
            else if (userInput.contains("help")) {
                System.out.println("Bot: Sure! I can chat with you and answer simple questions like time, date, or general greetings.");
            } 
            else if (userInput.contains("time")) {
                System.out.println("Bot: The current system time is " + java.time.LocalTime.now());
            } 
            else if (userInput.contains("date")) {
                System.out.println("Bot: Today’s date is " + java.time.LocalDate.now());
            } 
            else if (userInput.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a great day 👋");
                break;
            } 
            else {
                System.out.println("Bot: Sorry, I didn’t understand that. Can you rephrase?");
            }
        }

        scanner.close();
    }
}
