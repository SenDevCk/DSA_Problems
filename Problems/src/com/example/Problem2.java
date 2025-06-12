package com.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Problem2 {
	// binary converter
	public long convertToBinary(int number) {
		LocalDateTime time1 = LocalDateTime.now();
		long binaryNumber = 0;
		int remainder = 0;
		int i = 0;
		while (number != 0) {
			remainder = number % 2;
			binaryNumber += remainder * Math.pow(10, i);
			number /= 2;
			i++;
		}
		LocalDateTime time2 = LocalDateTime.now();
		System.out.println("Time taken : " + (Duration.between(time2, time1).getSeconds() * 1000));
		return binaryNumber;
	}

	// binary converter
	public long convertToBinary2(int number) {
		LocalDateTime time3 = LocalDateTime.now();
		long binaryNumber = 0;
		int remainder = 0;
		int i = 0;
		do {
			remainder = number % 2;
			binaryNumber += remainder * Math.pow(10, i);
			number = number / 2;
			i++;
		} while (number != 0);
		LocalDateTime time4 = LocalDateTime.now();
		System.out.println("Time taken : " + (Duration.between(time4, time3).getSeconds() * 1000));
		return binaryNumber;

	}

	// dismal converter
	public void desimalConverter() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter binary number");
		long binaryNumber=scanner.nextLong();
		char[] binaryChar=String.valueOf(binaryNumber).toCharArray();
		for(int i=0;i<String.valueOf(binaryNumber).length();i++) {
			if(binaryChar[i]!='0' && binaryChar[i]!='1') {
				System.out.println("Invalid binary number !");
				scanner.close();
				return;
			}
		}
		
		long remainder=0;
		int desimalNumber=0;
		int i=0;
		do {
			remainder=binaryNumber % 10;
			desimalNumber+=remainder*Math.pow(2, i);
			binaryNumber/=10;
			i++;
		}while(binaryNumber!=0);
		
		System.out.println("Converted desimal Number is "+desimalNumber);
		scanner.close();
		
	}
	
	//2's compliment
}
