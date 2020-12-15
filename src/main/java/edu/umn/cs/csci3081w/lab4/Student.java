package edu.umn.cs.csci3081w.lab4;

public class Student {

    private MyString initials;

    public Student(String name){
      MyString initials = new MyString();
      initials.setMyString(name);
      initials.removeNonLetterCharactersInSubstring(1, initials.getMyString().length());
      initials.removeNonUpperCaseCharactersInSubstring(1, initials.getMyString().length());
      this.initials = initials;
    }

    public MyString getInitials() {
      return initials;
    }

  /**
   * Returns true if and only if this student and the student passed as parameter
   * have the same initials
   *
   * @param student Student to check
   * @return  <code>true</code> if the two students have the same initials, <code>false</code> otherwise
   */
    public boolean hasSameInitials(Student student) {
      if(student==null){
        return false;
      }
        boolean result = this.getInitials().getMyString().equals(student.getInitials().getMyString());
      return result;
    }
}
