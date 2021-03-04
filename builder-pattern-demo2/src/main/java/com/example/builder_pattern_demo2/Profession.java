
package com.example.builder_pattern_demo2;

/**
 * Profession enumeration.
 */
public enum Profession {

	WARRIOR, THIEF, MAGE, PRIEST;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
