
/*
Делим элементы первого массива на элементы второго массива и записываем в третий массив
ОБрабатываем исключения.
*/

public class DivElementsOfArrays {
    public static float[] DivElementArray(int[] firstArray, int[] secondArray) {
        try {
            if (ArraysEqual.Equal(firstArray, secondArray) == true) {
                float[] result = new float[firstArray.length];
                int[] result3 = new int[firstArray.length];
                for (int i = 0; i < firstArray.length; i++) {
                    result[i] = (float) firstArray[i] / (float) secondArray[i];
                    result3[i] = firstArray[i] / secondArray[i];
                }
                return result;
            }
            int[] result2 = new int[-2];
        } catch (NegativeArraySizeException e) {
            System.out.println("Массивы разной длины!");

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        return new float[0];
    }
}
