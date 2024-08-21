/*
This program generates a randome number from 1-10 and then
has that user guess that number.
Mohammed Qutu 2/4/2024
 21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/
import java.util.Scanner;
public class GuessingGameExercise 
{

    public static void main(String[] args) 
    {
        int count =0;
        int userAnswer = 0;
        int computerNumber = (int) (Math.random() *10+1 ); 
        System.out.println("The correct guess would be " + computerNumber);
        Scanner keyboard = new Scanner(System.in);
        while(computerNumber != userAnswer)
        {
            count++;
        System.out.println("Enter a guess between 1 and 10: ");
        userAnswer = keyboard.nextInt();
            if(userAnswer ==  computerNumber)
        {
            System.out.println("Correct");
            }
                else
            {
                    if(userAnswer <= 0 || userAnswer >10)
                {
                System.out.println("Invalid Guess");
                }
                        else if(userAnswer > computerNumber)
                    {
                        System.out.println("Too High");
                    }
                            else
                        {
                            System.out.println("Too Low");
                        }
                    
            }
        }
        if(count ==1)
        {
            System.out.println("You must be psychic!");
        }
        else if(count < 3)
        {
            System.out.println("Amazing");
        }
        else if(count < 5)
        {
            System.out.println("Great Job");
        }
        else
        {
            System.out.println("You need some practice");
        }
    }
}
