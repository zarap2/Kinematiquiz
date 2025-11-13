import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//decreasing
  //  System.out.println("Hello world");
    
    
  
       PhysicsStorage game = new PhysicsStorage();
  for(int i = 1; i<21;i++){
   int question =(int) ((Math.random())*10);
  if(question == 4){
    Graphing.graphVelocity(2);
      System.out.println(game.getQuestions(question));
    System.out.print("Would you like to see a solution of the graph?");
    String response1a = input.nextLine();
    if(response1a.toLowerCase().equals("yes")){
        System.out.println("Enter in first value as a number. ");
        double response1b = input.nextDouble();
System.out.println("Here's the solution.");       System.out.println(Graphing.findEquationSoln(response1b,2));
        System.out.println("Enter in second value as a number. ");
        double response1c = input.nextDouble();
  
  System.out.println("Here's the solution.");     
      System.out.println(Graphing.findEquationSoln(response1c,2));
    }
    input.nextLine();
    System.out.println("Enter in final answer.");
    String response1d = input.nextLine();
      
  
    System.out.println(game.getResults(game.getQuestions(question),response1d.toLowerCase()));
    System.out.println("");
  }else if(question == 5){
     Graphing.graphVelocity(2);
    System.out.println(game.getQuestions(question));
    System.out.println("Would you like to see a solution of the graph?");
    String response1a = input.nextLine();
    if(response1a.toLowerCase().equals("yes")){
        System.out.println("Enter in first value. ");
        double response1b = input.nextDouble();
    System.out.println("Here's the solution.");     System.out.println(Graphing.findEquationSoln(response1b,2));
        System.out.println("Enter in second value. ");
        double response1c = input.nextDouble();
        System.out.println("Here's the solution.");     System.out.println(Graphing.findEquationSoln(response1c,2));
   }
     input.nextLine();
     System.out.println("Enter in final answer.");
     String response1d = input.nextLine();
  
  System.out.println(game.getResults(game.getQuestions(question),response1d.toLowerCase()));
    System.out.println();

  }else{
    System.out.println(game.getQuestions(question));
    String response = input.nextLine();
System.out.println(game.getResults(game.getQuestions(question),response.toLowerCase()));
  System.out.println();
   // System.out.println(question);
  }
   // System.out.println(question);
   /* 
   String question1 = game.getQuestions(question);System.out.println(game.getQuestions(question));
 // System.out.println(" A 1 Cor. 5:2 \n B 1 Cor. 10:27 \n C Phil. 4:4 \n D Rom. 3:23");
    String response = input.nextLine();
System.out.println(game.getResults(question1,response));
    System.out.println("");
  }
  

   /* 
    
     System.out.println(question2);
    String response2 = input.nextLine();
System.out.println(game.getResults(question2,response2));
    System.out.println("");
      System.out.println(question3);
   System.out.println(" A Truth \n B Bread \n C Money \n D Friends");   
  String response3 = input.nextLine();
System.out.println(game.getResults(question3,response3));
    System.out.println("");
 */
/*
  System.out.println(question1);
    System.out.println("Would you like to see a solution of the graph?");
    String response1a = input.nextLine();
    if(repsonse1a.toLowerCase().equals("yes")){
        System.out.println("Enter in first value. ")
        String repsonse1b = input.nextLine();
        System.out.println(findEquationSoln(response1b,2));
        System.out.println("Enter in second value. ");
        String response1c = input.nextLine();
        System.out.println(findEquationSoln(response1c,2));
        
    }
   String response1d = input.nextLine();
  
System.out.println(game.getResults(question1,response1d));
    */
    
  
   
              }
    }
}
