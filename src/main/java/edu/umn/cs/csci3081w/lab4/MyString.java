package edu.umn.cs.csci3081w.lab4;

public class MyString implements MyStringInterface {

  private String string;

  @Override
  public void setMyString(String string) throws IllegalArgumentException {
    if (string == null) {
      throw new IllegalArgumentException();
    }
    if (string.equals("")){
      throw new IllegalArgumentException();
    }
    this.string = string;
  }

  @Override
  public String getMyString() {
    return string;
  }

  @Override
  public void removeNonLetterCharactersInSubstring(int startPosition, int endPosition)
      throws MyIndexOutOfBoundsException, IllegalArgumentException {
    if ((startPosition < 1) || (startPosition > string.length()) || (endPosition < 1) || (endPosition > string.length())) {
      throw new MyIndexOutOfBoundsException();
    }
    if (startPosition > endPosition) {
      throw new IllegalArgumentException();
    }
    StringBuffer tmpString = new StringBuffer();
    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);
      if ((i < startPosition - 1) || (i > endPosition - 1)) {
        tmpString.append(ch);
        continue;
      } else {
        if (Character.isLetter(ch)) {
          tmpString.append(ch);
          continue;
        }
      }
    }
    string = tmpString.toString();
  }

  @Override
  public void removeNonUpperCaseCharactersInSubstring(int startPosition, int endPosition)
      throws MyIndexOutOfBoundsException, IllegalArgumentException {
    if ((startPosition < 1) || (startPosition > string.length()) || (endPosition < 1) || (endPosition > string.length())) {
      throw new MyIndexOutOfBoundsException();
    }
    if (startPosition > endPosition) {
      throw new IllegalArgumentException();
    }
    StringBuffer tmpString = new StringBuffer();
    for (int i = 0; i < string.length(); i++) {
      char ch = string.charAt(i);
      if ((i < startPosition - 1) || (i > endPosition - 1)) {
        tmpString.append(ch);
        continue;
      } else {
        if (Character.isUpperCase(ch)) {
          tmpString.append(ch);
          continue;
        }
      }
    }
    string = tmpString.toString();
  }
}
