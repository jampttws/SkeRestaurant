package javaApplication;

import java.util.Scanner;
import java.math.*;

public class elab {
	// public static void main (String[] args) {
	// System.out.print("Ask not what your country ");
	// System.out.println("can do for you;");
	// System.out.println("ask what you can do for your country.");
	// System.out.println("");
	// System.out.print("-John F. Kennedy");
	// System.out.println(", the 35th U.S. President");

	// double x = 6.5438945, y = 172.31875, z = 1156.56148;
	// int a = 1090, b = 287;
	// String s = "computer";
	// System.out.printf("%-6d, %.2f",b,y);

	// double x = 3.0, y = 2.0;
	// int a = 10, b = 2;
	// System.out.println(4-2*5/2.5+1);

	Scanner scan = new Scanner(System.in);
	// System.out.print("Input #molecule: ");
	// int molecule = scan.nextInt();
	// System.out.print("Formula of "+molecule+" glucose molecules =
	// C"+(6*molecule)+"H"+(12*molecule)+"O"+(6*molecule));

	// System.out.print("Please enter your name: ");
	// String name = scan.nextLine();
	// System.out.printf("Hello Khun %s"+ name);

	// System.out.print("Enter dividend : ");
	// int dividend = scan.nextInt();
	// System.out.print("Enter divisor : ");
	// int divisor = scan.nextInt();
	// System.out.print("The quotient of "+ dividend + "/" + divisor + " is " +
	// (dividend/divisor) + " , and the remainder is " + (dividend%divisor) +
	// ".");

	// System.out.print("Input a: ");
	// double a = scan.nextDouble();
	// System.out.print("Input b: ");
	// double b = scan.nextDouble();
	// System.out.print("Input c: ");
	// double c = scan.nextDouble();
	// double au = a/Math.sqrt((a*a)+(b*b)+(c*c));
	// double bu = b/Math.sqrt((a*a)+(b*b)+(c*c));
	// double cu = c/Math.sqrt((a*a)+(b*b)+(c*c));
	// System.out.printf("Unit vector of (%.2fi, %.2fj, %.2fk)",a,b,c);
	// System.out.printf(" = (%.2fi, %.2fj, %.2fk)",au,bu,cu);

	// System.out.println("Input your hero stats:");
	// System.out.print("Strength: ");
	// double hstr = scan.nextDouble();
	// System.out.print("Agility: ");
	// double hagi = scan.nextDouble();
	// System.out.print("Intelligence: ");
	// double hint = scan.nextDouble();
	// double hd = ((hstr*hstr)+(hagi/Math.sqrt(3))+Math.sqrt(hint));
	// System.out.printf("Hero's damage = %.2f\n",hd);
	// double hhp = Math.ceil((hstr*hstr*hstr)*(hagi/hint));
	// System.out.printf("Hero's hp = %.0f\n",hhp);
	//
	// System.out.println("Input monster stats:");
	// System.out.print("Strength: ");
	// double mstr = scan.nextDouble();
	// System.out.print("Agility: ");
	// double magi = scan.nextDouble();
	// System.out.print("Intelligence: ");
	// double mint = scan.nextDouble();
	// double md = ((magi*mint)+Math.cbrt(2*mstr));
	// System.out.printf("Monster's damage = %.2f\n",md);
	// double mhp = Math.ceil((mstr*mstr*mstr)*(magi/mint));
	// System.out.printf("Monster's hp = %.0f",mhp);

	// System.out.print("Input change: ");
	// double money = scan.nextDouble();
	// double t = money/1000;
	// System.out.printf("1000-baht banknotes = %.0f\n",t);
	// double f = (money/500)-(money/1000);
	// System.out.printf("500-baht banknotes = %.0f\n",f);

