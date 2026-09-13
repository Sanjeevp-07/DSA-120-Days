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

/* Q7. Reverse a number.
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
} */

/* Q8. Find the sum of digits.
import java.util.Scanner;
public class Day1{
    static int sumDigit(int n){
        int sum = 0;
        int temp = 0;

        while(n != 0){
            temp = n % 10;
            sum += temp;

            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = sumDigit(n);
        System.out.println(result);
    }
} */

/* Q9. Check whether a number is a palindrome.
import java.util.Scanner;

public class Day1{

    static boolean palindrome(int n){
        int temp = 0;
        int rev = 0;
        int original = n;

        while(n != 0){
            temp = n % 10;
            rev = (rev * 10) + temp;

            n /= 10;
        }
        if(original == rev){
            return true;
        }

        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean result = palindrome(n);
        System.out.println(result);
    }
} */

/* Q10.Print:

*
**
***
****
*****

public class Day1{
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++ ){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

/* Q11.Print:

*****
****
***
**
*
public class Day1{
    public static void main(String[] args){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

/* Q12.Print:

1
12
123
1234
12345

public class Day1{
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}  */




/* Q14.Print:
*****
*   *
*   *
*   *
*****

public class Day1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} */