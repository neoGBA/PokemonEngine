package com.jimbabwe.pokemon;

public class Bulbasaur {
	
	String type = "Grass";
	String type2 = "Poison";
	
	int baseHP = 45;
	int baseAttack = 49;
	int baseDefense = 49;
	int baseSpecialAttack = 65;
	int baseSpecialDefense = 65;
	int baseSpeed = 45;
	
	int attack;
	int defense;
	int specialAttack;
	int specialDefence;
	int speed;
	
	public Bulbasaur(int level) {
		//determine stats based on base stats
		//determine moves by level
	}
	
	public String getType() {
		return type;
	}
	
	public String getType2() {
		return type2;
	}
}
