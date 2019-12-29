package com.example.demo.student;

import com.google.common.base.Objects;

public class Student {

    private /*final*/ Integer studentId;
    private /*final*/ String studentName;

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }


//    public void setStudentId(Integer studentId) {
//        this.studentId = studentId;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public Integer getStudentId() {
//        return studentId;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }


    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equal(studentId, student.studentId) &&
                Objects.equal(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId, studentName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
