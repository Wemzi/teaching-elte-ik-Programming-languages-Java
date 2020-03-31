
import java.io.*;
import java.util.Scanner;


class Main
{
    public static void main(String[] args)
    {
        System.out.print("Enter a sample: ");
        String sample = System.console().readLine();

        File input = new File(args[0]);
        try
        {
            Scanner sc = new Scanner(input);

            int counter = 0;
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();

                if (line.contains(sample))
                {
                    ++counter;
                }
            }

            System.out.println("counter = " + counter);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Unable to open file " + args[0]);
        }
        finally
        {
            sc.close();
        }
    }
}