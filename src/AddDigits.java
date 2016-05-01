import java.util.Scanner;

/*
 *  Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it. 
 */
public class AddDigits {
	private Scanner in;
	public static void main (String [] args){
		AddDigits ad = new AddDigits();
		int input = ad.getInput(); 
		System.out.println(ad.addingDigits(input));
			
	}
	
	private int getInput(){
		int temp = 0;
		in = new Scanner (System.in);
		try{			
			temp = Integer.parseInt(in.nextLine());			
		}catch (NumberFormatException e){			 
			System.out.println(e.getMessage());			
		} 			
		return temp;		
	}
	private int addingDigits(int input) {
		 int output = 0;
		 while (input>0){
			 output += input%10;    
			 output = (output % 10 + output / 10);
			 input /=10;
			 System.out.println(input);
		 }
		 // One line code with no loop
		 /*
		  *     if (num == 0) {
            return 0;
        }
        return (num - 1) % 9 + 1;
    }
		  */
		
		return output;
	}

}
