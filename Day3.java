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






//Q6:bubbleSort
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
}