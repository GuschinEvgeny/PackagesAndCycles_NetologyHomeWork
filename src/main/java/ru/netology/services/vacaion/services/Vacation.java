package ru.netology.services.vacaion.services;

public class Vacation {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // count rest month
        int money = 0; // count money deposit
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // rest condition
                count++; // up count
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}