package structural.adapter;

public class BinarySearch {

    public int BinarySearch(int[] array,int key){
        return BinarySearch(0,array.length-1,key,array);
    }
    private int BinarySearch(int low, int high, int key, int[] array){
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(array[mid] == key)
            return mid;
        int temp = BinarySearch(low,mid-1,key,array);
        if(temp!=-1) return temp;
        temp = BinarySearch(mid+1,high,key,array);
        if(temp!=-1) return temp;
        return -1;
    }
}
