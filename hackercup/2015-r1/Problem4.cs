﻿using System;
using System.Collections.Generic;

namespace HackerCup2015
{
    class Problem4
    {
        static void Main(string[] args)
        {
            int T = Convert.ToInt32(Console.ReadLine());

            for (int i = 1; i <= T; i++)
            {
                int N = Convert.ToInt32(Console.ReadLine());
                int[] employeeLevels = new int[N];
                var levelCounts = new Dictionary<int, int>();

                string[] line = Console.ReadLine().Split(' ');
                for (int j = 0; j < line.Length; j++)
                {
                    int managerId = Convert.ToInt32(line[j]);
                    if (managerId > 0)
                        employeeLevels[j] = employeeLevels[managerId - 1] + 1;

                    if (!levelCounts.ContainsKey(employeeLevels[j]))
                    {
                        levelCounts.Add(employeeLevels[j], 1);
                    }
                    else
                    {
                        levelCounts[employeeLevels[j]]++;
                    }
                }

                int levelWithMaxPeople = 0;
                int maxPeopleCount = 1;
                for (int level = 1; level < levelCounts.Keys.Count; level++)
                {
                    if (levelCounts[level] > maxPeopleCount)
                    {
                        maxPeopleCount = levelCounts[level];
                        levelWithMaxPeople = level;
                    }                        
                }

                int totalGift = 0;
                int gift = 1;
                for (int level = levelWithMaxPeople; level < levelCounts.Keys.Count; level++)
                {
                    totalGift += gift * levelCounts[level];
                    gift = (2 + 1) - gift;
                }

                gift = 2;
                for (int level = levelWithMaxPeople - 1; level >= 0; level--)
                {
                    totalGift += gift * levelCounts[level];
                    gift = (2 + 1) - gift;
                }

                Console.WriteLine(string.Format("Case #{0}: {1}", i, totalGift));
            }
        }
    }
}
