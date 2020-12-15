package edu.umn.cs.csci3081w.lab4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class EnrollManagerTest {

  //debug this tests
  @Test
  public void testEnrollStudents() {
    EnrollManager enrollManager = new EnrollManager();
    List<String> studentNames = new ArrayList<String>();
    studentNames.add("Albert Einstein");
    studentNames.add("Nicolaus Copernicus");
    studentNames.add("Galileo Galilei");
    enrollManager.enrollStudents(studentNames);
    assertEquals(2, enrollManager.getStudents().size());
  }

  //add two tests for enrollStudents in EnrollManager
  @Test
  public void testEnrollStudentsWithGG() {
    EnrollManager enrollManager = new EnrollManager();
    List<String> studentNames = new ArrayList<String>();
    studentNames.add("Gregory George");
    enrollManager.enrollStudents(studentNames);
    assertEquals(0, enrollManager.getStudents().size());
  }

  @Test
  public void testEnrollStudentsWithMore() {
    EnrollManager enrollManager = new EnrollManager();
    List<String> studentNames = new ArrayList<String>();
    studentNames.add("Goldy Gopher");
    studentNames.add("Nicolaus Copernicus");
    studentNames.add("Galilei Goldy");
    studentNames.add("Albert Einstein");
    studentNames.add("Taylor Nathan");
    enrollManager.enrollStudents(studentNames);
    assertEquals(3, enrollManager.getStudents().size());
  }
}
