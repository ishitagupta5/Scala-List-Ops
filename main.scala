import Homework7.*
import java.io.PrintWriter
import java.io.File

object main
{
  def main( args: Array[String]) : Unit =
    if ( args.length < 3 )
      System.out.println( "Usage: scala main input.txt output.txt")
    else
      val input = args(1)
      val output = args(2)
      val out = new PrintWriter( new File(output) )
      scala.io.Source.fromFile(input).getLines().foreach{ line =>
      if ( line != "" )
        var words = line.split(" ")
        if ( words(0) == "append" )
          val list_words = words.toList.tail 
          val append_this = " " ++ list_words.last
          val new_list_words = list_words.init
          val new_list = append(new_list_words, append_this)
          out.printf( "appending %s to %s makes %s\n", append_this, stringlist_to_string(new_list_words), stringlist_to_string(new_list))
          else if ( words(0) == "leapys" )
            val years = string_to_int(words.toList.tail)
            val leaps = leap_years(years)
            out.printf("Checking %s for years that are leap years %s\n", intlist_to_string(years),intlist_to_string(leaps))
          else if ( words(0) == "sum")
            val nums = string_to_int(words.toList.tail)
            val result = sum( nums )
            out.printf( "Sum of %s is %d\n", intlist_to_string(nums), result)

      }
      out.close()

}

def string_to_int( list: List[String] ) : List[Int] =
  if ( list.isEmpty )
    List()
  else
    var num = list.head.toInt
    num :: string_to_int( list.tail )

def intlist_to_string( list: List[Int]) : String = 
  if ( list.isEmpty )
    ""
  else
    if (list.tail.isEmpty )
      list.head.toString 
    else
      list.head.toString +", " + intlist_to_string( list.tail )
    

def stringlist_to_string( list: List[String] ) : String =    
  if ( list.isEmpty )
    ""
  else
    list.head ++ " " ++ stringlist_to_string(list.tail)

