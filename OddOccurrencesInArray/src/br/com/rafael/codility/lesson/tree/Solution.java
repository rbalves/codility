package br.com.rafael.codility.lesson.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] A) {
	    
        int[] noDuplicates = IntStream.of(A).distinct().toArray();
	Map<Integer, Integer> counter = new HashMap<Integer, Integer>();

	for (int value : noDuplicates) {
		counter.put(value, 0);
	}

	for (int value : A) {
		counter.put(value, counter.get(value) + 1);
	}

	for (Map.Entry<Integer, Integer> value : counter.entrySet()) {
		if (value.getValue() % 2 != 0)
			return value.getKey();
	}

	return 0;
    }
}
