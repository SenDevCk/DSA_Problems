package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from module Problems!");
        //new Problem1().swap(5, 6);
        //lProblem2 problem2=new Problem2();
//        long value=problem2.convertToBinary(45);
//        System.out.println("Converted binary number = "+value);
//        
//        long value2=problem2.convertToBinary2(45);
//        System.out.println("Converted binary number = "+value2);
       // problem2.desimalConverter();
        Problem4 prob4= new Problem4();
        int[] arr= {1,2,3,4,5,6};
        int[] arr2= {9,2,7,4,-5,6};
        prob4.subArray(arr2);
//        long sum=prob4.maxSubarraySum(arr, arr.length);
//        System.out.println("Final Subarray Sum= "+sum);
        long sum=prob4.kedanesAlgoSubarraySum(arr2, arr2.length);
        System.out.println("Final Subarray Sum= "+sum);
    }
}
