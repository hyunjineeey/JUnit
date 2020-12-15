package edu.umn.cs.csci3081w.lab4;

public interface MyStringInterface {

  /**
   * Sets the value of the current string
   *
   * @param string The value to be set
   * @throws IllegalArgumentException If the "string" parameter is null or empty
   */
  void setMyString(String string);

  /**
   * Returns the current string
   *
   * @return Current string
   */
  String getMyString();

  /**
   * Remove non letter characters in the current string between startPosition
   * and endPosition (included). The first character in the string is
   * considered to be in Position 0.
   *
   * @param startPosition Position of the first character to consider
   * @param endPosition   Position of the last character to consider
   * @return
   * @throws MyIndexOutOfBoundsException If either "startPosition" or "endPosition" are out of
   *                                     bounds (i.e., either less than 1 or greater then the
   *                                     length of the string)
   * @throws IllegalArgumentException    If "startPosition" > "endPosition" (but both are
   *                                     within bounds)
   */
  void removeNonLetterCharactersInSubstring(int startPosition, int endPosition)
      throws MyIndexOutOfBoundsException, IllegalArgumentException;

  /**
   * Remove non upper case characters in the current string between startPosition
   * and endPosition (included). The first character in the string is
   * considered to be in Position 1.
   *
   * @param startPosition Position of the first character to consider
   * @param endPosition   Position of the last character to consider
   * @return
   * @throws MyIndexOutOfBoundsException If either "startPosition" or "endPosition" are out of
   *                                     bounds (i.e., either less than 1 or greater then the
   *                                     length of the string)
   * @throws IllegalArgumentException    If "startPosition" > "endPosition" (but both are
   *                                     within bounds)
   */
  void removeNonUpperCaseCharactersInSubstring(int startPosition, int endPosition)
      throws MyIndexOutOfBoundsException, IllegalArgumentException;


}
