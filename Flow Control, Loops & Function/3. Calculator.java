Given two numbers a and b; you need to perform basic mathematical operation on them. You will be provided an integer named as operator. 

If operator equals to 1 add a and b, then print the result.

If operator equals to 2 subtract b from a, then print the result.

If operator equals to 3 multiply a and b, then print the result.

If operator equals to any another number, print "Invalid Input"(without quotes).


Example 1:

Input:
a = 1
b = 2
operator = 3
Output: 
2
Explanation: 1 * 2 = 2

public static void utility(int a, int b, int operator){
    
   // int result;

   /* switch (operator) {
        
        case 1 :
        //result = a + b;
        System.out.println(a+b);
        break;
        
        case 2 :
       // result = a - b;
        System.out.println(a-b);
        break;
        
        case 3 :
        //result = a * b;
        System.out.println(a*b);
        break;
        
        default:
        System.out.println("Invalid Input");
            
    }*/
    
    if(operator == 1){
        System.out.print(a + b);
    }else if(operator == 2){
        System.out.print(a - b);
    }else if(operator == 3){
        System.out.print(a * b);
    }else{
        System.out.print("Invalid Input");
    }
    
    
}