	// System.out.print("Enter R: ");
	// double r = scan.nextDouble();
	// System.out.print("Enter G: ");
	// double g = scan.nextDouble();
	// System.out.print("Enter B: ");
	// double b = scan.nextDouble();
	// double w = Math.max(Math.max(r/255,g/255),b/255);
	// double c = (w-(r/255))/w;
	// double m = (w-(g/255))/w;
	// double y = (w-(b/255))/w;
	// double k = 1-w;
	// System.out.printf("Conversion result: C = %.2f, M = %.2f, Y = %.2f, K =
	// %.2f",c,m,y,k);

	// System.out.print("Input x1: ");
	// double xa = scan.nextDouble();
	// System.out.print("Input y1: ");
	// double ya = scan.nextDouble();
	// System.out.print("Input x2: ");
	// double xb = scan.nextDouble();
	// System.out.print("Input y2: ");
	// double yb = scan.nextDouble();
	// double xav = xa*(Math.PI/180);
	// double yav = ya*(Math.PI/180);
	// double xbv = xb*(Math.PI/180);
	// double ybv = yb*(Math.PI/180);
	// double d =
	// 6371*Math.acos((Math.sin(xav)*Math.sin(xbv))+(Math.cos(yav)*Math.cos(ybv)*Math.cos(yav-ybv)));
	// System.out.printf("Great circle distance between (%.3f,%.3f) and
	// (%.3f,%.3f) = %.3f kilometers.",xa,ya,xb,yb,d);

	// System.out.print("Input change: ");
	// double money = scan.nextDouble();
	// double ts = Math.floor(money/1000);
	// System.out.printf("1000-baht banknotes = %.0f\n",ts);
	// money = money%1000;
	// double fh = Math.floor(money/500);
	// System.out.printf("500-baht banknotes = %.0f\n",fh);
	// money = money%500;
	// double h = Math.floor(money/100);
	// System.out.printf("100-baht banknotes = %.0f\n",h);
	// money = money%100;
	// double ft = Math.floor(money/50);
	// System.out.printf("50-baht banknotes = %.0f\n",ft);
	// money = money%50;
	// double tw = Math.floor(money/20);
	// System.out.printf("20-baht banknotes = %.0f\n",tw);
	// money = money%20;
	// double t = Math.floor(money/10);
	// System.out.printf("10-baht coins = %.0f\n",t);
	// money = money%10;
	// double f = Math.floor(money/5);
	// System.out.printf("5-baht coins = %.0f\n",f);
	// money = money%5;
	// double o = Math.floor(money/1);
	// System.out.printf("1-baht coins = %.0f\n",o);
	// money = money%1;
	// money = money-Math.floor(money);
	// double pf = Math.floor(money/0.5);
	// System.out.printf("50-satang coins = %.0f\n",pf);
	// money = money%0.5;
	// double ptf = Math.floor(money/0.25);
	// System.out.printf("25-satang coins = %.0f\n",ptf);
	// double total = ts+fh+h+ft+tw+t+f+o+pf+ptf;
	// System.out.printf("Total number of banknotes and coins = %.0f",total);

	// System.out.print("Input change: ");
	// double money = scan.nextDouble();
	// int total = 0;
	// System.out.println("1000-banknotes = " + (int)Math.floor(money/1000));
	// total += Math.floor(money/1000);
	// money = money%1000;
	// System.out.println("500-baht banknotes = " + (int)Math.floor(money/500));
	// total += Math.floor(money/500);
	// money = money%500;
	// System.out.println("100-baht banknotes = " + (int)Math.floor(money/100));
	// total += Math.floor(money/100);
	// money = money%100;
	// System.out.println("50-baht banknotes = " + (int)Math.floor(money/50));
	// total += Math.floor(money/50);
	// money = money%50;
	// System.out.println("20-baht banknotes = " + (int)Math.floor(money/20));
	// total += Math.floor(money/20);
	// money = money%20;
	// System.out.println("10-baht coins = " + (int)Math.floor(money/10));
	// total += Math.floor(money/10);
	// money = money%10;
	// System.out.println("5-baht coins = " + (int)Math.floor(money/5));
	// total += Math.floor(money/5);
	// money = money%5;
	// System.out.println("1-baht coins = " + (int)Math.floor(money/1));
	// total += Math.floor(money/1);
	// money = money%1;
	// System.out.println("50-satang coins = " + (int)Math.floor(money/0.5));
	// total += Math.floor(money/0.5);
	// money = money%0.5;
	// System.out.println("25-satang coins = " + (int)Math.floor(money/0.25));
	// total += Math.floor(money/0.25);
	// money = money%0.25;
	// System.out.print("Total number of banknotes and coins = "+total);

