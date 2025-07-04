package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        //System.err.println("Hello from module Problems!");
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
        //int[] arr= {1,2,1,2,4,2,2,3,2,2,2};
       // Problem6 problem6=new Problem6();
       // Vector<Integer> result = problem6.brutForceApproch(arr,arr.length);
        //System.out.println("Result Mejority Element= "+result.toString());
        
       //int ans= new Problem7().power(5, 4);
       
       //System.out.println(ans);
//        int[] arr= {1,8,6,2,5,4,8,3,7};
//        int maxWater= new Problem8().maxWaterInContainerOptimal(arr, arr.length);
//        System.out.println("\n Max Water= "+maxWater);
        
//        int[]arr= {1,2,3,4};
//        Problem9 problem9=new Problem9();
//        List<Integer> product=problem9.productOfArray(arr, arr.length);
//        List<Integer> product2=problem9.productOfArrayWithOptimalApproach(arr, arr.length);
//        int[] product3=problem9.productOfArrayWithOptimalApproach2(arr, arr.length);
//        System.out.println("Result : "+product);
//        System.out.println("Result : "+product2);
//        Arrays.stream(product3).forEach(item->System.out.print(item+" "));
        
    //binary search
    	int[] arr= {5,7,6,9,37,25,15,16};
    	Arrays.sort(arr);
    	Problem10 problem10=new Problem10();
    	int result=problem10.binarySearchOptimization(arr, 9,arr.length);
    	System.err.println("\n Position in the shorted array : -> "+result+" **");
    }
    
}
