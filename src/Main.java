import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solutions sol = new Solutions();
        //Fibonacci Series question starts
        System.out.println("Fibonacci Series question");
        ArrayList<Integer> output = sol.get_Fibonacci(25);
        System.out.print("Fibonacci Series is : ");
        for (int i = 0 ; i<output.size();i++){
            System.out.print(output.get(i)+" ");
        }
        //Fibonacci Series question ends
        //Palindrome question starts
        //part 1. String
        System.out.println("\n\nPalindrome question");
        String str = "madam";
        boolean ans = sol.checkPalindrome(str); //Case Sensitive
        if (ans){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        //part 2. Integer
        boolean ans2 = sol.checkPalindrome(1234321); //Case Sensitive
        if (ans2){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        //Palindrome question ends
        //prime question starts
        System.out.println("\nPrime Function");
        sol.primeSeries(5);
        //prime question ends
        //Armstrong Number question starts
        System.out.println("\n\nArmstrong Number Question");
        if (sol.checkArmstrong(371)){
            System.out.println("Is a Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
        //Armstrong Number question ends
        //Factorial question starts
        System.out.println("\n\nFactorial problem");
        int n = 4;
        System.out.println("Factorial of number "+n+" is : "+sol.calFactorial(n));
        //Factorial question ends
        //Reverse a String & Reverse an Array
        System.out.println("\nReverse String function : ");
        System.out.println(sol.reverseFunction("hello world!"));
        System.out.println("Reverse Array function");
        int[] arr={1,2,3,4,5};
        arr = sol.reverseFunction(arr);
        System.out.print("Reverse of array : ");
        for (int i:arr) {
            System.out.print(i+" ");
        }
        //Reverse a String & Reverse an Array ends
        //Remove duplicate from Integer & String array
        System.out.println("\nRemove duplicate from Integer & String array");
        System.out.println("Array : ");
        int[] arr_dup={1,2,3,4,5,2,3,4,8,9};
        System.out.println("Before deletion : "+Arrays.toString(arr_dup));
        sol.removeDuplicate(arr_dup);
        //string
        System.out.println("\nString");
        String str_d= "hello";
        System.out.println("String before deletion : "+str_d);
        sol.removeDuplicate(str_d);

    }
}
