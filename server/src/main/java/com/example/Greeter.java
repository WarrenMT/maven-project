package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
* @param A string as someone to greet
* @return Returns the full greeting
*/
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
