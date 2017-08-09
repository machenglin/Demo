package chenglin.study.algorithm.sort;

import org.junit.After;
import org.junit.Test;

/**
 * Created by Mcl on 2017/8/9.
 */
public class SortTests {
    int[] arr = {20, 40, 50, 30, 10};

    @Test
    public void testQuickSortDesc() {
        ChangeSort.quickSortDesc(arr, 0, arr.length - 1);

    }

    @Test
    public void testBubbleSortDesc() {
        ChangeSort.bubbleSortDesc(arr);
    }

    @Test
    public void testDirectSelectSortDesc() {
        SelectSort.directSelectSortDesc(arr);
    }
    @Test
    public void testMinHeapDeleteNumber() {
        MinHeap.makeMinHeap(arr);
        SelectSort.minHeapSortDesc(arr);
    }

    @After
    public void printArr() {
        SortUtils.printArr(arr);
    }
}
