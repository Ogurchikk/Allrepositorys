import kotlin.math.sqrt

fun main()
{
    try {
    print("введите А: ")
        val a = readLine()!!.toDouble()
    print("введите B: ")
        val b = readLine()!!.toDouble()
    print("введите C: ")
        val c = readLine()!!.toDouble()

        when {
            a == 0.0 -> throw IllegalArgumentException("Коэффициент 'a' не должен быть равен нулю.")

            else -> {
                val d = b * b - 4 * a * c // Дискриминант

                when {
                    d < 0 -> {
                        println("Нет действительных корней.")
                    }
                    d == 0.0 -> {
                        val x = -b / (2 * a) // Один корень
                        println("Единственный корень: %.2f".format(x))
                    }
                    else -> {
                        val root1 = (-b + sqrt(d)) / (2 * a)
                        val root2 = (-b - sqrt(d)) / (2 * a)
                        println("Корни: %.2f и %.2f".format(root1, root2))
                    }
                }
            }
        }
    } catch (e: Exception){
        println("Ошибка: ${e.message}")
    }
}