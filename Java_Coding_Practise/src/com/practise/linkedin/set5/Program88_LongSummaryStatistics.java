package com.practise.linkedin.set5;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class Program88_LongSummaryStatistics {

	public static void main(String[] args) {

		LongSummaryStatistics summaryStatistics = LongStream.of(27, 67, 565, 98, 9).summaryStatistics();

		System.out.println("Count ==> " + summaryStatistics.getCount());
		System.out.println("Sum ==> " + summaryStatistics.getSum());
		System.out.println("max ==> " + summaryStatistics.getMax());
		System.out.println("Min ==> " + summaryStatistics.getMin());
		System.out.println("Average ==> " + summaryStatistics.getAverage());
	}
}
