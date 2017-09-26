//package javaApplication;
//
//import java.util.Scanner;
//
//public class quiz {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("How many adults?: ");
//		double ad = scan.nextDouble();
//		System.out.print("How many children?: ");
//		double ch = scan.nextDouble();
//		double ac = ad*500;
//		double cc = ch*250;
//		System.out.printf("%.0f adults cost = %.0f*500 = %.2f\n",ad,ad,ac);
//		System.out.printf("%.0f children cost = %.0f*250 = %.2f\n",ch,ch,cc);
//        System.out.printf("Total cost is %.2f",(ac+cc));
//    }
//}

//package javaApplication;
//
//import java.util.Scanner;
//
//public class quiz {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("How many adults?: ");
//		double ad = scan.nextDouble();
//		System.out.print("How many children?: ");
//		double ch = scan.nextDouble();
//		System.out.print("Select a day (Su,Mo,Tu(25%),We(50%),Th,Fr,Sa): ");
//		String day = scan.next();		
//        switch(day) {
//        case "Tu":
//        	System.out.printf("%.0f adults cost = %.0f*375.00 = %.2f\n",ad,ad,ad*375);
//			System.out.printf("%.0f children cost = %.0f*185.50 = %.2f\n",ch,ch,ch*187.50);
//			System.out.printf("Total cost is %.2f",(ad*375)+(ch*187.50));
//		break;
//        case "We":
//        	System.out.printf("%.0f adults cost = %.0f*250.50 = %.2f\n",ad,ad,ad*250);
//			System.out.printf("%.0f children cost = %.0f*125.00 = %.2f\n",ch,ch,ch*125);
//			System.out.printf("Total cost is %.2f",(ad*250)+(ch*125));
//        break;
//        default:
//        	System.out.printf("%.0f adults cost = %.0f*500 = %.2f\n",ad,ad,ad*500);
//		    System.out.printf("%.0f children cost = %.0f*250 = %.2f\n",ch,ch,ch*250);
//		    System.out.printf("Total cost is %.2f",(ad*500)+(ch*250));
//        break;	
//        }
//
//    }
//}

package javaApplication;

import java.util.Scanner;

public class quiz {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a number : ");
//		int n = sc.nextInt();
//		int i = 1;
//		System.out.printf("Factors of %d are:\n",n);
//		for (; i <= n; i++) {
//			if (n%i == 0) {
//				System.out.println(i);
//			}
//		}
//		
//	}	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		

			System.out.print("Enter a number : ");
			int n = sc.nextInt();
			int i = 1;
			String w = "";
			System.out.printf("Factors of %d are:\n",n);
			for (; i <= n; i++) {
				if (n%i == 0) {
					System.out.println(i);
				}
			}
			while (!w.equals("Q")) {
			System.out.print("(A)gain or (Q)uit : ");
			w = sc.next();
			if (w.equals("Q")) {
				System.out.print("Bye Bye");
				break;	
			} else if (w.equals("A")){
				System.out.print("Enter a number : ");
				n = sc.nextInt();
				System.out.printf("Factors of %d are:\n",n);
				for (i = 1; i <= n; i++) {
					if (n%i == 0) {
						System.out.println(i);
					}
				}
			}
		}				
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);		
//
//			System.out.print("Enter a number : ");
//			int n = sc.nextInt();
//			int i = 1, p = 1, sum = 0;
//			String w = "";
//			System.out.printf("Factors of %d are:\n",n);
//			for (; i <= n; i++) {
//				if (n%i == 0) {
//					System.out.print(i);
//					for (; p <= i; p++) {
//						sum = sum+p;
//						if(sum == i+1){
//							System.out.println("<----Prime Number");
//						} 						
//					}					
//				}
//			}
//			while (!w.equals("Q")) {
//			System.out.print("(A)gain or (Q)uit : ");
//			w = sc.next();
//			if (w.equals("Q")) {
//				System.out.print("Bye Bye");
//				break;	
//			} else if (w.equals("A")){
//				System.out.print("Enter a number : ");
//				n = sc.nextInt();
//				System.out.printf("Factors of %d are:\n",n);
//				for (i = 1; i <= n; i++) {
//					if (n%i == 0) {
//						System.out.println(i);
//					}
//				}
//			}
//		}				
//	}


	
	
}