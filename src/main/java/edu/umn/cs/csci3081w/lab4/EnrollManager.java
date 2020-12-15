package edu.umn.cs.csci3081w.lab4;

import java.util.ArrayList;
import java.util.List;

public class EnrollManager {

  private List<Student> students;
  private final Student GG = new Student("Goldy Gopher");

  public EnrollManager(){
    students = new ArrayList<Student>();
  }

  /**
   * Enroll students by saving the students list of this class.
   * The function does not enroll students whose initials are GG
   *
   * @param studentNames name of the students to enroll
   * @return
   */
  public void enrollStudents(List<String> studentNames){
    List<Student> students = new ArrayList<Student>();
    for(String name:studentNames){
      students.add(new Student(name));
    }
    for (Student student:students){
      if (!student.hasSameInitials(GG)) {
        this.students.add(student);
      }
    }
  }

  public List<Student> getStudents() {
    return students;
  }
}
