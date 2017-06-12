using System;
using System.Collections.Generic;

namespace HackerCup2015
{
    class Problem2
    {
        static void Main(string[] args)
        {
            int T = Convert.ToInt32(Console.ReadLine());

            for (int i = 1; i <= T; i++)
            {
                var dic = new Dictionary<string, string>();
                var wordDic = new Dictionary<string, string>();

                int N = Convert.ToInt32(Console.ReadLine());
                for (int j = 1; j <= N; j++)
                {
                    string word = Console.ReadLine();

                    bool added = false;
                    for (int k=1; k<=word.Length; k++)
                    {
                        string prefix = word.Substring(0, k);
                        if (!dic.ContainsKey(prefix) && !wordDic.ContainsValue(prefix))
                        {
                            dic.Add(prefix, word);
                            if (!wordDic.ContainsKey(word)) wordDic.Add(word, string.Empty);
                            added = true;
                            break;
                        }
                    }
                    int dots = 1;
                    while (!added)
                    {
                        string prefix = word + new String('.', dots);
                        if (!dic.ContainsKey(prefix))
                        {
                            dic.Add(prefix, word);
                            added = true;
                        }
                        else
                            dots++;
                    }
                }

                int count = 0;
                foreach(string key in dic.Keys)
                {
                    count += key.Length;
                }

                Console.WriteLine(string.Format("Case #{0}: {1}", i, count));
            }
        }
    }
}
