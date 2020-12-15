package edu.umn.cs.csci3081w.lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private Student student;
    private String name1 = "Goldy Gopher";
    private String name2 = "Goldy Topher";

    @Test
    public void testHasSameInitialsTrue() {
        student = new Student(name1);
        Student studentName = new Student("Goldy Gopher");
        boolean result = student.hasSameInitials(studentName);
        assertEquals(true, result);
    }

    @Test
    public void testHasSameInitialsFalse() {
        student = new Student(name2);
        Student studentName = new Student("Goldy Gopher");
        boolean result = student.hasSameInitials(studentName);
        assertEquals(false, result);
    }

    @Test
    public void testHasSameInitialsNullValue() {
        student = new Student(name1);
        boolean result = student.hasSameInitials(null);
        assertEquals(false, result);
    }
}
