package org.naasir.javafpplayground.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.naasir.javafpplayground.Palindrome;

class PalindromeTests {

  @Test
  @DisplayName("Check empty string")
  public void whenEmptyString_thenAccept() {
    Palindrome palindromeTester = new Palindrome();
    assertTrue(palindromeTester.isPalindrome(""));
  }

}
