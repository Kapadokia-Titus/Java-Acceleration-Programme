package stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

	public static void main(String [] args) {
		Stack stack = new Stack(); 
		stack.push(23);
		stack.push(25);
		stack.push(27); 
		stack.push(29);
		
		
		System.out.println(stack.pop());
		stack.push(39);
		System.out.println(stack.pop());
		
	}
}
