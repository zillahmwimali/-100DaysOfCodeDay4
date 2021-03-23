fun main() {
println(whoami("Jane".toUpperCase(),"Doe".toUpperCase(),"nomansland".capitalize()))
    typeOfHair("3a","4c")
    println(whiteSpace("  Inform police."))
    scrabbleWord()
    changeName()
    toWatch()
}
fun whoami(x:String,y:String,z:String):String{
    return "I am $x $y and I come from $z"

}
fun typeOfHair(type1:String,type2:String){
    if (type1==type2){
        println("That's her!")
    }
    else{
        println("I can't recognize her!")
    }
}
fun whiteSpace(suggestion:String):String{
return suggestion.trimStart()
}
fun scrabbleWord(){
    var hint="Xerox"
    println(hint.startsWith("x"))
    println(hint.endsWith("x"))
}
fun changeName(){
    val name="Jane Doe"
    println(name.replace("Jane Doe","Liz Keen"))
}
fun toWatch(){
    var movies="Jexi,The It Crowd,Moneyball"
    println(movies.split(","))
}




