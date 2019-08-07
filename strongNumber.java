//STRONGN Strong Number (Special Numbers Series #2)

class StrongNumber {
    
    public static String isStrongNumber(int num) {
        
        if(factorial_sum(num) == num)
        return "STRONG!!!!";
    
        else 
        return "Not Strong !!";
    }
    
    //calculate factorial sum of digits in given number
    public static int factorial_sum(int num){
    int sum = 0;
    int temp = num;
    int counter = 0;

    //get number of digits	
    while (temp > 0) {
        temp /= 10;
        counter++;
    }

    temp = num;
    int digit;
    int[] digitArray = new int[counter];
    
    //get single digit and store it in array
    for (int i = 0; i < counter; i++) {
        digit = temp % 10;
        digitArray[i] = digit;     
        temp /= 10;
    }
    
    for (int n : digitArray) {
    sum = sum + factorial_digit(n);         
    }
    return sum;
     
}
    //calculate factorial for single digit
    public static int factorial_digit(int n){
    int factorial = 1;
    for(int i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }
}
