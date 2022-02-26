fun main() {
    var inst = "akirachix"
    var chaA = inst[0]
    var chaB = inst[2]
    var chaC = inst[3]
    println(chaA.toString() + chaB + chaC)
    var p = pMeter("Cudra", 20)
    println(p)
    var name = "Mum"
    println("The length of my name is " + name.length)
    var name2 = "Qudra"
    if (name2 == "Mimi") {
        println("thats me")
    } else {
        print("I don't know who that is")
    }
}
fun pMeter(name: String, age: Int): String {
    var word = "Hi my name is $name $age years old"
    return word
}
