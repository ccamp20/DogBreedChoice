import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int age = 8;
    while(age <= 11)
    {
      System.out.println("You can't get a dog.");
      age++;
    }

    //this code is stating that the kid can't get a dog until they are above the age of 8.

    boolean wantsToPlay = true;

    if(wantsToPlay = true && age > 11) {
      System.out.println("You can get a Golden Retriever" );
    }
  else if(age > 11 && wantsToPlay == false) {
      System.out.print("You can get a pug.");
  }
    //this code is including the types of dogs that the kid can get dependent on their age and if they would play with it or not.

    boolean responsibility = true;

    for (int currentAge = 20; age > 14; responsibility = true) {
      System.out.print("You can get two dogs");
    }

    //this code states the fact that if the person is over 14 years old they can get 2 dogs.

    Scanner Scan = new Scanner(System.in);
    System.out.println("What should I name the dog?");
    String name = Scan.next();

    System.out.print("Thank you for your input :)");

    //the scanner asks the user what the dog's name should be
    
  
  }
  } 