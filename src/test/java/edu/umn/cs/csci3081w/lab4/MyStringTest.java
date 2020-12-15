package edu.umn.cs.csci3081w.lab4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MyStringTest {

  private MyStringInterface myString;

  @BeforeEach
  public void setUp() throws Exception {
    myString = new MyString();
  }

  @AfterEach
  public void tearDown() throws Exception {
    myString = null;
  }

  @Test
  public void testSetMyString() {
    myString.setMyString("Goldy Gopher");
    assertEquals("Goldy Gopher", myString.getMyString());
  }

  @Test
  public void testSetMyStringNullValue() {
    assertThrows(IllegalArgumentException.class, () -> {
      myString.setMyString(null);
    });
  }

  @Test
  public void testSetMyStringEmptyValue() {
    assertThrows(IllegalArgumentException.class, () -> {
      myString.setMyString("");
    });
  }

  //add three tests for removeNonLetterCharactersInSubstring in MyString
  @Test
  public void testRemoveNonLetterCharactersInSubstring() {
    myString.setMyString("G0l45#yab4c Gopher");
    myString.removeNonLetterCharactersInSubstring(1, 7);
    assertEquals("Glyab4c Gopher", myString.getMyString());
  }

  @Test
  public void testRemoveNonLetterCharactersInSubstringIndexOutOfBounds() {
    assertThrows(MyIndexOutOfBoundsException.class, () -> {
      myString.removeNonLetterCharactersInSubstring(-1, 3);
    });
  }

  @Test
  public void testRemoveNonLetterCharactersInSubstringIllegalArgumentException() {
    myString.setMyString("Goldy Gopher");
    assertThrows(IllegalArgumentException.class, () -> {
      myString.removeNonLetterCharactersInSubstring(6, 3);
    });
  }

  //add three tests for removeNonUpperCaseCharactersInSubstring in MyString
  @Test
  public void testRemoveNonUpperCaseCharactersInSubstrings() {
    myString.setMyString("GOaLbDcY gOPher");
    myString.removeNonUpperCaseCharactersInSubstring(2, 12);
    assertEquals("GOLDYOPher", myString.getMyString());
  }

  @Test
  public void testRemoveNonUpperCaseCharactersInSubstringIndexOutOfBounds() {
    assertThrows(MyIndexOutOfBoundsException.class, () -> {
      myString.removeNonUpperCaseCharactersInSubstring(-1, 3);
    });
  }

  @Test
  public void testRemoveNonUpperCaseCharactersInSubstringIllegalArgumentException() {
    myString.setMyString("Goldy Gopher");
    assertThrows(IllegalArgumentException.class, () -> {
      myString.removeNonUpperCaseCharactersInSubstring(6, 3);
    });
  }

}
