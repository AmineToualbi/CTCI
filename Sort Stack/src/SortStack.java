import java.util.Stack;

/* Write a program to sort a stack such that the greatest items are on the top. 
 * You can use an addition temporary stack, but you may not copy the lements into any other data structure (such as an array). 
 */

public class SortStack{

	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> temp = new Stack<>(); 
		Stack<Integer> sol = new Stack<>(); 
		int t = 0;

		while(s.empty() == false) { 

			if(sol.empty() == true) {     //Push 1st element. 
				t = s.pop(); 
				sol.push(t); 
			}

			else { 

				if (s.peek() < sol.peek()) { 		//Case 1: Element in s is smaller than top of sol. 
					while(sol.empty() != true && s.peek() < sol.peek()) { 		//Push all elements greater than top of s from sol into temp stack to make spa
						t = sol.pop(); 
						temp.push(t); 
					}
					t = s.pop(); 			//Once we have space at right spot in sol for top of s, we push it into sol. 
					sol.push(t);
					if(temp.empty() == false) {		//If we added stuff to temp stack: 
						fill(sol, temp); 			//We put it back into sol. 
					}
				}
				
				else { 								//Case 2: Element in s is greated than top of sol. 
					t = s.pop(); 					//Simply push into sol. 
					sol.push(t); 
				}

			}

		}


		return sol;
	}

	public void fill(Stack<Integer> sol, Stack<Integer> temp) { 		//Empties temporary stack into sol. 

		while(temp.empty() == false) { 
			sol.push(temp.pop());
		}

	}
}