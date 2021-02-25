package com.kctechasses2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class Asses6 {

	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		HashSet<Integer> uniqueValues = new HashSet<>(numbers);
		IntStream.of(3, 2, 2, 3, 7, 3, 5)
    .distinct()
    .forEach(n -> System.out.println(n + "\t" +(int)Math.pow(n, 2)));
		}
	

	}


