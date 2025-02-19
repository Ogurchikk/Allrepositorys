using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Collections;

namespace task1
{
    class Program
    {
        static void Main(string[] args)
        {
            

            // Шаг 1: Создание новой коллекции
            ArrayList list = new ArrayList();
            list.Add(4.5);
            list.Add(18);
            list.AddRange(new string[] { "студент", "Петров" });

            Console.WriteLine("Исходный список:");
            foreach (object e in list)
            {
                Console.WriteLine(e);
            }

            // Шаг 2: Ввод индекса n1
            Console.Write("Введите индекс n1 для вставки новой коллекции (будет добавлено в конец): ");
            int n1 = Convert.ToInt32(Console.ReadLine());

            // Создание новой коллекции для добавления
            ArrayList newCollection = new ArrayList() { "новый элемент 1", "новый элемент 2", "новый элемент 3" };

            // Добавление новой коллекции в конец списка
            list.AddRange(newCollection);

            // Шаг 3: Удаление k элементов начиная с индекса n (где n = n1 / 2)
            int n = n1 / 2;

            Console.Write("Введите количество элементов для удаления (k): ");
            int k = Convert.ToInt32(Console.ReadLine());

            // Удаление k элементов, начиная с индекса n
            for (int i = 0; i < k; i++)
            {
                if (n < list.Count) // Проверка на выход за границы списка
                {
                    list.RemoveAt(n);
                }
                else
                {
                    break; // Если n больше, чем размер списка, выходим из цикла
                }
            }

            // Шаг 4: Вывод на экран нового списка
            Console.WriteLine("Новый список:");
            foreach (object e in list)
            {
                Console.WriteLine(e);
            }
        }
    }
}
