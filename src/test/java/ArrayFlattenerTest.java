import edu.miu.cs425.ArrayFlattener;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFlattenerTest {
    @Test
    public void flattenArrayTest() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[][] array2DInput = {
                {1, 3},
                {0},
                {4, 5, 9}
        };

        int[] resultArray = arrayFlattener.flattenArray(array2DInput);
        int[] expectedArray = {1,3,0,4,5,9};
        assertArrayEquals(expectedArray, resultArray);
    }
    @Test
    public void flattenArrayNullTest() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[] resultArray = arrayFlattener.flattenArray(null);
        assertNull(resultArray);
    }
}
