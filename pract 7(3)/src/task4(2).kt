fun main() {
    try
    {
        print("введите x: ")
        val x = readLine()!!.toDouble()
        print("введите y: ")
        val y = readLine()!!.toDouble()
        print("введите z: ")
        val z = readLine()!!.toDouble()

        val u = when
        {
            y < 0 ->
            {
                val maxXY = if (x > y) x else y
                if (z < maxXY) z else maxXY
            }
            y >= 0 -> {
                val minXY = if (x < y) x else y
                if (z > minXY) z else minXY
            }
            else -> throw IllegalArgumentException("Неверное условие.")
        }

        println("Результат: ${"%.2f".format(u)}") //округление до двух знаков
    } catch (e: Exception)
    {
        println("Ошибка: ${e.message}")
    }
}