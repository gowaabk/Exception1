import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] firstArray = { 7, 3, 7, 8 };
        int[] secondArray = { 1, 4, 9, 8 };

        System.out.println("1.1 Первый метод: ");
        Exception.NumberFormatException();

        System.out.println("1.2 Второй метод: ");
        Exception.StringIndex();

        System.out.println("1.3 Третий метод: ");
        Exception.NegativeArraySizeException();

        System.out.println("\n2. Массив, каждый элемент которого равен разности элементов массивов:");
        System.out.println(Arrays.toString(ArraysDiff.ArrayDifference(firstArray, secondArray)));

        System.out.println("\n3. Массив, каждый элемент которого равен частному элементов двух входящих массивов");
        System.out.println(Arrays.toString(DivElementsOfArrays.DivElementArray(firstArray, secondArray)));
    }

}