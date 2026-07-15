package com.practise.linkedin.set8;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Program145_SummaryStatisticForDouble {
	public static void main(String[] args) {

		List<Double> asList = Arrays.asList(57.9, 87.8, 56.89, 5.0, 98.8);
		DoubleSummaryStatistics summaryStatistics = asList.stream().mapToDouble(Double::doubleValue)
				.summaryStatistics();

		System.out.println(summaryStatistics.getAverage());
		System.out.println(summaryStatistics.getCount());
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getSum());
	}
}
