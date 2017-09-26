package javaApplication;

import java.util.Scanner;

public class Test {

    public static int total = 0;
    public static double change;

    public static void note(double size,double money) {
        System.out.println((int)size+"-baht banknotes = " + (int)(money/size));
        total += money/size;
        change = money%size;
}
    public static void coin(double size,double money) {
    	System.out.println((int)size+"-baht coins = " + (int)(money/size));
    	total += money/size;
        change = money%size;
}
    
    public static void satang(double size,double money){
    	System.out.println((int)(size*100)+"-satang coins = " + (int)(money/size));
    	money = money-Math.floor(money);
    	total += money/size;
    	change = money%size;   	
    	
}
    
    
    
              public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Input change: ");
                    double initial = scan.nextDouble();
                    change = initial;
//                    double satang = intitial%

                    note(1000,change);
                    note(500,change);
                    note(100,change);
                    note(50,change);
                    note(20,change);
                    coin(10,change);
                    coin(5,change);
                    coin(2,change);
                    coin(1,change);
//                    System.out.print(change);
                    satang(.50,change);
                    satang(.25,change);
                    System.out.print("Total number of banknotes and coins = "+total);
                    
                    

            		
                    
                    
            }
}