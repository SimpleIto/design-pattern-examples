package structural.adapter;

public class Adapter implements DataOperation {
    private BinarySearch search;
    private QuickSort sort;

    public Adapter(){
        search = new BinarySearch();
        sort = new QuickSort();
    }
    @Override
    public void sort(int[] array) {
        sort.quickSort(0,array.length-1,array);
    }

    @Override
    public int search(int[] array, int key) {
        return search.BinarySearch(0,array.length-1,key,array);
    }
}
