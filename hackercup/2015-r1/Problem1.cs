using System;
using System.Collections.Generic;

namespace HackerCup2015
{
    class State
    {
        public long A;
        public long B;
        public long K;
    }

    class Problem1
    {
        static void Main(string[] args)
        {
            int T = Convert.ToInt32(Console.ReadLine());


            var states = new List<State>();
            long maxB = 0;

            for (int i = 1; i <= T; i++)
            {
                string[] line = Console.ReadLine().Split(' ');

                var state = new State();

                state.A = Convert.ToInt64(line[0]);
                state.B = Convert.ToInt64(line[1]);
                state.K = Convert.ToInt64(line[2]);

                states.Add(state);
                if (state.B > maxB)
                    maxB = state.B;
            }

            bool[] notPrime = new bool[maxB+1];
            long n = 2;
            bool done = false;
            while (!done)
            {
                for (long i = n + n; i < notPrime.Length; i += n)
                {
                    notPrime[i] = true;
                }

                for (long j = n + 1; j < notPrime.Length; j++)
                {
                    if (!notPrime[j])
                    {
                        n = j;
                        break;
                    }

                    if (j == notPrime.Length - 1)
                        done = true;
                }
            }

            long[] Primacities = new long[maxB+1];
            n = 2;
            done = false;
            while (!done)
            {
                for (long i = n; i < notPrime.Length; i += n)
                {
                    Primacities[i]++;
                }

                for (long j = n + 1; j < notPrime.Length; j++)
                {
                    if (!notPrime[j])
                    {
                        n = j;
                        break;
                    }

                    if (j == notPrime.Length - 1)
                        done = true;
                }
            }

            int c = 0;
            foreach (var state in states)
            {
                long count = 0;
                for (long num = state.A; num <= state.B; num++)
                {
                    if (Primacities[num] == state.K)
                        count++;
                }
                Console.WriteLine(string.Format("Case #{0}: {1}", c++, count));
            }
        }
    }
}
