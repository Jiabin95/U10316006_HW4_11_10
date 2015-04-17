import java.util.ArrayList;
import java.util.Scanner;
	
	public class Test{
	public static void main(String[] args){
	
	//New Object
	MyStack abc = new MyStack();
	//New Scanner 
	Scanner input = new Scanner(System.in); 
	//For loop
	for(int a=1; a<=5; a++){
	System.out.println("Enter the five strings: ");//input five strings

	String b = input.next();
	abc.push(b);
	}

	while(!abc.isEmpty()){
	System.out.println(abc.pop());
	}
}
}
