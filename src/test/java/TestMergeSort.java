import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestMergeSort {

    @Test
    public void testIfarrayIsEmpty(){
        MergeSort mergeSort = new MergeSort();
        int[] array = {};
        assertThrows( EmptyException.class,()-> mergeSort.mergeSort( array, 0, 3) );
    }

    @Test
    public void testIfSortign(){
        MergeSort mergeSort = new MergeSort();
        int[] array = {4,5,31,-1};
        mergeSort.mergeSort( array, 0, 3);
        assertEquals( "-1 4 5 31 ", mergeSort.toString(array));

    }


}
