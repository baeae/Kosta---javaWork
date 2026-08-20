package ex0730.report;

public class Star {

	public static void main(String[] args) {
		/*
		for(int s = 1; s <= 5; s++) {

			for(int st = 1; st <= 5; st++) {
				if(s == 1 && st == 2) break;
				else if(s == 2 && st == 3) break;
				else if(s == 3 && st == 4) break;
				else if(s == 4 && st == 5) break;
				System.out.print("★");
				
				}// 이중 forEnd
				System.out.println();
			}// forEnd
			*/
		for (int s = 1; s <= 5; s++) {
		    for (int st = 1; st <= s; st++) {   
		        System.out.print("★");
		    }// 이중 for end
		    System.out.println();
		}// for end
		
			System.out.println("*************************");
			
			int s = 5;
			while (s >= 1) {
			    int st = 1;
			    while (st <= s) {   
			        System.out.print("★");
			        st++;
			    }// 이중 while end
			    System.out.println();
			    s--;
			}// while end
			
			
			/*
			int s = 1;
			while(s <= 5) {
				
				int st = 1;
				while(st <= 5) {
					if( s == 2 && st == 5) break;
					else if(s == 3 && st == 4) break;
					else if(s == 4 && st == 3) break;
					else if(s == 5 && st == 2 ) break;
					System.out.print("★");
				
					st++;
				}// 이중 while end
				
				System.out.println();
				
				s++;
			 
			}// while end
			*/
			 
			
			
		}// mainEnd

	}// classEnd


