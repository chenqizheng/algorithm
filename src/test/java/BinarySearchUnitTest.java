import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchUnitTest {
    @Test
    public void search() {
        int[] array = new int[]{1, 3, 4, 6, 7, 8};
        assertEquals(BinarySearch.search(array, 3), true);
        assertEquals(BinarySearch.search(array, 9), false);
        assertEquals(BinarySearch.search(array, 8), true);
        assertEquals(BinarySearch.search(array, 1), true);
    }
}
