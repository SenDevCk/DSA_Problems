package com.example;

import java.util.Vector;

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
       // Problem4 prob4= new Problem4();
        //int[] arr= {1,2,3,4,5,6};
        //int[] arr2= {9,2,7,4,-5,6};
       // prob4.subArray(arr2);
//        long sum=prob4.maxSubarraySum(arr, arr.length);
//        System.out.println("Final Subarray Sum= "+sum);
        //long sum=prob4.kedanesAlgoSubarraySum(arr2, arr2.length);
        //System.out.println("Final Subarray Sum= "+sum);
        //Problem5 problem5=new Problem5();
//        int[] arr3= {9,2,7,4,-5,6};
//        Vector<Integer> result= problem5.targetSumBrutForceApproch(arr3, 1);
//        System.out.println("Required Result");
//        System.out.print(result.toString());
//        int[] arr= {1,2,3,4,5,6};
//        Vector<Integer> result= problem5.targetSumEnhanced(arr, 11);
//        System.out.println("Required Result");
//        System.out.print(result.toString());
        int[] arr= {1,2,1,2,4,2,2,3,2,2,2};
        Problem6 problem6=new Problem6();
        Vector<Integer> result = problem6.brutForceApproch(arr,arr.length);
        System.out.println("Result Mejority Element= "+result.toString());
    }
    
}
