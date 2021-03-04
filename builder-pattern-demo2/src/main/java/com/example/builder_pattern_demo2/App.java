
package com.example.builder_pattern_demo2;

import org.slf4j.LoggerFactory;

public class App {

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		var hero = new Hero.Builder(Profession.MAGE, "Riobard").withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER)
				.build();
		LOGGER.info(hero.toString());

		hero = new Hero.Builder(Profession.WARRIOR, "Amberjill").withHairColor(HairColor.BLOND)
				.withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD).build();
		LOGGER.info(hero.toString());

		hero = new Hero.Builder(Profession.THIEF, "Desmond").withHairType(HairType.BALD).withWeapon(Weapon.BOW)
				.build();
		LOGGER.info(hero.toString());
		
	}
}
