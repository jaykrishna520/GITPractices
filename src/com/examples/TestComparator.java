package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public TestComparator() {
		// TODO Auto-generated constructor stub
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<>();
		result.add(new Developer("Jaya", 10000, 31));
		result.add(new Developer("Srilatha", 70000, 29));
		result.add(new Developer("Ammu", 5000, 6));

		return result;
	}

	private static void beforeSorting(List<Developer> listDevs) {
		// TODO Auto-generated method stub
		for (Developer dev : listDevs) {

			System.out.println(dev);
		}

	}

	private static void ageSorting(List<Developer> listDevs) {
		// TODO Auto-generated method stub

//		Collections.sort(listDevs, new Comparator<Developer>() {
//
//			@Override
//			public int compare(Developer o1, Developer o2) {
//				// TODO Auto-generated method stub
//				return o1.getAge() - o2.getAge();
//			}
//		});
//		System.out.println("WithOut Lambda");
//		for (Developer dev : listDevs) {
//
//			System.out.println(dev);
//		}

		System.out.println("With Lambda");

		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());

		listDevs.forEach((test) -> System.out.println(test));

	}

	private static void nameSorting(List<Developer> listDevs) {
		// TODO Auto-generated method stub

		Collections.sort(listDevs, new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}

		});

		for (Developer dev : listDevs) {

			System.out.println(dev);
		}
		System.out.println("With Lambda");
		listDevs.sort((Developer o1, Developer o2)  ->  o1.getName().compareTo(o2.getName()));
		listDevs.forEach((name)-> System.out.println(name));

	}

	public static void main(String args[]) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sorting");
		beforeSorting(listDevs);
		System.out.println();

		System.out.println("Age Sorting");
		ageSorting(listDevs);

		System.out.println("Name Sorting");
		nameSorting(listDevs);

		System.out.println("Salary Sorting");
		Collections.sort(listDevs, new Comparator<Developer>() {

			@Override
			public int compare(Developer o1, Developer o2) {
				// TODO Auto-generated method stub
				if (o1.getSalary() == o2.getSalary()) {
					return 0;
				} else if (o1.getSalary() < o2.getSalary()) {
					return -1;
				} else {
					return 1;
				}
			}

		});

		for (Developer dev : listDevs) {

			System.out.println(dev);
		}

	}

}
