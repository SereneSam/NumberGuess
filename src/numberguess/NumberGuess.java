package numberguess;

import java.util.Scanner;

public class NumberGuess 
{

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        Boolean numberfound=false;
        int min=1, max=10, mid;
        System.out.println("Think of a number between "+min+" and "+max);
        while(!numberfound)
        {
            mid=(min+max)/2;
            System.out.println("Is "+mid+" your number?");
            String answer=in.next().toLowerCase();
            if(answer.equals("yes"))
            {
                System.out.println("We found your number.");
                break;
            }
            System.out.println("Is your number greater than "+ mid+"?");
            answer=in.next().toLowerCase();
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
    
}
