package io.turntabl.scalagettingstarted

import io.turntabl.students.TLCStudent

object MyApp extends App {

  val s1 = new TLCStudent("Angie","Amengu")
  val s2 = new TLCStudent("Maame", "Amengu")
  val s3 = new TLCStudent("Sam", "Moorhouse")
//  print(s1 isRelated s2)
//  print(s3);
  val grade1 = s3.topGrade("Scala Programming",70)
  print(grade1.copy(grade = 90))
}

