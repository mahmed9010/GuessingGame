package MahdiAhmed;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Hi would you like me to guess your number or for you to guess mine. Type ai for me to guess yours and type me for you to guess mine.");
        String decision = input.nextLine();
        if(decision.compareTo("me") == 0)
        {
            int n = (int) (10*Math.random());
            int tries = 1;
            System.out.print("Guess my number from 1-10");
            int num = input.nextInt();
            if(num < n)
            {
                System.out.println("Too low");
                tries++;
            }
            else if(num > n)
            {
                System.out.println("Too high");
                tries++;
            }
            else
            {
                System.out.println("Correct it took you " + tries + " tries");
            }
            while(num != n)
            {
                System.out.print("Guess my number from 1-10");
                num = input.nextInt();
                if(num < n)
                {
                    System.out.println("Too low");
                }
                else if(num > n)
                {
                    System.out.println("Too high");
                }
                else
                {
                    tries++;
                    System.out.println("Correct it took you " + tries + " tries");
                }
            }
        }
        else if(decision.compareTo("ai") == 0)
        {
            System.out.println("Pick a number from 1 - 100 and i will try to guess it. Type in too high if my guess is higher than your number, too low for if my guess is lower and correct for when it is correct.");
            int x = 50;
            int y = 100;
            int diff = (int) (Math.ceil(Math.abs(x - y)/2f));
            int tries = 1;
            System.out.print("Is your number " + x);
            String answer = input.nextLine();
            y = x;
            if(answer.equals("too low"))
            {
                x = x + diff;
                tries++;
            }
            else if(answer.equals("too high"))
            {
                x = x - diff;
                tries++;

            }
            else if(answer.equals("correct"))
            {
                System.out.println("hooray it too me " + tries + " tries");
                return;
            }
            diff = Math.abs(x - y)/2;
            while(!(answer.equals("correct")))
            {
                System.out.print("Is your number " + x);
                answer = input.nextLine();
                y = x;
                if(answer.equals("too low"))
                {
                    x = x + diff;
                    tries++;
                }
                else if(answer.equals("too high"))
                {
                    x = x - diff;
                    tries++;
                }
                else if(answer.equals("correct"))
                {
                    tries++;
                    System.out.println("hooray it too me " + tries + " tries");
                    return;
                }
                diff = (int) (Math.ceil(Math.abs(x - y)/2f));
            }
        }

    }
}
