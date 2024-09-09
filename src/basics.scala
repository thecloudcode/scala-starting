object basics extends  App{

  //defining my first value
  val rizz: Int = 17; // const int rizz = 17;
  println(rizz);

  // Int, Boolean, Char, Double, Float, String
  val aBoolean = false // type is optional

  val aString = "I love Scala"
  val aComposedString = "i"+" "+"love"+" "+"coding"
  val anInterpolatedString = s"The meaning og life is $rizz";

  // expressions are structures that can be reduced to a value
  val anExpression = 2+3;

  // if-expression
  val ifExp = if (rizz>70) 7 else 999 // rizz > 70 ? 7 : 999
  val chainedExp = if(rizz>70) 7
  else if(rizz>100) -2
  else 999

  val aCodeBlock = {
    // definitions
    val aLocalValue = 67
    // value of block is the value of the last expression
    aLocalValue+3
  }

  // functional programming language :
  def function(x: Int, y:String): String = {
    y + " " + x
  }

  // recursive function
  def fact(n: Int): Int =
    if (n<=1) 1
    else n * fact(n-1)

  // In Scala we don't use loops or iteration, we use RECURSION!d

  // the Unit Type = no meaning value === void
  // type of SIDE EFFECTS
  println("I love Scala") // System.out.println, printf, print, console.log

  def myUnitReturningFunction(): Unit = {
    println("I don't love returning Unit")
  }

  val theunit
}