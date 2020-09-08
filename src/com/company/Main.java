package com.company;

public class Main {

    public static void main(String[] args) {
	int Balance = 250;
	int ReplenishmentAmount = 2780;
	if (ReplenishmentAmount > 1_000) {
	    int Result = Balance + ReplenishmentAmount + ReplenishmentAmount / 100;
        System.out.println(Result);
    } else {
	    int Result = Balance + ReplenishmentAmount;
        System.out.println(Result);
    }
    }
}
