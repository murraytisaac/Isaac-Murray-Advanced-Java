import java.util.*;
public class Checks {
	Stack<Integer> stack = new Stack<Integer>();
	Scanner oScan = new Scanner(System.in);
	public boolean Checks() {
		System.out.println("Please enter an input: ");
	    int newExp = oScan.nextInt();
	    String[] exp = new String[newExp];
	    for (int i = 0; i < newExp; i++)
	    { 
		int ch = exp.length;
	      if (ch == '(' || ch == '[' || ch == '{')
	        stack.push(i);
	      else if (ch == ')'|| ch == ']' || ch == '}')
	      {
	        //nothing to match with
	        if(stack.isEmpty())
	        {  
	          return false;
	        }
	        else if(stack.pop() != ch)
	        { 
	          return false;
	        } 

	      }            
	    if (stack.isEmpty())
	    {
	      return true;
	    }
	    else
	    {
	      return false;
	    }
	  }
		return false;
	}
}
	
