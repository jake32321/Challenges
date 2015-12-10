/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetOne;

/**
 *
 * @author JacobReed
 */
public class SetOne {
/*
Checks to see if a number is divisible by either 3, 5,
or both.  The it prints Buzz, Fizz and FizzBuzz respectively
*/

/**
*@param none
*@return fizz, buzz, or fizzbuzz based on the divisibility of the number 
*/
public void FizzBuzz(){
	for(int i = 0; i <= 100; i++){
		if(i % 3 == 0 && i % 5 == 0)
			System.out.println("FizzBuzz");
		if(i % 5 == 0)
			System.out.println("Fizz");
		if(i % 3 == 0)
			System.out.println("Buzz");
	}
}
/*
Method checks to see if a string of (, ), {, }, [, and ]
fits the condition given in the problem.  If if does it 
returns a boolean value that says wether or not the string
fits the specific condition.
*/

/**
*@param str the given string input to test to see if it follows the given rule
*@return either true or false based on what the string the user entered
*/
public boolean Delimiter(String str){
	char[] stringArr = new char[str.length()];
        
        //Adds the characters from the string to a character array
	for(int i = 0; i < stringArr.length; i++){
		stringArr[i] = str.charAt(i);
	}
       
	int possitive = 0;
        
        //Checks the first charater in the string itself.
	if(str.startsWith("{") || str.startsWith("[") || str.startsWith("("))
		possitive = 1;

        //Checks to see what character the string ends with.
	if(str.endsWith("}") || str.endsWith("]") || str.endsWith(")")){
		possitive = 1;
		int middle = str.length()/2;
                
                //Checks the length of the given string 
                if(stringArr[0] == str.charAt(middle-1))
                    possitive = 0;
                
                /*
                Checks to see if the given input follows the rules 
                by checking the character in the index before and 
                after the character in the middle to see if it follows
                the rules.s
                */
                if(possitive == 1){
                    if(stringArr[middle] == '{'){
						if(stringArr[middle-1] == '}')
							return true;
						else if(stringArr[middle+1] == '{')
							return true;
                	}
                	if(stringArr[middle] == '('){
						if(stringArr[middle-1] == ')')
							return true;
						else if(stringArr[middle+1] == ')')
							return true;
                    }
                    if(stringArr[middle] == '['){
						if(stringArr[middle-1] == ']')
							return true;
						else if(stringArr[middle+1] == '[')
							return true;
                    }
                    if(stringArr[middle] == '}'){
                        if(stringArr[middle-1] == '{')
							return true;
						else if(stringArr[middle+1] == '}')
							return true;
                    }
                    if(stringArr[middle] == ')'){
						if(stringArr[middle-1] == ')')
							return true;
						else if(stringArr[middle+1] == '(')
							return true;
                    }
                    if(stringArr[middle] == ']'){
						if(stringArr[middle-1] == '[')
							return true;
						else if(stringArr[middle+1] == ']')
							return true;
                    }
               }
        }	
        else
            return false;
        return false;
}
//Recusrsively finds the fibonachi sequence of a given input

/**
*@param n the given integer 
*@return the fibonachi sequeence of the given input
*/
public int fibFinder(int n){
    //Returns 0 or 1 if that is the input since that is the fibonachi sequence
    if(n == 0)
		return 0; 
    if(n == 1)
		return 1;
    
    //Returns the fibonachi sequence for the provided answer
    else 
        return (fibFinder(n-1)+fibFinder(n-2));
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
