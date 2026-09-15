/* Q1:Create a HashMap containing the frequency of every number.

import java.util.HashMap;
import java.util.Map;

public class Day3{
    public static void main(String[] args){
        HashMap <Integer, Integer> map = new HashMap<>();

        int[] arr = {1, 2, 1, 3, 5, 6};

        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
} */








/* //Q2 — Character Frequency
import java.util.HashMap;
import java.util.Map;

public class Day3{
    public static void main(String[] args){
        HashMap <Character, Integer> map = new HashMap<>();
        String s = "programming";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        
    }
} */




/* //Q3 — First Unique Character
import java.util.HashMap;
import java.util.Map;

public class Day3{
    public static void main(String[] args){
        HashMap <Character, Integer> map = new HashMap<>();
        String s = "aabbcddee";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }
} */







/* //Q4: Linear Search
public class Day3{
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] agrs){
        int[] arr = {12,23,42,14,11,67};

        int index = linearSearch(arr, 11);
        System.out.println(index);

    }
} */




/* //Q5 — Binary Search
public class Day3{

    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        for(int i = 0; i < arr.length; i++){ 
            
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid] ){
                right = mid - 1;
            }else if(target > arr[mid]){
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int index = binarySearch(arr, 8);
        System.out.println(index);
    }
} */






/* //Q6:bubbleSort
import java.util.Arrays;
public class Day3{

    static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {12,23,42,14,11,67};

        int[] sortedArray = bubbleSort(arr);

        System.out.print(Arrays.toString(sortedArray));
    
    }
} */






/* //Q7 — Selection Sort
import java.util.Arrays;
public class Day3{
    static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        int[] sortedArray = selectionSort(arr);

        System.out.print(Arrays.toString(sortedArray));
    }
} */




/* //Q8:Find the frequency of 2 using a HashMap. Then find its frequency without a HashMap. Compare the two approaches.
//Given: [4, 2, 7, 2, 9, 2]
import java.util.HashMap;
import java.util.Scanner;

public class Day3{
    public static void main(String[] args){
        //HashMap <Integer, Integer> freq = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        System.out.print(freq.get(2));

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                count++;
            }
        }
        System.out.println(count);
    }
} */






//Q9:Given a sorted array: [2, 5, 8, 12, 16, 23, 38, 56, 72]
//Find 23 using binary search. Write down the values of:
//left, right, mid at every iteration.

public class Day3{

    static int findElement(int[] arr, int target){
        int left = 0; 
        int right = arr.length - 1; 

        
        
        for(int i = 0; i < arr.length; i++){
            int mid = left + (right - left) / 2;
            System.out.println(
                    "left = " + left +
                    ", right = " + right +
                    ", mid = " + mid
                );

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else if(arr[mid] > target){
                right = mid - 1;
            }
        }
        
        return -1;
    }


    public static void main(String[] args){

        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72};
        
        int result = findElement(arr, 23);

        System.out.println(result);
    }
}


