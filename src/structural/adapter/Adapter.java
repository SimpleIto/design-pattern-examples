package structural.adapter;

public class Adapter implements DataOperation {
    @Override
    public void sort(int[] array) {
        new QuickSort().quickSort(0,array.length-1,array);
    }

    @Override
    public int search(int[] array, int key) {
        return new BinarySearch().BinarySearch(0,array.length-1,key,array);
    }
}
