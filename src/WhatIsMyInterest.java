public class WhatIsMyInterest {
    public static void calculateInterest(double amount, double percent){
        for(double i=percent;i<=10.0;i=i+0.25) {
            double interest = amount * (i * .01);

            System.out.println(interest);
        }

    }
    public static void main(String[] args){
        calculateInterest(100,7.5);
    }
}
