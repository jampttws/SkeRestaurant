package javaApplication;
//
//import java.util.Scanner;
//import java.util.Random;
//

import java.util.Scanner;

public class restaurant {
	
    static String mc = "";
	
    static double total, totalp, cash, chnge, mem, change;
	
    static int price = 0, ch = 0, qty = 0, pz = 0, ck = 0, coke = 0, sp = 0, h = 0, totalq = 0;
	
    public static void head(int h) {
	        System.out.println("============= Welcome to SKE Restaurant ===========");
    	        System.out.println("1.) Pizza                               250 Baht.");
    	        System.out.println("2.) Chickens                            120 Baht.");
    	        System.out.println("3.) Spaghetti                           150 Baht.");
    	        System.out.println("4.) Coke                                 45 Baht.");
    	        System.out.println("5.) Total");
    	        System.out.println("6.) Exit");
	}
    
    public static void hmenu(int pz,int ck,int sp,int coke) {
    	System.out.println("");
		System.out.println("   + ========================================== +");
		System.out.println("   |                SKE Restaurant              |");
		System.out.println("   + ================   =========   =========== +");
		System.out.println("   |       Menu            Qty         Price    |");	
		System.out.println("   + ================   =========   =========== +");
		double pzz = pz*250;
		double ckk = ck*120;
		double spp = sp*150;
		double cok = coke*45;
		if (pzz > 1) {
		    System.out.printf("   | Pizza                  %5d  %12.2f |\n",pz,pzz);
		    totalp += pzz;
		    totalq += pz;
		} 
		if (ckk > 1) {
			System.out.printf("   | Chickens               %5d  %12.2f |\n",ck,ckk);
		    totalp += ckk;
		    totalq += ck;
		}
		if (spp > 1) {
			System.out.printf("   | Spaghetti              %5d  %12.2f |\n",sp,spp);
		    totalp += spp;
		    totalq += sp; 
		}
		if (cok > 1) {
			System.out.printf("   | Coke                   %5d  %12.2f |\n",coke,cok);
		    totalp += cok;
		    totalq += coke; 
		} 
    }

	public static void menu(int pz,int ck,int sp,int coke) {
		hmenu(pz,ck,sp,coke);
		System.out.println("   + ========================================== +");
		System.out.printf("   | %2d Items                      %12.2f |\n",totalq,totalp);
		System.out.println("   + ========================================== +");		
	}
	
	public static void outt(int pz,int ck,int sp,int coke) {
		
       	System.out.print("Do you have member card?: ");
       	mc = sc.next();
       	
       	hmenu(pz,ck,sp,coke);
       	
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
	
    public static void loopMenu() {
    	
    	while (true) {
    		System.out.println(" ");
       		System.out.print("Enter your Choice: ");
    		ch = sc.nextInt();
    		if (ch == 6) {
    			break;
    		} else if (ch == 5) {
    			menu(pz,ck,sp,coke);
    		} else {
    			System.out.print("Enter Quantity: ");
        		qty = sc.nextInt();
        		if (ch == 1) {
        			pz = pz + qty;
        		} else if (ch == 2) {        			
        			ck = ck + qty;
        		} else if (ch == 3) {
        			sp = sp + qty;
        		} else if (ch == 4) {
        			coke = coke + qty;
        		}
    		}    		
    	}
    }
    
    static Scanner sc = new Scanner(System.in);
    
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
	
    public static void main (String[] args) {   	
    	head(h);
       	loopMenu();
       	outt(pz,ck,sp,coke);
        mchange(cash);
    }	 
}
