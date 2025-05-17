package Homework7

def append( list: List[String], add_me: String ) : List[String] =
  list.map(word => word + add_me)

def leap_years( years: List[Int] ) : List[Int] =
  years.filter(is_leap_year)

def is_leap_year( year: Int ) : Boolean =
  (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))

def sum( nums: List[Int] ) : Int = 
  nums.foldLeft(0)(_ + _)
