
import java.util.Scanner;
//Madelyn Wang
//This program is a collection of methods that utilize loops to print out characters in rows
public class  Driver {
public static void main(String [] args) {
	 Scanner scan = new Scanner(System.in);
	 String input = scan.nextLine();
     stars(4);
 }
	public static void stars(int rows){
//  *
//	***
//	*****as

//	*******
//	*********
//	***********
//	*************
	int index = 1;
	int p = 1;
	while(index<=rows) {
		while(p<=13) {
			System.out.print("*");
		p=p+2;
		
		}
        System.out.println("");
		index++;
		
	}
}
	
	public static void triangle(int rows){
		int in = 1;
		while(in < 10) {
			
		}
	}
	
	public static void odds(int start){
		
		for(int i = 9; i>=1; i--) {
			
		}
	}
}



