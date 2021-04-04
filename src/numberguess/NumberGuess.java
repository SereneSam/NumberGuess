package numberguess;

import java.util.Scanner;

public class NumberGuess 
{
    static Scanner in;
    public static void main(String[] args) 
    {
        int min=1, max=100;
        System.out.println("Think of a number between "+min+" and "+max);
        Guessnumber(min, max);
    }
    
    public static void Guessnumber(int min, int max)
    {
        in=new Scanner(System.in);
        int mid;
        while(true)
        {
            mid=(min+max)/2;
            String answer=validateInput("Is "+mid+" your number?");
            if(answer.equals("yes"))
            {
                System.out.println("We found your number.");
                break;
            }
            answer=validateInput("Is your number greater than "+ mid+"?");
//            answer=in.next().toLowerCase();
            if(answer.equals("yes"))
            {
                min=mid;
            }
            else
            {
                max=mid;
            }
        }
    }
    
    public static String validateInput(String message)
    {
        String answer;
            
        while(true)
        {
            System.out.println(message);
            answer=in.next().toLowerCase();
            
            if(answer.equals("yes")||answer.equals("no"))
            {
                return answer;
            }
            
            System.out.println("Please enter whether Yes or No");
        }   
    }
    
}
