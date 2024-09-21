import edu.miu.cs425.ArrayFlattenerService;
import edu.miu.cs425.ArrayReversor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    @Test
    public void reverseArrayTest() {
        ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
        int[] arr = {1,3,0,4,5,9};
        when(arrayFlattenerService.flattenArray(any())).thenReturn(arr);
        ArrayReversor arrayReversor = new ArrayReversor(arrayFlattenerService);
        int[][] array2D = {
                {1, 3},
                {0},
                {4, 5, 9}
        };
        int[] expectedArray = {9, 5, 4, 0, 3, 1};
        int[] resultArray = arrayReversor.reverseArray(array2D);
        assertArrayEquals(expectedArray, resultArray);
        verify(arrayFlattenerService, times(1)).flattenArray(array2D);

    }

    @Test
    public void reverseArrayNullTest() {
        ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
        int[] arr = {1,3,0,4,5,9};
        when(arrayFlattenerService.flattenArray(any())).thenReturn(arr);
        ArrayReversor arrayReversor = new ArrayReversor(arrayFlattenerService);
        int[] resultArray = arrayReversor.reverseArray(null);
        verify(arrayFlattenerService, times(0)).flattenArray(null);
        assertNull(resultArray);
    }
}
