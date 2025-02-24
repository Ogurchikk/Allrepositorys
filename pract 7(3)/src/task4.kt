import java.lang.NumberFormatException
import kotlin.math.sqrt

fun main()
        {
            try
            {
            print("введите длину стороны А: ")
            val a = readLine()!!.toDouble()
            print("введите длину стороны B: ")
            val b = readLine()!!.toDouble()
            print("введите длину стороны C: ")
            val c = readLine()!!.toDouble()

                val s = (a + b + c) / 2 //полупериметр
                val area = sqrt(s * (s - a) * (s - b) * (s - c)) //площадь
                val height = (2 * area) / 2 //высота
                val raindedHeight = String.format("%.2f", height)


                when
                {
                    a<=0||b<=0||c<=0 -> println("длины сторон должны быть положительными")
                    a + b <= c || a + c <= b || b + c <= a -> println("введенные данные не могут образовать треугольник")
                    else  -> println("высота, опущенная на сторону А: $raindedHeight")
                }
            }
            catch (e: NumberFormatException)
            {
                println("ошибка ввода." +
                        "введите числовые значения")
            }
            catch (e: Exception)
            {
                println("ошибка: ${e.message}")
            }
        }
