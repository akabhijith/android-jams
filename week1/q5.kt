fun main(){
println("Enter l1:")
val l1=readLine()

println("Enter l2:")
val l2=readLine()
println("Enter l3:")
val l3=readLine()

if (l1 == l2 && l2 == l3) 
        println("Equilateral Triangle")
  
    else if (l1 == l2 || l2 == l3 || l3 == l1) 
        println("Isoceles Triangle") 
  
    else
        println("Scalene Triangle")
}
