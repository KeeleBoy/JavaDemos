package gcdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmPractice {

	public static void main(String[] args) {

		List<Integer> unsorted = new ArrayList<>(Arrays.asList(5, 7, 0, 1, 2, 9, 11, 25, 4, 22));

		System.out.println(sortList(unsorted));

		int[] arr = { 5, 7, 9, 2, 3, 5, 6, 1, 6, 8, 99, 21, 4343, 456, 21 };

		System.out.println(Arrays.toString(sortArray(arr)));

	}

	public static int[] sortArray(int[] arr) {

		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {

			int index = i;

			for (int j = i + 1; j < len; j++) {

				if (arr[j] < arr[index]) {
					index = j;
				}

			}

			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;

		}

		return arr;

	}

	public static List<Integer> sortList(List<Integer> list) {

		List<Integer> sorted = new ArrayList<>();

		while (!list.isEmpty()) {

			Integer min = list.get(0);

			for (int i = 0; i < list.size(); i++) {

				if (list.get(i) < min) {

					min = list.get(i);
				}

			}

			sorted.add(min);

			list.remove(min);

		}

		return sorted;
	}

}