	// System.out.print("Enter a dividend A = ");
	// int a = scan.nextInt();
	// System.out.print("Enter a divisor B = ");
	// int b = scan.nextInt();
	// if(a%b==0) {
	// System.out.print(a+" IS divisible by "+b);
	// }
	// else {
	// System.out.print(a+" IS NOT divisible by "+b);
	// }

	// System.out.print("Input weight: ");
	// double weight = scan.nextDouble();
	// System.out.print("Input height: ");
	// double height = scan.nextDouble();
	// double bmi = weight/(height*height);
	// if(bmi > 23.4) {
	// System.out.printf("Your BMI is %.2f => Overweight",bmi);
	// }
	// else if(bmi < 18.5) {
	// System.out.printf("Your BMI is %.2f => Underweight",bmi);
	// }
	// else {
	// System.out.printf("Your BMI is %.2f => Normalweight",bmi);
	// }

	// System.out.print("Input your status: ");
	// String status = scan.nextLine();
	// if (status.equals("Staff")) {
	// System.out.print("How many hour? ");
	// int hr = scan.nextInt();
	// System.out.print("You have to pay "+(10*hr)+" Baht.");
	// }
	// else if (status.equals("Student")) {
	// System.out.print("How many hour? ");
	// int hr = scan.nextInt();
	// System.out.print("You have to pay "+(20*hr)+" Baht.");
	// }
	// else if (status.equals("Parent")) {
	// System.out.print("How many hour? ");
	// int hr = scan.nextInt();
	// System.out.print("You have to pay "+(30*hr)+" Baht.");
	// }
	// else {
	// System.out.print("How many hour? ");
	// int hr = scan.nextInt();
	// System.out.print("You have to pay "+(50*hr)+" Baht.");
	// }

	// System.out.print("Please input X: ");
	// int x = scan.nextInt();
	// System.out.print("Please input Y: ");
	// int y = scan.nextInt();
	// if (x == 0 && y == 0) {
	// System.out.print("The point is at the origin.");
	// }
	// else if (x == 0) {
	// System.out.print("The point is on the Y axis.");
	// }
	// else if (y == 0) {
	// System.out.print("The point is on the X axis.");
	// }
	// else if (x > 0 && y > 0){
	// System.out.print("The point is in Q1.");
	// }
	// else if (x > 0 && y < 0){
	// System.out.print("The point is in Q4.");
	// }
	// else if (x < 0 && y > 0){
	// System.out.print("The point is in Q2.");
	// }
	// else if (x < 0 && y < 0){
	// System.out.print("The point is in Q3.");
	// }

	// System.out.print("What is your grade? ");
	// char grade = scan.next().charAt(0);
	//
	// switch (grade) {
	// case 'A' :
	// System.out.print("Congratulations!");
	// break;
	// case 'B' :
	// System.out.print("Very good!");
	// break;
	// case 'C' :
	// System.out.print("Do better next time.");
	// break;
	// case 'D' :
	// System.out.print("Study harder!");
	// break;
	// case 'F' :
	// System.out.print("FAIL :(");
	// default :
	// System.out.print("What grade is that o_O?");
	// }

	// System.out.print("Please input x: ");
	// double x = scan.nextInt();
	// double fx1 = (2*x)+10;
	// double fx2 = (3*x*x);
	// double fx3 = (2*Math.pow(x, 3))-5;
	// if (x <= 15) {
	// System.out.printf("f(x): %.3f",fx1);
	// } else if (x > 35) {
	// System.out.printf("f(x): %.3f",fx3);
	// } else {
	// System.out.printf("f(x): %.3f",fx2);
	// }

