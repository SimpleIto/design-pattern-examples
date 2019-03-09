package structural.adapter;

import java.util.Arrays;

public class QuickSort {

    public void quickSort(int[] array){
        quickSort(0,array.length-1,array);
    }
    private void quickSort(int low, int high, int[] array){
        if(low > high)
            return;
        int i=low+1,j=high;//i=low+1 是因为不考虑第一个分界元素
        while(i<=j){    //带上"="是因为，当只有两个元素时（即当low+1=high时），会导致不进循环，直接交换
            while(i<=high&&array[i]<=array[low])
                i++;
            while(j>low&&array[j]>array[low]) //此处前者不带上'='，是因为不考虑第一个分界元素
                j--;
            if(i<j) //即正常情况下
                switchIndex(i,j,array);
        }
        //结束时，i有3种情况：
        // 1.稳定交换后(ij即将发生交叉后下次)，i必定会移到第一个大元素。
        // 2.后面全都比它小，导致i越界1位
        // 3.i也是指向第一个大元素，但因为是后面比它大，j发生了越界。
        //总之无论哪种，--i都会是最后一个小元素，即分隔元素需要放置的位置
        switchIndex(--i,low,array);
        quickSort(low,i-1,array);
        quickSort(i+1,high,array);
    }
    private void switchIndex(int index1, int index2, int[] array){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
