using System;

class Q2439
{
    static void Main(String[] args)
    {
        int N = int.Parse(Console.ReadLine());
        
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= N - i; j++)
            {
                Console.Write(" ");
            }
            
            for (int k = 1; k <= i; k++)
            {
                Console.Write("*");
            }
            
            Console.WriteLine();
        }
    }
}