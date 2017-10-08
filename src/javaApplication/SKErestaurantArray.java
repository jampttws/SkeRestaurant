package javaApplication;

import java.util.Scanner;

public class SKErestaurantArray {

	    static Scanner sc = new Scanner(System.in);
		
	    static String mc = "";
		
	    static double total, totalp, cash, chnge, mem, change;
		
		static int price = 0, ch = 0, qty = 0, h = 0, totalq = 0;
		
		static int[] fd = {0,0,0,0};
		static String[] rec = {"Pizza","Chickens","Spaghetti","Coke","Total","Exit"};
		
	    public static void head(int h) {
		        System.out.println("============= Welcome to SKE Restaurant ===========");
	    	        System.out.printf("1.) %-35s 250 Baht.\n",rec[0]);
	    	        System.out.printf("2.) %-35s 120 Baht.\n",rec[1]);
	    	        System.out.printf("3.) %-35s 150 Baht.\n",rec[2]);
	    	        System.out.printf("4.) %-35s  45 Baht.\n",rec[3]);
	    	        System.out.printf("5.) %s\n",rec[4]);
	    	        System.out.printf("6.) %s\n",rec[5]);
		}
	    
	    public static void hmenu() {
	    	System.out.println("");
			System.out.println("   + ========================================== +");
			System.out.println("   |                SKE Restaurant              |");
			System.out.println("   + ================   =========   =========== +");
			System.out.println("   |       Menu            Qty         Price    |");	
			System.out.println("   + ================   =========   =========== +");
			
			double[]  cst = {fd[0]*250, fd[1]*120, fd[2]*150, fd[3]*45};
			
			if (cst[0] > 1) {
			    System.out.printf("   | %-22s %5d  %12.2f |\n",rec[0],fd[0],cst[0]);
			    totalp += cst[0];
			    totalq += fd[0];
			} 
			if (cst[1] > 1) {
				System.out.printf("   | %-22s %5d  %12.2f |\n",rec[1],fd[1],cst[1]);
			    totalp += cst[1];
			    totalq += fd[1];
			}
			if (cst[2] > 1) {
				System.out.printf("   | %-22s %5d  %12.2f |\n",rec[2],fd[2],cst[2]);
			    totalp += cst[2];
			    totalq += fd[2]; 
			}
			if (cst[3] > 1) {
				System.out.printf("   | %-22s %5d  %12.2f |\n",rec[3],fd[3],cst[3]);
			    totalp += cst[3];
			    totalq += fd[3]; 
			} 
	    }

		public static void menu() {
			hmenu();
			System.out.println("   + ========================================== +");
			System.out.printf("   | %2d Items                      %12.2f |\n",totalq,totalp);
			System.out.println("   + ========================================== +");		
		}
		
		public static void outt() {
			
	       	System.out.print("Do you have member card?: ");
	       	mc = sc.next();
	       	
	       	hmenu();
	       	
			System.out.println("   + ========================================== +");
			System.out.printf("   | %2d Items                      %12.2f |\n",totalq,totalp);
			double vat = totalp*7/100;
			System.out.printf("   | Vat 7%% include                %12.2f |\n",totalp+vat);
	        if (mc.equals("yes")) {
	        	mem = (totalp+vat)*10/100;
	        	total = totalp-mem;
	        	System.out.printf("   | Member Discount               %12.2f |\n",mem);
	        	System.out.printf("   | Total                         %12.2f |\n",total);
	        } else {
	        	total = totalp+vat;
	        	System.out.printf("   | Member Discount               %12.2f |\n",mem);
	        	System.out.printf("   | Total                         %12.2f |\n",totalp+vat);	
	        }
			
			System.out.println("   + ========================================== +");		
			
		}
		
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
	    
	    public static void mchange(double mon) {
	       	System.out.println(" ");
	       	System.out.print("Input your cash: ");
	    	cash = sc.nextDouble();
	    	System.out.println(" ");
	       	chnge = Math.floor(cash-total);
	        System.out.printf("Change : %.2f\n",chnge);
	       	change = chnge;
	        note(1000,change);
	        note(500,change);
	        note(100,change);
	        note(50,change);
	        note(20,change);
	        coin(10,change);
	        coin(5,change);
	        coin(2,change);
	        coin(1,change);
	        System.out.println("");
	        System.out.print("    ================= Thank you ================");
	    }
		
	    public static void loopMenu() {
	    	
	    	while (true) {
	    		System.out.println(" ");
	       		System.out.print("Enter your Choice: ");
	    		ch = sc.nextInt();
	    		if (ch == 6) {
	    			break;
	    		} else if (ch == 5) {
	    			menu();
	    		} else {
	    			System.out.print("Enter Quantity: ");
	        		qty = sc.nextInt();
	        		if (ch == 1) {
	        			fd[0] += qty;
	        		} else if (ch == 2) {        			
	        			fd[1] += qty;
	        		} else if (ch == 3) {
	        			fd[2] += qty;
	        		} else if (ch == 4) {
	        			fd[3] += qty;
	        		}
	    		}    		
	    	}
	    }
	    
	    public static void main (String[] args) {   	
	    	head(h);
	       	loopMenu();
	       	outt();
	        mchange(cash);
	    }	 
}



