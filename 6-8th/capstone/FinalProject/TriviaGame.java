import java.util.Scanner;

public class TriviaGame {
  public static void main(String[] args){

    welcome();

    String q1 = "How old is Mr. Bostwick? \n\n" + "[a] In his twenties\n[b] In his thirties\n[c] In his fourties";
    String q2 = "When did the Computer Science Program begin? \n\n" + "[a] January 2017\n[b] January 2018\n[c] It never started";
    String q3 = "Who is the hottest rapper out right now? \n\n" + "[a] Kanye West\n[b] Drake\n[c] Travis Scott";
    String q4 = "How many doors are in this room? \n\n" + "[a] 2\n[b] 3\n[c] 4";
    String q5 = "How tall is Mr. Bostwick? \n\n" + "[a] 5 foot 5 inches\n[b] 5 foot 10 inches\n[c] 6 feet";

    Question [] questions = {
      new Question(q1, "a"),
      new Question(q2, "b"),
      new Question(q3, "c"),
      new Question(q4, "a"),
      new Question(q5, "b"),
    };

    startGame(questions);
  }

  public static void welcome(){
    System.out.println("");
    System.out.println("++++++++++++++++++++++++++++++");
    System.out.println("==============================");
    System.out.println("Welcome to Mr. Bostwick's Trivia Game");
    System.out.println("Topic: Facts about Computer Science");
    System.out.println("++++++++++++++++++++++++++++++");
    System.out.println("==============================");
    System.out.println("");
  }

  public static void startGame(Question [] questions){
    int score = 0;
    Scanner keyboardInput = new Scanner(System.in);

    for(int i = 0; i < questions.length; i++){
      System.out.println("QUESTION #" + (i+1) + ":");
      System.out.println("_________________________");
      System.out.println(questions[i].prompt);
      System.out.println();
      System.out.print("Your Answer => ");
      String answer = keyboardInput.nextLine();
      System.out.println();
      if(answer.equals(questions[i].answer)){
        score++;
      } else {
        score--;
      }
    }

    System.out.println("Final Score: " + score + " points.");
    System.out.println("________________________");
  }

}