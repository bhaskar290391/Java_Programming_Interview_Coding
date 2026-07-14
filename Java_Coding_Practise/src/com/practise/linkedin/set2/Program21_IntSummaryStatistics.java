package com.practise.linkedin.set2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Program21_IntSummaryStatistics {
	public static void main(String[] args) {


		int number[]= {3,6,8,5,97,56};
		
		IntSummaryStatistics summaryStatistics = IntStream.of(number).summaryStatistics();
		
		System.out.println("Count ==>"+ summaryStatistics.getCount());
		System.out.println("Sum ==> "+ summaryStatistics.getSum());
		System.out.println("average ==>"+summaryStatistics.getAverage());
		System.out.println("Max ==> "+ summaryStatistics.getMax());
		System.out.println("MIn ==> "+ summaryStatistics.getMin());
		
	}
}
