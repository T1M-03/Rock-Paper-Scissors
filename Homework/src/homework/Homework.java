
package homework;
import java.util.Scanner;

public class Homework {
/*
    This program will create a rock paper scissors game and determin an outcome.
    */
  
    public static void main(String[] args) {
            int rock = 1, paper = 2, scissors = 3;
                //allows you to chose what you want to pick based on numbers 1 - 3
            System.out.println("Choose your weapon:\nRock:     1\nPaper:    2\nScissors: 3");
       
         Scanner scan = new Scanner(System.in);
          
            int weapon = scan.nextInt();        //scans for an input
            int Random = (int)(Math.random()*4);//generates a random number 
           
            System.out.printf("%s%d\n%s%d\n" , "Your weapon is: " , weapon, "My weapon is:   " , Random);
             //clearafies who picked what number
        if (Random == 0)
            System.out.println("I wasn't ready!");
             //added some humor to the PC
        else if (Random == weapon)
            System.out.println("Draw!");
            //if the PC and the player has the same number it will result in a draw
        else if (weapon < paper & Random == scissors)
            System.out.println("You Win!");
            //parameters to justify a win if the player picks "1"
        else if (weapon > paper & Random != rock)
            System.out.println("You Win!");
            //parameters to justify a win if the player picks "3"
        else if (weapon == paper & Random != scissors)
            System.out.println("You Win!");
            //parameters to justify a win if the player picks "2"
        else
            System.out.println("You Loose!");
            //parameter to justify the PC wining
      
    }
    
}

// Why testing for > Paper or < Paper, T1M-03?
