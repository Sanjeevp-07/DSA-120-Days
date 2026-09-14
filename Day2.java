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
Output:1 */

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
}