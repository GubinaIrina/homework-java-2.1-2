package com.company;

public class Main {

    public static void main(String[] args) {
	int balance = 250;
	int replenishmentAmount = 2780;
	int bonus;
	if (replenishmentAmount > 1_000) {
    bonus = replenishmentAmount / 100;
	} else {
	    bonus = 0;
    }
    System.out.println(bonus);
    }
}
