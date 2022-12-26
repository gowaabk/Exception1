
/*
 * Метод, принимает два целочисленных массива,
 * и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * 
 */

public class ArraysDiff {
    public static int[] ArrayDifference(int[] firstArray, int[] secondArray) {
        try {
            if (ArraysEqual.Equal(firstArray, secondArray)) {
                int[] result = new int[firstArray.length];
                for (int i = 0; i < result.length; i++) {
                    result[i] = firstArray[i] - secondArray[i];
                }
                return result;
            }
            int[] result2 = new int[-1];

        } catch (RuntimeException e) {
            System.out.println("Массивы разной длины!");
        }
        return null;
    }
}
