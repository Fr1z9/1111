fun main(args: Array<String>) {
    print("Введите имя: ")
    val name = readLine()
    print("Введите фамилию: ")
    val seName = readLine()
    print("Введите возраст: ")
    val age = readLine().toString()
    val a = age.toInt()

    if (a>=18)
    println("Посетителя $name $seName пропустить в ТЦ")
    else
    if (a<=14)
    println("Вызвать полицию для $name $seName")
    else
    println("Посетителя $name $seName не пропускать в ТЦ")
}