package javaApplication;
import java.util.Scanner;

public class banknote {

    
    public static double change;

    public static void note(double size,double money) {
        if ((int)(money/size) != 0) {
        	System.out.println((int)size+" notes: " + (int)(money/size));	
        } else if ((int)(money/size) == 0){
        	System.out.print("");
        }
        change = money%size;
}
    public static void coin(double size,double money) {
    	if ((int)(money/size) != 0) {
    		System.out.println((int)size+" coins: " + (int)(money/size));
    	} else if ((int)money/size == 0){
        	System.out.print("");
        }
        change = money%size;
}
    
     public static void satang(double size,double money){
     	if ((int)(money/size) != 0) {
     		System.out.println((int)(size*100)+" satang coins = " + (int)(money/size));
     	} else if ((int)(money/size) == 0){
         	System.out.print("");
         }
        	money = money-Math.floor(money);
     	change = money%size;   	
     	
 }
    
              public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Enter change: ");
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
                    satang(0.5,change);
                    satang(0.25,change);
              }

}

//    public static double change;
//
//    public static void note(double size,double money) {
//        if ((int)(money/size) != 0) {
//        	System.out.println((int)size+" notes: " + (int)(money/size));	
//        } else if ((int)(money/size) == 0){
//        	System.out.print("");
//        }
//        change = money%size;
//}
//    public static void coin(double size,double money) {
//    	if ((int)(money/size) != 0) {
//    		System.out.println((int)size+" coins: " + (int)(money/size));
//    	} else if ((int)money/size == 0){
//        	System.out.print("");
//        }
//        change = money%size;
//}
//           public static void main(String[] args) {
//                    Scanner scan = new Scanner(System.in);
//                    System.out.print("Enter change: ");
//                    double initial = scan.nextDouble();
//                    change = initial;
//
//                    note(1000,change);
//                    note(500,change);
//                    note(100,change);
//                    note(50,change);
//                    note(20,change);
//                    coin(10,change);
//                    coin(5,change);
//                    coin(2,change);
//                    coin(1,change);
//              }
//
//}

