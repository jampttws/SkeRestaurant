package javaApplication;

import java.util.Scanner;

public class SKErestaurantArray {
static Scanner sc = new Scanner(System.in);
		
	    static String mc = "";
		
	    static double total, totalp, cash, chnge, mem, change;
		
	    static int price = 0, ch = 0, qty = 0, h = 0, totalq = 0;
		
            static String[] menu = {"Pizza","Chickens","Spaghetti","Coke","Pad Thai"};
	    static double[] cost = {250, 120, 150, 45, 25}; 
	    static int[] quant = new int[menu.length];
		
	    public static void head(int h) {
		        System.out.println("============= Welcome to SKE Restaurant ===========");
		        for(int i = 0; i < menu.length; i++){
		        	System.out.printf("%d.) %-35s %5.0f Baht.\n",i+1,menu[i],cost[i]);
		        }
	    	        System.out.printf("%d.) Total\n",menu.length+1);
	    	        System.out.printf("%d.) Exit\n",menu.length+2);
		}
	    
	    public static void hmenu() {
	    	totalp = 0;
	    	totalq = 0;
	    	System.out.println("");
			System.out.println("   + ========================================== +");
			System.out.println("   |                SKE Restaurant              |");
			System.out.println("   + ================   =========   =========== +");
			System.out.println("   |       Menu            Qty         Price    |");	
			System.out.println("   + ================   =========   =========== +");
			
			double[] cst = new double[cost.length];
			
			for(int i = 0; i < menu.length; i++){
				cst[i] = quant[i]*cost[i];
				if(cst[i] > 1){
					System.out.printf("   | %-22s %5d  %12.2f |\n",menu[i],quant[i],cst[i]);
					totalp += cst[i];
				    totalq += quant[i];
				}
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
	    
	    static int[] money = {1000, 500, 100, 50, 20, 10, 5, 2, 1}; 
	    
	    public static void mchange(double mon) {
	       	System.out.println(" ");
	       	System.out.print("Input your cash: ");
	    	cash = sc.nextDouble();
	    	System.out.println(" ");
	       	chnge = Math.floor(cash-total);
	        System.out.printf("Change : %.2f\n",chnge);
	       	change = chnge;
	       	for(int i = 0; i < money.length; i++){
	       		if (i <= 4){
	       			note(money[i],change);
	       		} else {
	       			coin(money[i],change);
	       		}
	       	}
	        System.out.println("");
	        System.out.print("    ================= Thank you ================");
	    }
		
	    public static void loopMenu() {	    	
	    	while (true) {
	    		System.out.println(" ");
	       		System.out.print("Enter your Choice: ");
	    		ch = sc.nextInt();
	    		if (ch == menu.length+2) {
	    			break;
	    		} else if (ch == menu.length+1) {
	    			menu();
	    		} else {
	    			System.out.print("Enter Quantity: ");
	        		qty = sc.nextInt();
	        		if (ch >= 1 && ch <= menu.length){
	        			
	        		}
	        		quant[ch - 1] += qty;
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



