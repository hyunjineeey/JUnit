package edu.umn.cs.csci3081w.lab4;

public class MyIndexOutOfBoundsException extends RuntimeException {
  private static final long serialVersionUID = 8226094121089030034L;

  public MyIndexOutOfBoundsException(String message) {
    super(message);
  }

  public MyIndexOutOfBoundsException() {
    super();
  }
}
