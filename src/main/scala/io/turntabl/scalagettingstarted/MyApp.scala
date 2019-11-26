package io.turntabl.scalagettingstarted

import io.turntabl.functional.Functional
import io.turntabl.students.{TLCStudent, TurntablEmployee, TurntablManager}

object MyApp extends App {

  /*val s1 = new TLCStudent("Angie","Amengu")
  val s2 = new TLCStudent("Maame", "Amengu")
  val s3 = new TLCStudent("Sam", "Moorhouse")*/
//  print(s1 isRelated s2)
//  print(s3);
 // val grade1 = s3.topGrade("Scala Programming",70)
  //print(grade1.copy(grade = 90))
  //val f1 = new Functional()
  //print(f1.stringNoSpace("Sam Moorhouse Ama"))
  //print(f1.applyToString("Angelina Amengu",f1.stringNoSpace))
  //print(f1.applyToString("Angelina Amengu Amankwah",f1.stringLength))
  //val instruction = f1.calculate("subtract")
  //print(instruction(2,1))

 /* def howHard(employee: TurntablEmployee): Unit ={
    print(employee.GetWorkload)
  }*/

  //val m1 = new TurntablManager()

  //howHard(m1)
  val item = ("SammyK","Python Programming")
  var (name, progLang) = item
  //print(name)
  //print(progLang)
  val region = Map(
    "Ghana" -> "Greater Accra",
    "Togo" -> "Lome",
    "UK" -> "London"
  )
  val newCountry = region.+("US" -> "DC")
  //print(newCountry)
  //print(newCountry.getOrElse("Nigeria","Unknown"))
  val friends = Set("Samuel","Samuel","Obed")
  //print(friends.count(_ == "Samuel"))
  //val listOfFriendsNames = List("Bill","Dawid","Franklin").foreach(println)
  val listOfFriendsNamesSixLettersCount = List("Bill","Dawid","Franklin").count(_.length() > 6)
  println(listOfFriendsNamesSixLettersCount)

  val listOfFriendsNamesSixLetter = List("Bill","Dawid","Franklin").foreach(name => if(name.length() > 6) println(name))
  print(listOfFriendsNamesSixLetter)
}

