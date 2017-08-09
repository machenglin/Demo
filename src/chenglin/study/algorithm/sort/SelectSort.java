package chenglin.study.algorithm.sort;

/**
 * Created by Mcl on 2017/8/9.
 */
public class SelectSort {
    /**
     * 直接选择排序
     */
    public static void directSelectSortDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            SortUtils.swap(arr, maxIndex, i);
        }
    }

    /**
     * 堆排序:
     *
     */
    public static void minHeapSortDesc(int arr[])
    {
        for (int i = arr.length - 1; i >= 1; i--)
        {
            SortUtils.swap(arr, i, 0);
            MinHeap.minHeapFixdown(arr, 0, i);
        }
    }

}
