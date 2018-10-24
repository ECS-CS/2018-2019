public class Question {
  // THIS CLASS HAS 2 ATTRIBUTES

  // THIS VARIABLE WILL STORE THE QUESTION WE ASK OUR USERS
  String prompt;

  // THIS VARIABLE WILL STORE THE ANSWER TO OUR QUESTIONS
  String answer;

  // CREATES THE QUESTION OBJECT
  public Question(String prompt, String answer){
    this.prompt = prompt;
    this.answer = answer;
  }
}