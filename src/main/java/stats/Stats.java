
package stats;

import java.util.Arrays;

/**
 * Stores numbers and calculates basic statistics.
 *
 * @author Adhip
 */
public class Stats {

	private int[] numbers;
	private int count;

	/**
	 * Creates a Stats object with the specified capacity.
	 *
	 * @param capacity maximum number of values to store
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}

	/**
	 * Adds a value to the statistics.
	 *
	 * @param value the number to add
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * Returns the number of values added.
	 *
	 * @return the number of added values
	 */
	public int getCount() {
		return this.count;
	}

	/**
	 * Returns the highest added value.
	 *
	 * @return the maximum value
	 * @throws IllegalStateException if no values have been added
	 */
	public int getMax() {
		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}

		int max = numbers[0];

		for (int i = 1; i < count; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		return max;
	}

	/**
	 * Returns the lowest added value.
	 *
	 * @return the minimum value
	 * @throws IllegalStateException if no values have been added
	 */
	public int getMin() {
		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}

		int min = numbers[0];

		for (int i = 1; i < count; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		return min;
	}

	/**
	 * Returns the sum of all added values.
	 *
	 * @return the total of added values
	 */
	public int getTotal() {
		int total = 0;

		for (int i = 0; i < count; i++) {
			total += numbers[i];
		}

		return total;
	}

	/**
	 * Returns the average of all added values.
	 *
	 * @return the average value
	 * @throws IllegalStateException if no values have been added
	 */
	public double getAverage() {
		if (count == 0) {
			throw new IllegalStateException("No values have been added");
		}

		return getTotal() / (double) count;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
}
