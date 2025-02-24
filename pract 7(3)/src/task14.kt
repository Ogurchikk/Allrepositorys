import java.lang.NumberFormatException

fun main()
{
    print("введите четырехзначное число: ")
    try
    {
        val number = readln()!!.toInt()
        if (number < 1000 || number > 9999)
        {
            println("введите четырехзначное число!")
            return
        }

        var sum = 0;
        var tempNumber = number

        for (i in 1..4)
        {
            val digit = tempNumber % 10 //получаем последнюю цифру
            println("[ПРОЦЕСС РАСЧЕТА] $number: $sum + $digit")
            sum += digit
            tempNumber /= 10 //удаляем последнюю цифру
        }
        println()
        println("[ИТОГ] сумма цифр числа $number = $sum")
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