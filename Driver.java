
import java.util.Scanner;
//Madelyn Wang
//This program is a collection of methods that utilize loops to print out characters in rows
public class  Driver {
public static void main(String [] args) {
	 Scanner scan = new Scanner(System.in);
	 String input = scan.nextLine();
     odds(9);
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

    while(index<rows){
        index++;
    }
	
  
}

	
	public static void triangle(int rows){
		int in = 1;
		while(in < 10) {
			
		}
	}
	
	public static void odds(int start){
		
		for(int i = 9; i>=1; i-=2) {
			System.out.print(i);
            for(int j = 0; j<= start; j++){
               System.out.print(i);
            }
            start = start -2;
		}
	}
}



