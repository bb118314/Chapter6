package debugging;

//FixDebugSix3.java
//Prompt user for value to start
//Value must be between 1 and 20 inclusive
//At command line, count down to blastoff
//With a brief pause between each displayed value
import javax.swing.*;
import java.util.ArrayList;
public class FixDebugSix3
{
public static void main(String[] args)
{
 String userNumString;
 int userNum;
 int val;
 final int MIN = 1;
 final int MAX = 20;
 userNumString = JOptionPane.showInputDialog(null,
     "Enter a number between " + MIN + " and " + MAX + " inclusive");
 userNum = Integer.parseInt(userNumString);
 while(userNum < MIN || userNum > MAX)
 {
    //userNumString = JOptionPane.showInputDialog(null,
     System.out.println("Number out of range" +
     "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
    userNum = Integer.parseInt(userNumString);
 }
 for(int val1 int userNum1; val = 0; -val)
 {
   System.out.print(val + "  ");
   for(int x = 0; x  100000; ++x)
    for(int y = 0y  10000; ++y);
    // Adjust these numbers for faster or slower performance
 }
 System.out.println("Blastoff!");
}
}