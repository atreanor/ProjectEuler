using System;

public class Problem1
{
    public static main()
    {
        GetMultiplesOf3or5(1000);
    }

    static int GetMultiplesOf3or5(int limit)
    {

        int total = 0;

        for  (int i = 1; i < limit; i++)
        {
            if (i % 3.0 == 0 || i % 5.0 == 0)
            {
                Console.WriteLine(i + " is a multiple of 3 or 5");
                total += i;
                Console.WriteLine("Total is: " + total);
            }
        }
        Console.WriteLine("Sum of natural numbers that are multiple of 3 or 5 is " + total);
        return total;
    }
}
