package mangVaPhuongThucTrongJava.thuchanh;

public class findMin {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 85, 21, 3, 50};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