	// System.out.print("Day: ");
	// int d = scan.nextInt();
	// System.out.print("Month: ");
	// int m = scan.nextInt();
	// System.out.print("Year: ");
	// int y = scan.nextInt();
	// System.out.printf("The date is %d/%d/%d\n",d,m,y);
	// if(y%4 == 0 && y%100 != 0)
	// {
	// System.out.printf("%d is leap year.\n",y);
	// if (m == 2) {
	// System.out.print((29-d)+" days left until next month.");
	// }
	// } else if(y%4 == 0 && y%100 == 0 && y%400 == 0){
	// System.out.printf("%d is leap year.\n",y);
	// if (m == 2) {
	// System.out.print((29-d)+" days left until next month.");
	// }
	// } else {
	// System.out.printf("%d is normal year.\n",y);
	// if (m == 2) {
	// System.out.print((28-d)+" days left until next month.");
	// }
	// }
	// switch (m) {
	// case (1) : case (3) : case (5) : case (7) : case (8) : case (10) : case
	// (12) :
	// System.out.print((31-d)+" days left until next month.");
	// break;
	// case (4) : case (6) : case (9) : case (11) :
	// System.out.print((30-d)+" days left until next month.");
	// break;
	//
	// }

	// System.out.print("Enter hour1: ");
	// int pass = 0;
	// String shr1 = scan.nextLine();
	// int hr1 = Integer.parseInt(shr1);
	// System.out.print("Enter minute1: ");
	// String smin1 = scan.nextLine();
	// int min1 = Integer.parseInt(smin1);
	// System.out.print("Enter hour2: ");
	// String shr2 = scan.nextLine();
	// int hr2 = Integer.parseInt(shr2);
	// System.out.print("Enter minute2: ");
	// String smin2 = scan.nextLine();
	// int min2 = Integer.parseInt(smin2);
	//
	// if (hr1 == hr2 && min1 > min2) {
	// pass = (24*60)-(min1-min2);
	// } else if (hr1 <= hr2) {
	// pass = ((hr2*60)+min2)-((hr1*60)+min1);
	// } else if (hr1 > hr2) {
	// pass = (((hr2+24)*60)+ min2)-((hr1*60)+min1);
	// }
	// System.out.printf("(%s:%s) to (%s:%s) Time passes %d
	// minutes.",shr1,smin1,shr2,smin2,pass);

	// System.out.print("Enter t-shirt size (small/medium/large): ");
	// int size = scan.nextInt();
	// switch (size) {
	// case (1):
	// System.out.print("small t-shirt costs 100 Baht.");
	// break;
	// case (2):
	// System.out.print("medium t-shirt costs 200 Baht.");
	// break;
	// case (3):
	// System.out.print("large t-shirt costs 300 Baht.");
	// break;
	// }

	// System.out.print("Input Number: ");
	// int input = scan.nextInt();
	// if (input%2 != 0) {
	// System.out.printf("%d is an odd number.",input);
	// } else if (input%2 == 0) {
	// System.out.printf("%d is an even number.\n",input);
	// if (input%3 == 0) {
	// System.out.printf("%d is also a multiple of 3.",input);
	// }
	// }

	// String str = "lab";
	// String str2 = "llab";
	// System.out.println(str.compareTo(str2));

//	static String bondString(String name, String surname) {
//		String fullname = name + " " + surname;
//		return fullname;
//	}
//
//	public static void main(String[] args) {
//		String myName = bondString("John", "Doe");
//		System.out.println(myName);
//	}

	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// System.out.print("Enter a phrase: ");
	// String p = sc.nextLine();
	// System.out.print("How many times?: ");
	// int t = sc.nextInt();
	// for (int i = 1; i <= t; i++) {
	// System.out.println(i+". " + p);
	// }

