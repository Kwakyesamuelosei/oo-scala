package io.turntabl.functional

class Functional {
   val stringLength = (s: String) => s.length()
   val stringNoSpace = (s: String) => s.count(_ == ' ')
   val applyToString =
      (s: String, func:(String => Int)) => func(s)
   val calculate =
      (s: String) => ((num_1: Int,num_2:Int) => s match {
         case "add" => num_1 + num_2
         case "subtract" => num_1 - num_2
      })
}
