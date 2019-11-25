package sort.快速排序;

/**
 * @program: java基础知识
 * @description:
 * @author: jiangzq
 * @create: 2019-11-22 09:45
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 10, 2, 7, 100, 5, 299, 50, 1, 88};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        int i,j,temp,t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准数
        temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //在看左边，依次往右递增
            while (temp > arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //最后将基准数为与i和j相等位置的数字交换
        arr[low] = arr[i];//或arr[high]=arr[i]
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr,low,j-1);//此时最中间的数的下标为j
        //递归调用右半数组
        quickSort(arr,j+1,high);
    }
}