	// public static double computeTrianglePerimeter(double first, double
	// second, double opposite) {
	// opposite = Math.sqrt((first*first)+(second*second));
	// System.out.printf("Perimeter of triangle = %.2f",opposite+first+second);
	// return opposite;
	// }
	//
	// public static void main(String[] arg){
	// Scanner sc = new Scanner(System.in);
	// System.out.print("Enter first side: ");
	// double first = sc.nextDouble();
	// System.out.print("Enter second side: ");
	// double second = sc.nextDouble();
	// double opposite = Math.sqrt((first*first)+(second*second));
	// computeTrianglePerimeter(first,second,opposite);
	// }

	// public static int price(String course,String first) {
	// int price = 0;
	// if(course.equals("Yoga")) {
	// price = 3000;
	// if (first.equals("y")) {
	// price -= 200;
	// }
	// } else if (course.equals("Aerobic")) {
	// price = 4000;
	// if(first.equals("y")) {
	// price -= 200;
	// }
	// }
	// return price;
	// }
	//
	// public static void main(String[] arg) {
	// Scanner sc = new Scanner(System.in);
	// int price = 0;
	// String course, first;
	// while (true) {
	// System.out.print("Enter exercise class: ");
	// course = sc.nextLine();
	// if (course.equals("Done")) {
	// System.out.print("Done!");
	// break;
	// }
	// System.out.print("Is it your first time taking the class (y/n)? ");
	// first = sc.nextLine();
	// int payment = price(course, first);
	// System.out.printf("Your payment is %d Baht.\n", payment);
	//
	// }
	// }

	// public static void a(int x) {
	// x += 2;
	// x += c();
	// System.out.printf("x = %d in a\n", x);
	// }
	//
	// public static int b(int y) {
	// y = c() * y;
	// System.out.printf("y = %d in b\n", y);
	// return y;
	// }
	//
	// public static int c() {
	// int x = 3;
	// System.out.printf("x = %d in c\n", x);
	// return x + 2;
	// }
	//
	// public static int d(int y) {
	// y += 5;
	// y = b(y);
	// b(y);
	// System.out.printf("y = %d in d\n", y);
	// return y;
	// }
	//
	// public static void main(String[] args) {
	// int x = 3, y = 0;
	// a(x);
	// y = d(y);
	// System.out.printf("x = %d, y = %d in main", x, y);
	// }

	// public static double convertBitToByte(int bit) {
	// double Byte = bit/8;
	// System.out.printf("%d bits = %.10f Byte\n",bit,Byte);
	// return bit;
	// }
	//
	// public static double convertBitToKB(int bit) {
	// double kb = (bit/8)/Math.pow(2,10);
	// System.out.printf("%d bits = %.10f KB\n",bit,kb);
	// return bit;
	// }
	//
	// public static double convertBitToMB(int bit) {
	// double mb = (bit/8)/Math.pow(2,20);
	// System.out.printf("%d bits = %.10f MB\n",bit,mb);
	// return bit;
	// }
	//
	// public static double convertBitToGB(int bit) {
	// double gb = (bit/8)/Math.pow(2,30);
	// System.out.printf("%d bits = %.10f GB\n",bit,gb);
	// return bit;
	// }
	//
	// public static double convertBitToTB(int bit) {
	// double tb = (bit/8)/Math.pow(2,40);
	// System.out.printf("%d bits = %.10f TB\n",bit,tb);
	// return bit;
	// }
	//
	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	// System.out.println("Welcome to conversion program");
	//
	// System.out.print("Input file size (bits): ");
	// int bit = sc.nextInt();
	// System.out.println("Which unit of your choice?");
	// System.out.println("1. Byte");
	// System.out.println("2. Kilobyte(KB)");
	// System.out.println("3. Megabyte(MB)");
	// System.out.println("4. Gigabyte(GB)");
	// System.out.println("5. Terabyte(TB)");
	// System.out.print("Input your choice: ");
	// String ch = sc.next();
	//
	// switch (ch) {
	// case "1":
	// convertBitToByte(bit);
	// break;
	// case "2":
	// convertBitToKB(bit);
	// break;
	// case "3":
	// convertBitToMB(bit);
	// break;
	// case "4":
	// convertBitToGB(bit);
	// break;
	// case "5":
	// convertBitToTB(bit);
	// break;
	// default :
	// System.out.println("Invalid command!");
	// break;
	// }
	// System.out.print("Thank you for using conversion program.");
	// }

