package com.app.poc.netcracker.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class BestPracticeTest {

	public static void main(String[] args) {

		String originalStr = "BheemRao is employee of Cordis company, BHEEMRAO is from Bangalore, BHEEMRAO! is good in java.";

		//originalStr = originalStr.replaceAll(",", "").replaceAll("!", "").replaceAll("\\.", "");
		originalStr = originalStr.replaceAll("[^a-zA-Z\\s]", "");
		
		System.out.println(originalStr);

		String givenStr[] = originalStr.split(" ");

		List<String> list = new ArrayList<>();

		Map<String, String> tempMap = new HashMap<>();
		Map<String, Integer> map = new HashMap<>();

		for (String str : givenStr) {

			list.add(str.toLowerCase());

			if (!tempMap.containsKey(str.toLowerCase()))
				tempMap.put(str.toLowerCase(), str);

			if (map.containsKey(str.toLowerCase())) {

				map.put(str.toLowerCase(), map.get(str.toLowerCase()) + 1);

			} else {

				map.put(str.toLowerCase(), Integer.parseInt("1"));

			}

		}

		final Integer maxFreq = map.values().stream().mapToInt(i -> i).max().getAsInt();

		System.out.println("max freq : " + maxFreq);

		Predicate<String> pred = i -> Collections.frequency(list, i) >= maxFreq;

		list.stream().filter(pred).distinct().forEach(str -> {

			System.out.println(tempMap.get(str) + " - " + maxFreq);

		});

	}

}

/*
 * 
 * Find most frequently occurring word(s) along with its frequency in given
 * statement Example Input:
 * "BheemRao is employee of Cordis company, BHEEMRAO is from Bangalore, BHEEMRAO! is good in java."
 * Output: BheemRao - 3 is - 3
 * 
 */