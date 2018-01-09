object Perform
{

 def maxElement(list: List[Int]): Int = {
  var max = list(0)
  for (value <- list) {
   if (max < value)
    max = value
  }
  return max
 }

 def factCalculate(num:Int): Int =
  if (num == 0)
   return 1
  else
   return num * factCalculate(num-1)



 def sumCalculate(sum:Int):Int={
if(sum==0)
 return 0
  else
 return (sum % 10) + sumCalculate(sum / 10)

 }

 def listInteorperability(list:List[Int])={
  for(res<-list)
   {
    println {
     s" ${list.indexOf(res)} = $res"
    }
   }
 }

 def fibbonacciCalculate(prev:Int,next:Int): Int ={
  {
  var res= prev + next
   println(res)
   fibbonacciCalculate(prev, next)
  }
 }

 def main(args:Array[String]): Unit =
 {
  val list=List(10,20,30,40)
  val num:Int=10
  var factorial= Perform.factCalculate(num)
  var sum=Perform.sumCalculate(factorial)
  println(fibbonacciCalculate(0, 1))
  listInteorperability(list)
  maxElement(list)
 }
}