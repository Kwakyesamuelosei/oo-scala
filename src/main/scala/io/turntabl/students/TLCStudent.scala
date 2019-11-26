package io.turntabl.students

import io.turntabl.grades.Grade

class TLCStudent(val fName: String, val lName: String, val id: Int = 1029 , val role: String = "Student",val year: Int = 2018, val gitUrl: String = "https://github/turntabl") extends TurntablEmployee {

  override def termOfService: Int = 2019 -2018

  def topGrade(subject: String, grade: Int) =
    Grade(subject,grade)

  def isRelated(student: TLCStudent) = student.termOfService equals termOfService

  override def toString = s"TLCStudent($fName, $lName, $id, $role, $gitUrl)"

  override def GetWorkload: String = "Works super hard"
}

object TLCStudent{
  def apply(fName: String, lName: String, id: Int, role: String, year: Int, gitUrl: String): TLCStudent = new TLCStudent(fName, lName, id, role, year, gitUrl)
}

