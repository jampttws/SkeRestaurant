package javaApplication;
//
//import java.util.Scanner;
//import java.util.Random;
//
//public class hwMethod {
//	public static int getTeddyFloor(String TeddyRoom) {
//		int tedFloor = 0;
//		if (TeddyRoom.equals("Lobby")) {
//			tedFloor = 1;
//		} else if (TeddyRoom.equals("Emergency Room")) {
//			tedFloor = 2;
//		} else if (TeddyRoom.equals("ICU")) {
//			tedFloor = 3;
//		} else if (TeddyRoom.equals("Pharmacy")) {
//			tedFloor = 4;
//		} else if (TeddyRoom.equals("Ward")) {
//			tedFloor = 5;
//		} else if (TeddyRoom.equals("Office")) {
//			tedFloor = 6;
//		}
//		return tedFloor;
//	}
//
//	public static int getNextFloor(String floorList, int i) {
//		return Integer.parseInt(floorList.substring(i, i + 1));
//	}
//
//	public static boolean isTeddyHere(int teddyFloor, int currentFloor) {
//		return teddyFloor == currentFloor;
//	}
//
//	public static boolean isFloorValid(int currentFloor) {
//		if (1 <= currentFloor && currentFloor <= 6) {
//			return true;
//		}
//		return false;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Please input room where Teddy is: ");
//		String TeddyRoom = sc.nextLine();
//		System.out.print("Please input list of searching floors: ");
//		String floorList = sc.nextLine();
//		boolean ted = false;
//		for (int i = 0; i < floorList.length(); i++) {
//			int crtFloor = getNextFloor(floorList, i);
//			int tdFloor = getTeddyFloor(TeddyRoom);
//			if (isTeddyHere(crtFloor, tdFloor)) {
//				System.out.printf("Congrats! Teddy is found on floor %d.\n", tdFloor);
//				ted = true;
//				break;
//			} else if (isFloorValid(crtFloor)) {
//				System.out.printf("Currently, you are on floor %d. Teddy is not here.\n", crtFloor);
//			} else {
//				System.out.printf("Invalid floor %d!\n", crtFloor);
//			}
//		}
//		if (!ted) {
//			System.out.printf("Teddy is on floor %d. Sorry, you miss him.\n",getTeddyFloor(TeddyRoom));
//		}
//	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//	    while (true) {
//	     int count = 0;	
//		 Random rand = new Random();
//	     int n = rand.nextInt(999) + 0;
//	     System.out.printf("Note: the random number is %d\n",n);
//	     while (true) {
//		   System.out.print("Guess a number (0-999):");
//		   int guess = sc.nextInt();
//		   count++;
//		   if (guess < n) {
//			   System.out.printf("Less than (Tries%d)\n",count);
//		   } else if (guess > n) {
//			   System.out.printf("More than (Tries%d)\n",count);
//		   } else if (guess == n) {
//			   System.out.println("Correct! Well done!");
//			   break;
//		   }
//	     }  
//		   System.out.printf("Total tries = %d\n",count); 
//		   System.out.println("-----------------------");
//		   System.out.print("(P)lay again, (Q)uit:");
//		   String pq = sc.next();
//		   if (pq.equalsIgnoreCase("q")){
//			   System.out.print("ByeBye");
//			   break;
//		   }
//	   } 	    
//	}
//	static String choice = "P";
//	
//	static boolean playGame(String x){
//		if(x.equals("P")) return true;
//		else return false;
//	}
//	public static void main(String[] args) {
//		
//		while(playGame(choice)){
//			
//		}
//	}
//	
//	
//}
import java.util.Scanner;

public class hwMethod {
	public static String mc = "";
	
	public static double total = 0;
	
	public static double change;
	
        public static void head(int h) {
	        System.out.println("============= Welcome to SKE Restaurant ===========");
    	        System.out.println("1.) Pizza                               250 Baht.");
    	        System.out.println("2.) Chickens                            120 Baht.");
    	        System.out.println("3.) Spaghetti                           150 Baht.");
    	        System.out.println("4.) Coke                                 45 Baht.");
    	        System.out.println("5.) Total");
    	        System.out.println("6.) Exit");
	}

	public static void menu(int pz,int ck,int sp,int coke) {
		int totalq = 0;
		double totalp = 0;
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
		System.out.println("   + ========================================== +");
		System.out.printf("   | %2d Items                      %12.2f |\n",totalq,totalp);
		System.out.println("   + ========================================== +");		
	}
	
	public static void outt(int pz,int ck,int sp,int coke) {
		int totalq = 0;
		double totalp = 0, cash = 0, mem = 0;
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
	
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int price = 0, ch = 0, qty = 0, pz = 0, ck = 0, coke = 0, sp = 0, h = 0;
    	head(h);
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
       	System.out.print("Do you have member card?: ");
       	mc = sc.next();
       	outt(pz,ck,sp,coke);
       	System.out.println(" ");
       	System.out.print("Input your cash: ");
       	double cash = sc.nextDouble();
       	double chnge = Math.floor(cash-total);
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

}
