package com.example.builder_pattern_demo2;

/**
 * HairColor enumeration.
 */
public enum HairColor {

  WHITE, BLOND, RED, BROWN, BLACK;

  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
