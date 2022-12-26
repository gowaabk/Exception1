/*
 *  Обработка исключений.
 */

public class Exception {

    public static void NumberFormatException() {
        String str = "bvbjhfggyh45464";
        try {
            System.out.println((Integer.parseInt(str)));
        } catch (NumberFormatException e) {
            System.out.println("Исключение: " + e);
        }
    }

    public static void StringIndex() {
        String str = "asdqweuyuyuyuy";
        try {
            System.out.println(str.charAt(-1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Исключение: " + e);
        }
    }

    public static void NegativeArraySizeException() {
        try {
            int[] array = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("Исключение: " + e);
        }
    }
}
