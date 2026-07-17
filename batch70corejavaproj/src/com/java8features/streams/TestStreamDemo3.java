package com.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		List<Double> salaries = Arrays.asList(80000.00, 40000.00, 30000.00, 70000.00, 60000.00);
		List<Double> upSalaries = salaries.stream()
										  .map(d ->d +5000.00)
										  .filter(i->i>50000.00)
										  .sorted()
										  .collect(Collectors.toList());
		System.out.println(upSalaries);
		
		List<String> names = Arrays.asList("Manohar", "Amar","Vinod","Anil","Varshit","Srikanth","Kumar","Shareef", "Sai Teja", "Vinay");
		List<String> upNames = names.stream()
								  .map(name -> name + "-JFS71-Vcube")
								  .collect(Collectors.toList());
//		System.out.println(upNames);
//		upNames.forEach(name -> System.out.println(name));
		upNames.forEach(System.out::println);
		
		
	}
}
