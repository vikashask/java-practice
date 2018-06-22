package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//
public class Util {
	public static void main(String[] args) {
		Stream<Integer> source = Stream.of(4,5);
		List<Integer> target = new ArrayList<>(Arrays.asList(1, 2, 3));

		System.out.println(target);
		source.collect(Collectors.toCollection(() -> target));
		System.out.println(target);
	}
}
