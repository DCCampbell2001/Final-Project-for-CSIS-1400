//Dylan Campbell
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class FinalProject
{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean quit = false;
      int optionSelector;
      do
      {
         mainMenu();
         optionSelector = input.nextInt();
         switch (optionSelector)
         {
            case 1:
               dice();
               break;
            case 2:
               guess();
               break;
            case 3:
               quit = true;
               break;
            default:
               System.out.println("Error: Invalid Selection. Please Try Again");
         }
         System.out.print("\n\n\n");
      } while (!quit);
      System.out.println("Goodbye");
      input.close();
    }
   private static void mainMenu() {
       System.out.println("--------------------------------------");
       System.out.println("Select the Game You Would Like to Play");
       System.out.println("--------------------------------------");
       System.out.println("    Dice Roll Competition(1)");
       System.out.println("\n    Random Number Guessing Game(2)");
       System.out.println("\n    Exit Application(3)");
       System.out.println("--------------------------------------");
       System.out.println("Input the Number Corresponding to Your");
       System.out.println("      Selection (1, 2 or 3)");
       System.out.println("--------------------------------------");
    }
   private static void dice() {
       int[] player1 = new int[6];
       int[] player2 = new int[6];
       int size;
       int average1;
       int average2;
       int total1;
       int total2;
       String winner = "";
       Scanner input = new Scanner(System.in);
       System.out.println("----------------------------------");
       System.out.println("    Instructions for the Game");
       System.out.println("----------------------------------");
       System.out.println("1) Select Dice Size");
       System.out.println("2) Game Will Roll Each");
       System.out.println("   Players Dice 6 Times");
       System.out.println("   and Calculate Average");
       System.out.println("3) Player With Highest Average");
       System.out.println("   Wins the Game!");
       System.out.println("----------------------------------");
       System.out.println("Pick a Dize Size [4][6][8][12][20]");
       System.out.println("----------------------------------");
       size = input.nextInt();
       if ((size == 4) || (size == 6) || (size == 8) || (size == 12) || (size == 20))
        {
          /*For loop and array to generate 12 random number
          without needing to make a variable for each number*/
           Random rand = new Random();
           for (int i=0; i<player1.length; i++) {   
           player1[i] = (rand.nextInt(size) + 1);    
           }
           for (int i=0; i<player2.length; i++) {
           player2[i] = (rand.nextInt(size) + 1);
           }
           total1 = (player1[0] + player1[1] + player1[2] + player1[3] + player1[4] + player1[5]);
           total2 = (player2[0] + player2[1] + player2[2] + player2[3] + player2[4] + player2[5]);
           average1 = (total1 / 6);
           average2 = (total2 / 6);
           if (average1 == average2)
           {
              winner = "Tie";
           }
           else if (average1 > average2)
           {
              winner = "Player 1";
           }  
           else
           {
              winner = "Player 2";
           }
           Scanner keyIn = new Scanner(System.in);
           System.out.println("------------------------------------------------------");
           System.out.println(size + "-Sided Dice Roll Summary");
           System.out.println("------------------------------------------------------");
           System.out.println("Player	Rolls	                Total	Average");
           System.out.println("------------------------------------------------------");
           System.out.println("1: 	" + player1[0] + " " + player1[1] + " " + player1[2] + " " + player1[3] + " " + player1[4] + " " + player1[5] + "	               " + total1 + "	     " + average1);
           System.out.println("2:	   " + player2[0] + " " + player2[1] + " " + player2[2] + " " + player2[3] + " " + player2[4] + " " + player2[5] + "                " + total2 + "      " + average2);
           System.out.println("------------------------------------------------------");
           System.out.println("Winner: " + winner);
           System.out.println("------------------------------------------------------");
           System.out.println("Press Enter to Continue");
           keyIn.nextLine();
        }
       else
        {
           System.out.println("Error: Invalid Selection. Please Try Again.");
           dice();
        }  
    }   
   private static void guess() {
      Scanner input = new Scanner(System.in);
      System.out.println("----------------------------------");
      System.out.println("    Instructions for the Game");
      System.out.println("----------------------------------");
      System.out.println("1) The Game Will Pick a Number");
      System.out.println("   Between 1 and 10");
      System.out.println("2) Player 1 Will Make Their Guess");
      System.out.println("3) Player 2 Will Make Their Guess");
      System.out.println("4) Player With the Closest Guess");
      System.out.println("   Wins the Game!");
      System.out.println("----------------------------------");
      Random rand = new Random();
      int random;
      int player1;
      int player2;
      String winner = "";
      random = (rand.nextInt(10)+1);
      System.out.println("Player 1, make your guess");
      player1 = input.nextInt();
      System.out.println("Player 2, make your guess");
      player2 = input.nextInt();
      int difference1 = (random - player1);
      int difference2 = (random - player2);
      if (difference1<difference2)
      {
         winner = "Player 1"; 
      } 
      else if (difference1>difference2) 
      {
         winner = "Player 2"; 
      } 
      else 
      {
         winner = "Tie";
      }
      Scanner keyIn = new Scanner(System.in); 
      System.out.println("------------------------------------------------------");
      System.out.println("Number Guess Summary");
      System.out.println("------------------------------------------------------");
      System.out.println("The Randomly Generated Number Between 1 and 10: " + random);
      System.out.println("------------------------------------------------------");
      System.out.println("Player 1 Guessed: " + player1);
      System.out.println("Player 2 Guessed: " + player2);
      System.out.println("------------------------------------------------------");
      System.out.println("Winner: " + winner);
      System.out.println("------------------------------------------------------");
      System.out.println("Press Enter to Continue");
      keyIn.nextLine();
    } 
}    
       