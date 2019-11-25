package sort.冒泡排序;

/**
 * @program: java基础知识
 * @description:
 * @author: jiangzq
 * @create: 2019-11-22 10:02
 **/
public class bubbling {
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 5, 0, 4, 3, 8, 1, 7, 6};
        int i, j;
        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("从小到大：");
        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+",");
        }
    }
}
