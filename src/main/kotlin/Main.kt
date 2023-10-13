fun main() {
    println(countComission("Maestro", 20000, 60000))
}


fun countComission(card: String = "VK Pay", lastSum: Int = 0, transfer: Int): Int {
    var comission = 0
    if((card == "Mastercard" || card == "Maestro") && lastSum + transfer < 75000) comission = 0
    else if(card == "Mastercard" || card == "Maestro") {comission = transfer * 6/1000}
    else if((card == "Visa" || card == "Мир") && (transfer * 75/10000) > 35 ) {comission = transfer * 75/10000}
    else if (card == "Visa" || card == "Мир") comission = 35
    else comission = 0
    return comission
}