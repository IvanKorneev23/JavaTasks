public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 15");
        int[] arr = new int[] { 2, 4, 6 };
        System.out.println(isEven(arr));

        System.out.println("Задание 16");
        int[] arr2 = new int[] { 1, 3, 5 };
        int[] new2 = addToArray(arr2,10);
        for (int i = 0; i < new2.length; i++) {
            System.out.print(" " + new2[i]);
        }

        System.out.println("\nЗадание 9");
        int[] arrOne = {1,2};
        int[] arrTwo = {3,4};
        int[] result = concat(arrOne, arrTwo);
        for (int r : result) {
            System.out.print(" " + r);
        }
    }

    public static boolean isEven(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i + 1] - array[i]) % 2 == 0) {continue;}
            return false;
        }

        return true;
    }
    public static int[] addToArray(int[] array, int number) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = number;

        return newArray;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        int lenArrOne = arr1.length;
        int lenArrTwo = arr2.length;
        int[] result = new int[lenArrOne + lenArrTwo];

        for (int i = 0; i < lenArrOne; i++) {
            result [i] = arr1[i];
        }

        for (int i = 0; i < lenArrTwo; i++) {
            result[lenArrOne + i] = arr2[i];
        }

        return result;
    }
}
