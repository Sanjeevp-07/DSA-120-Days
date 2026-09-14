/* 
Q1:Take N integers and print all elements.
import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
} */

/* Q2:Find the sum of all elements
import java.util.Scanner;
public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i] ;
        }
        System.out.print(sum);
        
    }
} */

/* Q3:Find the maximum element.
import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max + " is a Largest Element");
    }
} */

/* Q4:Find the minimum element.
import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print(min + " is the minimum");
    }
} */

/* Q5:Count how many elements are even.
import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        int count = 0; 

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        System.out.print(count);
    }
} */

/* Q6:Count how many elements are greater than X.
import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        int target = 5;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > target){
                count++;
            }
        }
        System.out.print(count + " numbers are greater than 5");
    }
} */

/* Q7:Given an array and target X, print the index of the first occurrence.
If not found:-1
Example:
Array: 10 20 30 20 40
X = 20
Output:1

import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int target = 20;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.print(i);
                break;
            }
        }
    }
} */

/* Q9:Check whether the array is sorted in increasing order.
Example:
1 2 3 4 5 → true
1 3 2 4 5 → false

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i ++){
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        System.out.print(isSorted);
    }
} */




/* Q10:Reverse the array in-place. Don't create another array.
Example:
Input:1 2 3 4 5
Output:5 4 3 2 1
import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;


            left++;
            right--;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
} */





/* //Q11:Find the second largest element without sorting.
import java.util.Scanner;
public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.print(secondLargest + " is the Second largest element in the array");
    }
}  */






// Q12: Move all zeroes to the end while maintaining the order of non-zero elements
//Input:0 1 0 3 12
//Output:1 3 12 0 0
/* import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int insertPos = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                 arr[insertPos] = arr[i];
                 insertPos++;
            }
        }

        while(insertPos < arr.length){
            arr[insertPos] = 0;
            insertPos++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
} */







//String concept
//Q13;Count the number of vowels in a String.
/* import java.util.Scanner;

public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                count++;
            }
        }
        System.out.print(count + " vowels are in the string");


    }
} */



/* //Q14:Count uppercase and lowercase characters.
import java.util.Scanner;
public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int upperCount = 0;
        int lowerCount = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
            }
        }
        System.out.println("Uppercase characters: " + upperCount);
        System.out.println("Lowercase characters: " + lowerCount);
    }
} */







/* //Q15:Reverse a String.
import java.util.Scanner;
public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        
    }
} */







    
/* //Q16:Check whether a String is a palindrome.
import java.util.Scanner;
public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean palindrome = true;

        int left = 0;
        int right = str.length() - 1;
        
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                palindrome = false;
                break;
            }
            left++; 
            right--;
        }
        System.out.print(palindrome);
    }
} */







//Q16:Check whether a String is a palindrome.
import java.util.Scanner;
public class Day2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int target = 'e';
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == target){
                count++;
            }
        }
        System.out.print(count);
    }
}