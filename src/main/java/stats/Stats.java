
package stats;

import java.util.Arrays;

public class Stats {

	private int[] numbers;
	private int count;

	public Stats(int capacity) {
		numbers = new int[capacity];
	}

	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	public int getCount() {
		return this.count;
	}

	public int getMax() {
		int max = numbers[0];

		for (int i = 1; i < count; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		return max;
	}

	public int getMin() {
		int min = numbers[0];

		for (int i = 1; i < count; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		return min;
	}

	public int getTotal() {
		int total = 0;

		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}

		return total;
	}

	public double getAverage() {
		int total = getTotal();

		return total / (double) count;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
}
