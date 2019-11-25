package io.turntabl.students

import io.turntabl.grades.Grade

class TLCStudent(val fName: String, val lName: String, val id: Int = 1029 , val role: String = "Student",val year: Int = 2018, val gitUrl: String = "https://github/turntabl") {

  def studentTerm()=
    2019 - 2018

  def topGrade(subject: String, grade: Int) =
    Grade(subject,grade)

  def isRelated(student: TLCStudent) = student.studentTerm() equals studentTerm()

  override def toString = s"TLCStudent($fName, $lName, $id, $role, $gitUrl)"
}

object TLCStudent{
  def apply(fName: String, lName: String, id: Int, role: String, year: Int, gitUrl: String): TLCStudent = new TLCStudent(fName, lName, id, role, year, gitUrl)
}

