package MyProject.practise;

import java.util.Stack;

public class BalancedParanthesis {
	public boolean balanced(String s) {
		Stack<Character> input= new Stack<Character>();
		for(char ch:s.toCharArray()) {
			if (ch=='{'||ch=='['||ch=='(') {
				input.push(ch);
			}
					
			else if (ch=='}' && !input.isEmpty() && input.peek()=='{') {
			input.pop();
			}
			else if (ch==')' && !input.isEmpty() && input.peek()=='(' ){
				input.pop();
				}
			else if (ch==']' && !input.isEmpty() && input.peek()=='[' ){
				input.pop();
				}
			else {
				return false;
			}
				
	}
		return input.isEmpty();
	}
}
