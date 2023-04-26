package ru.netology.services;

public class FrelanceCalc {
    int money;
    String state; // "Придётся работать." / "Буду отдыхать."
    int counter;
    public int isWorkOrRelax(int income, int expenses, int threshold) {
        for (int i=1; i <= 12; i++) {
            if(money < threshold) {
                state = " Придётся работать.";
                System.out.println("Месяц " + i + ". Денег " + money + "." + state +" Заработал +" + income + ", потратил " + expenses);
                money += income - expenses;

            } else {
                state =  " Буду отдыхать.";
                System.out.println("Месяц " + i + ". Денег " + money + "." + state + " Потратил " + expenses + ", затем ещё -" + ((money-expenses) - ((money-expenses) / 3)));
                money = money - expenses;
                money = money / 3;
                counter += 1;
            }

        }
        return counter;  ///кол-во месяцев отдыха
    }


}
