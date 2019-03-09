package structural.adapter;

public class Adapter implements DataOperation {
    @Override
    public void sort(int[] array) {
        new QuickSort().quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return new BinarySearch().BinarySearch(array,key);
    }
}
