package student.service;

import student.model.Student;
import student.model.Subject;

public class StudentTest {
    public static void main(String[] args) {
        // Creating subjects
        Subject telugu = new Subject();
        telugu.subjectName = "Telugu";
        telugu.marks = 88;

        Subject hindi = new Subject();
        hindi.subjectName = "Hindi";
        hindi.marks = 34;

        Subject english = new Subject();
        english.subjectName = "English";
        english.marks = 990;

        Subject maths = new Subject();
        maths.subjectName = "Maths";
        maths.marks = 95;

        // Creating student and adding subjects
        Student student1 = new Student();
        student1.studentName = "Rakesh";
        student1.className = "10th class";
        student1.rollNumber = "16";

        student1.mySubjects = new Subject[4]; // Initialize array with 4 subjects
        student1.mySubjects[0] = telugu;
        student1.mySubjects[1] = hindi;
        student1.mySubjects[2] = english;
        student1.mySubjects[3] = maths;


        // Validating student
        StudentService studentService = new StudentService();
        studentService.validateStudent(student1);


    }
}
