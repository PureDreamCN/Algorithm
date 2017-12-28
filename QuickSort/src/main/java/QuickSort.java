/**
 * Copyright 2017 弘远技术研发中心. All rights reserved
 * Project Name:Algorithm
 * Module Name:TODO:Module
 */

/**
 * what:    (这里用一句话描述这个类的作用). <br/>
 * when:    (这里描述这个类的适用时机 – 可选).<br/>
 * how:     (这里描述这个类的使用方法 – 可选).<br/>
 * warning: (这里描述这个类的注意事项 – 可选).<br/>
 *
 * @author 郭飞 created on 2017/12/27
 */
public class QuickSort {
    public int division(int[] list, int left, int right) {
        // 以最左边的数(left)为基准
        int base = list[left];
        while (left < right) {
            // 从序列右端开始，向左遍历，直到找到小于base的数
            while (left < right && list[right] >= base)
                right--;
            // 找到了比base小的元素，将这个元素放到最左边的位置
            list[left] = list[right];

            // 从序列左端开始，向右遍历，直到找到大于base的数
            while (left < right && list[left] <= base)
                left++;
            // 找到了比base大的元素，将这个元素放到最右边的位置
            list[right] = list[left];
        }

        // 最后将base放到left位置。此时，left位置的左侧数值应该都比left小；
        // 而left位置的右侧数值应该都比left大。
        list[left] = base;
        return left;
    }

    private void quickSort(int[] list, int left, int right) {

        // 左下标一定小于右下标，否则就越界了
        if (left < right) {
            // 对数组进行分割，取出下次分割的基准标号
            int base = division(list, left, right);

            System.out.format("base = %d:\t", list[base]);
            printPart(list, left, right);

            // 对“基准标号“左侧的一组数值进行递归的切割，以至于将这些数值完整的排序
            quickSort(list, left, base - 1);

            // 对“基准标号“右侧的一组数值进行递归的切割，以至于将这些数值完整的排序
            quickSort(list, base + 1, right);
        }
    }

    // 打印序列
    public void printPart(int[] list, int begin, int end) {
                 for (int i = 0; i < begin; i++) {
                         System.out.print("\t");
                    }
                for (int i = begin; i <= end; i++) {
                         System.out.print(list[i] + "\t");
                     }
                 System.out.println();
             }

    public static void main(String[] args){
        QuickSort quickSort = new QuickSort();
        int[] a = {1,3,4,5,2,6,9,7,8,0};
        System.out.print("排序前:\t\t");
        quickSort.printPart(a, 0, a.length - 1);
        quickSort.quickSort(a, 0, a.length - 1);
        System.out.print("排序后:\t\t");
        quickSort.printPart(a, 0, a.length - 1);
    }
}
