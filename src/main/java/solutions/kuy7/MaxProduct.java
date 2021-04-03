package solutions.kuy7;

public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        int _globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int _localMax = array[i] * array[i + 1];
            _globalMax = Math.max(_globalMax, _localMax);
        }
        return _globalMax;
    }
}
