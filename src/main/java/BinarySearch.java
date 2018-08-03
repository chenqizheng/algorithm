public class BinarySearch {
    public static boolean search(int[] array, int key) {
        if (array != null) {
            int left = 0;
            int right = array.length - 1;
            int mid;
            while (left <= right) {
                mid = (right + left) / 2;
                if (array[mid] > key) {
                    right = mid - 1;
                } else if (array[mid] < key) {
                    left = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
