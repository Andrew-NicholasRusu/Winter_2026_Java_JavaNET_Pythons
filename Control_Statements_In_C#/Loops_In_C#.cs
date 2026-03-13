using System;

public class Loops_In_C#
{
	public static void Main()
	{
		// 1. Entry Controlled Loops

		// While Loop
		int x = 1;
		while (x <= 4)
		{
			Console.WriteLine("I am a While Loop.");
			// Increment the value of x for next ieration.
			x++;
		}

		// for Loop
		for (int y = 1; y <= 4; y++)
		{
			Console.WriteLine("I am a for Loop.");
		}

		// 2. Exit Controlled Loops

		// do-while Loop
		int z = 21;

		do
		{
			// The line will be printed even if the condition is false.
			Console.WriteLine("I am a do-while Loop.");
			z++;
		}
		while (z < 20);

		// Loop Variations and Control Statements

		// 1. Infinite Loops
		for (; ; )
		{
			Console.WriteLine("I am an infinite Loop. I am printed infinite times.");
		}

		// 2. Nested Loops
		for (int a = 2; a < 3; a++)
		{
			for (int b = 1; b < a; b++)
			{
				Console.WriteLine("I am a nested Loop.");
			}

			// 3. Continue Statement
			for (int c = 1, c < 3; c++)
			{
				if (c == 2)
				{
					continue;
					Console.WriteLine("I am a continue statement");
				}
			}
		}
	}
}
