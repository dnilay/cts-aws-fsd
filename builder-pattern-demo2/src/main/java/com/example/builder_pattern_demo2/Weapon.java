package com.example.builder_pattern_demo2;

/**
 * Weapon enumeration.
 */
public enum Weapon {

  DAGGER, SWORD, AXE, WARHAMMER, BOW;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
