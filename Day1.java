/*Q1. Print numbers from 1 to N. 
import java.util.Scanner;

public class Day1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
} */



/*Q2. Print numbers from N to 1. 
import java.util.Scanner;

public class Day1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            System.out.println(i);
        }
    }
}

 */



/*Q3. Print all even numbers from 1 to N.
 import java.util.Scanner;

public class Day1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 2; i < n; i += 2){
            System.out.println(i);
        }
    }
} */




/* 
Q4. Find the sum of numbers from 1 to N.
import java.util.Scanner;

public class Day1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
} */





//Q5. Given N, calculate N!.
/* import java.util.Scanner; 

public class Day1{
    static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = factorial(n);
        System.out.println(result);
    }
} */





/* Q6. Count the number of digits in N.
import java.util.Scanner;

public class Day1{

    static int countDigit(int n){
        //Edge case
        if(n == 0){
            return 1;
        }

        int count = 0;
        while(n != 0){
            n = n / 10;
            count += 1;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = countDigit(n);
        System.err.println(result);
    }
} */




//Q7. Reverse a number.
import java.util.Scanner;

public class Day1{
    static int Reverse(int n){
        int rev = 0;
        int shrink = 0;
        while(n != 0){
            int Digit = n % 10;
            rev =(rev * 10) + Digit;

            n /= 10;
        }
        return rev;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = Reverse(n);
        System.out.println(result);
    }
}