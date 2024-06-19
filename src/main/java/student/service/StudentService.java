package student.service;

import student.model.Student;
import student.model.Subject;

public class StudentService {
 // public static final int PASS_MARKS = 35;

  public void validateStudent(Student student) {
    for (int i=0;i<student.mySubjects.length;i++)
    {
      if (student.mySubjects[i].marks>=0&&student.mySubjects[i].marks<=100) {

        if (student.mySubjects[i].marks > 35) {
          System.out.println(" student name = " + student.studentName + " roll number =" + student.rollNumber + " is passed in " + student.mySubjects[i].subjectName);
        } else {
          System.out.println(" student name = " + student.studentName + " roll number =" + student.rollNumber + " is failed in " + student.mySubjects[i].subjectName);
        }
      }
      else
        System.out.println("marks should be in >=0 and <=100");
    }
  }
}