	// static double plus(double x,double y) {
	// double plus = x + y;
	// System.out.printf("%.0f+%.0f = %.0f\n",x,y,plus);
	// return plus;
	// }
	//
	// static double minus(double x,double y) {
	// double minus = x - y;
	// System.out.printf("%.0f-%.0f = %.0f\n",x,y,minus);
	// return minus;
	// }
	//
	// static double mul(double x,double y) {
	// double mul = x*y;
	// System.out.printf("%.0f*%.0f = %.0f\n",x,y,mul);
	// return mul;
	// }
	//
	// static double div(double x,double y) {
	// double div = x/y;
	// System.out.printf("%.0f/%.0f = %.0f\n",x,y,div);
	// return div;
	// }
	//
	// public static void main(String[] args){
	// Scanner sc = new Scanner(System.in);
	// while (true) {
	// System.out.print("Select operation ( + , - , * , / ) or (q)uit: ");
	// String op = sc.next();
	// double x = 0,y = 0;
	//
	// if(op.equals("q")){
	// System.out.print("Bye!");
	// break;
	// } else if (op.equals("+")) {
	// System.out.print("Enter x: ");
	// x = sc.nextDouble();
	// System.out.print("Enter y: ");
	// y = sc.nextDouble();
	// plus(x,y);
	// } else if (op.equals("-")) {
	// System.out.print("Enter x: ");
	// x = sc.nextDouble();
	// System.out.print("Enter y: ");
	// y = sc.nextDouble();
	// minus(x,y);
	// } else if (op.equals("*")) {
	// System.out.print("Enter x: ");
	// x = sc.nextDouble();
	// System.out.print("Enter y: ");
	// y = sc.nextDouble();
	// mul(x,y);
	// } else if (op.equals("/")) {
	// System.out.print("Enter x: ");
	// x = sc.nextDouble();
	// System.out.print("Enter y: ");
	// y = sc.nextDouble();
	// div(x,y);
	// }
	// }
	// }

	// public static double cal = 0;
	// public static double calculate(double x, String operation, double y) {
	// if (operation.equals("+")) {
	// cal = x+y;
	// System.out.printf("Present Value = %.4f\n",cal);
	// } else if (operation.equals("-")) {
	// cal = x-y;
	// System.out.printf("Present Value = %.4f\n",cal);
	// } else if (operation.equals("*")) {
	// cal = x*y;
	// System.out.printf("Present Value = %.4f\n",cal);
	// } else if (operation.equals("/")) {
	// cal = x/y;
	// System.out.printf("Present Value = %.4f\n",cal);
	// }
	// return cal;
	// }
	//
	// public static void main(String[] args) {
	// Scanner sc = new Scanner(System.in);
	//
	// System.out.print("Input initial Value : ");
	// double x = sc.nextDouble();
	// cal = x;
	// String operation = "";
	// while (true) {
	// System.out.println("");
	// System.out.print("Input Operator : ");
	// operation = sc.next();
	// if (!operation.equals("+") && !operation.equals("-") &&
	// !operation.equals("*") && !operation.equals("/")) {
	// break;
	// } else {
	// System.out.print("Input Number : ");
	// double y = sc.nextDouble();
	// calculate(x,operation,y);
	// x = cal;
	// }
	//
	// }
	// System.out.println(" ");
	// System.out.println("Finish Calculation.");
	// System.out.printf("End Value is %.4f",cal);
	// }

	// }
}
