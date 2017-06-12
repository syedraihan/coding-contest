using System;

namespace HackerCup2015
{
    class Problem1
    {
        static void Main(string[] args)
        {
            int T = Convert.ToInt32(Console.ReadLine());
            for (int i=1; i<=T; i++)
            {
                string n = Console.ReadLine();

                char[] digits = n.ToCharArray();

                int min = 9; 
                int minPos = -1;
                for (int j=1; j<n.Length; j++)
                {
                    int digit = digits[j] - '0';
                    if (digit !=0 && digit < min) 
                    { 
                        min = digit; 
                        minPos = j; 
                    }
                }

                int max = 1;
                int maxPos = -1;
                for (int j = n.Length - 1; j > 0; j--)
                {
                    int digit = digits[j] - '0';
                    if (digit > max) 
                    { 
                        max = digit; 
                        maxPos = j; 
                    }
                }
                
                long maxNum = Convert.ToInt64(n);
                long minNum = maxNum;

                if (maxPos != -1 && digits[0] - '0' < max)
                {
                    Swap(digits, max, maxPos);
                    maxNum = Convert.ToInt64(Convert.ToInt64(new string(digits)));
                }

                digits = n.ToCharArray(); 
                if (minPos != -1 && digits[0] - '0' > min)
                {
                    Swap(digits, min, minPos);
                    minNum = Convert.ToInt64(Convert.ToInt64(new string(digits)));
                }
            
                Console.WriteLine(string.Format("Case #{0}: {1} {2}", i, minNum, maxNum));
            }
        }

        static void Swap(char[] digits, int num, int pos)
        {
            char tmp = digits[0];
            digits[0] = digits[pos];
            digits[pos] = tmp;
        }
    }
}
