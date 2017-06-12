﻿using System;
using System.Collections.Generic;

namespace HackerCup2015
{
    class Food
    {
        public int Carb;
        public int Protine;
        public int Fat;
    }

    class Problem2
    {
        static void Main(string[] args)
        {
            int T = Convert.ToInt32(Console.ReadLine());
            for (int i = 1; i <= T; i++)
            {
                var target = getFood();
                int N = Convert.ToInt32(Console.ReadLine());
                var foods = new Food[N];
                for (int j=0; j<N; j++)
                {
                    foods[j] = getFood();
                }

                bool possible = false;                
                for (long num = 0; num < (long)Math.Pow(2.00, N); num++)
                {
                    var food = new Food();

                    for (int bit = 0; bit < N; bit++)
                    {
                        if ((num & (long)Math.Pow(2, bit)) != 0)
                        {
                            food.Carb += foods[bit].Carb;
                            food.Protine += foods[bit].Protine;
                            food.Fat += foods[bit].Fat;
                        }
                    }

                    if (food.Carb == target.Carb &&
                        food.Protine == target.Protine &&
                        food.Fat == target.Fat)
                    {
                        possible = true;
                        break;
                    }
                }

                Console.WriteLine(string.Format("Case #{0}: {1}", i, possible ? "yes" : "no"));
            }
        }

        static Food getFood()
        {
            string[] line = Console.ReadLine().Split(' ');
            return new Food
            {
                Carb = Convert.ToInt32(line[0]),
                Protine = Convert.ToInt32(line[1]),
                Fat = Convert.ToInt32(line[2])
            };
        }
    }
}
