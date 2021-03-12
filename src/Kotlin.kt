fun main() {
index()
   println (joinString("Pamera","22"))
    println(stringLength("Codehive"))
    comparison("Pamera")


}
  fun index() {
      var school = "akiraChix"
      print(school[0])
      print(school[2])
      println(school[3])
  }
fun joinString(x:String,y:String):String {
    return " Hi, my name is  $x  and I am  $y years old  "
}
fun stringLength ( name:String):Int{
    return name.length
}
fun comparison (name:String){
    var name="Pamera"
    if (name == "Pamera"){ println("That's me!")
}
    else{println(" I don't know who that is")

    }
}