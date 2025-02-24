import kotlin.math.round

fun main() {
    try {
        print("введите х - ")
        var x = readLine()!!.toDouble()
        print("введите y - ")
        var y = readLine()!!.toDouble()

//округление координат до двух знаков после запятой
        val roundedX = String.format("%.2f",x).toDouble()
        val roundedY = String.format("%.2f",y).toDouble()

        // Определение принадлежности точек областям
        val result = when {
            isInRegionA(roundedX, roundedY) -> "точка принадлежит закрашенной области 'а'."
            isInRegionB(roundedX, roundedY) -> "точка принадлежит закрашенной области 'б'."
            isInRegionV(roundedX, roundedY) -> "точка принадлежит закрашенной области 'в'."
            isInRegionG(roundedX, roundedY) -> "точка принадлежит закрашенной области 'г'."
            else -> "точка не принадлежит ни одной из закрашенных областей."
        }

        println(result)

} catch (e: Exception) {
    println("Ошибка: ${e.message}")
}

}

// Проверка для области 'а'
fun isInRegionA(x: Double, y: Double): Boolean { return x >= -3 && x <= 1 && y >= -1 && y <= 1 && y >= -0.5 * x - 0.5 && y <= -0.5 * x + 0.5 }

// Проверка для области 'б'
fun isInRegionB(x: Double, y: Double): Boolean { return (x >= -1 && x <= 1 && y >= -2 && y <= 0) || (x >= -1 && x <= 1 && y >= 0 && y <= 2 && y <= -2 * Math.abs(x) + 2) }

// Проверка для области 'в'
fun isInRegionV(x: Double, y: Double): Boolean { return (x >= -1 && x <= 1 && y >= -2 && y <= 2 && y <= 2.0 && y >= 0) || (x * x + (y + 1) * (y + 1) <= 1 && y < 0) }

// Проверка для области 'г'
fun isInRegionG(x: Double, y: Double): Boolean { return x >= -2 && x <= 1 && y >= -2 && y <= 1 && y >= Math.abs(x) - 2 && y <= -Math.abs(x) + 2 }