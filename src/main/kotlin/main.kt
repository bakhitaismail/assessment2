fun main(){
    var y = CurrentAccount(223355, "Bakhita", 350000)
    println(y.deposit(2500.55))
    println(y.withdraw(70000.55))
    y.details(33)
    var x = SavingsAccount(223355, "Bakhita", 350000)
    println(x.deposit(35000))
    println(x.withdraw())
    var p = Product("tomato", 55, 2500, "grocery" )
    println(p)
    println(characters("pineapple"))


}
class CurrentAccount(var accountnumber: Int, var accountname: String, var balance: Int){
    fun deposit(amount: Double): Double {
        var amount= 2500.55
        amount += balance
        return amount
    }
    fun withdraw(amount: Double): Int {
        var amount =70000.55
        amount -= balance
        return balance

    }
    fun details(dets: Int){
        println("$accountnumber $balance")

    }

}
class SavingsAccount(var accountnumber: Int, var accountname: String, var balance: Int){
    fun deposit(amount: Int): Int {
        var amount= 35000
        amount += balance
        return amount

    }
    fun withdraw(): Int {
        var amount =70000.55
        amount -= balance
        return balance

    }

}
data class Product(var name:String, var weight: Int, var price: Int, var category: String)


fun characters(fruit: String) {
    var fruit="pineapple"
    println(fruit[2].toString()+fruit[4]+fruit[6])


}

