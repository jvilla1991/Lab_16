import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean promptRerun(String s)
    {
        boolean bool = true;
        if ("y".equalsIgnoreCase(s))
        {
            bool = true;
        }
        else if ("n".equalsIgnoreCase(s))
        {
            bool = false;
        }
        return bool;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Scanner scnr = new Scanner(System.in);
        boolean bool = true;


        int populateArray = 1000;

        for (int i = 2; i < populateArray; i++)
        {
            if (i == 2)
            {
                arr1.add(i);
            }

            else if (i == 3)
            {
                arr1.add(i);
            }

            else if (i == 5)
            {
                arr1.add(i);
            }

            else if (i == 7)
            {
                arr1.add(i);
            }

            else if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0) && !(i % 7 == 0))
            {
                arr1.add(i);
            }
        }

        /*System.out.println(arr1);*/

        do {
            System.out.println("Which prime number are you looking for?");
            int userInput = scnr.nextInt();
            System.out.println("The prime number is " + arr1.get(userInput - 1));

            scnr.nextLine();

            System.out.println("Would you like to to find another prime number?");
            String s = scnr.nextLine();

            bool = promptRerun(s);
        } while (bool = true);


    }
}
