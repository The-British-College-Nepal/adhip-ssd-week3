
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
		return 0;
	}

	public int getMin() {
		return 0;
	}

	public int getTotal() {
		return 0;
	}

	public double getAverage() {
		return 0.0;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
}
