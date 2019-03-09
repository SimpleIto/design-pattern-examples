package structural.adapter;

import java.util.Arrays;

/**
 * 客户端面向接口DataOperation编程，具体实例通过IOC或其他随便什么方式注入。
 * 但又有现成的接口可以调用，即：BinarySearch和QuickSort
 * 但两边代码都不想或者不能修改，于是写个Adapter，协调两个接口工作
 */
public class Client {
    public static void main(String[] args){
        DataOperation operation;
        operation = new Adapter();    //此处直接new，只是为了方便.
        int[] ary = {4,1,1,2,1,9,3,2,1,1};
        operation.sort(ary);
        System.out.println(Arrays.toString(ary));
    }
}
