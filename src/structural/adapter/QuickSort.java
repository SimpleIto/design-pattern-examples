package structural.adapter;

public class QuickSort {

    public void quickSort(int low, int high, int[] array){
        if(low >= high) //i=low+1 是因为不考虑第一个分界元素
            return;
        int i=low+1,j=high; //i=low+1 是因为不考虑第一个分界元素
        while(i<=j){   //带上"="是因为，当只有两个元素时（即当low+1=high时），会导致不进循环，直接交换
            while(i<=high&&array[i]<=array[low])    //带'='是因为判断最高边界为最后一个元素，i 最后可能会越界，但必然不会发生交换
                i++;
            while(j>low&&array[j]>array[low]) //不带'='，是因为需判断最低边界只有第2个元素。j 可以移到第一个分区元素去，但必然不会发生交换
                j--;
            if(i<j) //即正常情况下
                switchIndex(i,j,array); //数组中交换元素位置的方法
        }
        //结束时，i有3种情况：
        // 1.稳定交换后(ij即将发生交叉后下次)，i必定会移到第一个大元素。
        // 2.后面全都比它小，导致i越界1位
        // 3.i也是指向第一个大元素（指向第一个，是因为就算先前有大元素，也肯定已经交换了），但是是因为j发生越界而终止。
        //总之无论哪种，--i都会是最后一个小元素，即分隔元素需要放置的位置
        switchIndex(--i,low,array);
        quickSort(low,i-1,array);   //对分区元素左右两边子数组递归调用此方法
        quickSort(i+1,high,array);
    }
    private void switchIndex(int index1, int index2, int[] array){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
