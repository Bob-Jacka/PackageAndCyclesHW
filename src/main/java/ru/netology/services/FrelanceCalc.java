package ru.netology.services;

public class FrelanceCalc {
    public int isWorkOrRelax(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;
        for (int i = 1; i <= 12; i++) {
            if (money < threshold) {
                System.out.println("Месяц " + i + ". Денег " + money + "." + " Придётся работать." + " Заработал +" + income + ", потратил " + expenses);
                money += income - expenses;

            } else {
                System.out.println("Месяц " + i + ". Денег " + money + "." + " Буду отдыхать." + " Потратил " + expenses + ", затем ещё -" + ((money - expenses) - ((money - expenses) / 3)));
                money = money - expenses;
                money = money / 3;
                counter += 1;
            }
        }
        return counter;
    }
}
