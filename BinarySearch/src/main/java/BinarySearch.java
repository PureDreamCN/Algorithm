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
 * @author 郭飞 created on 2017/12/25
 */
public class BinarySearch {

    /**
     * 这里数组必须是有序的
     * @param key
     * @param arry
     * @return
     */
    public static int rank(int key, int[] arry ){
          //开始位置
          int start = 0;
          //结束位置
          int end = arry.length-1;
          while(start<end){
              int mid = start+(end-start)/2;
              if(key<arry[mid]){
                  end = mid-1;
              }else if(key>arry[mid]){
                  start = mid+1;
              }else{
                  return  mid;
              }
          }
          return -1;
    }

    public static void main(String[] args){
       /* int[] a = {1,3,2,8,5,6,4};
        System.out.print(rank(4,a));*/
       //整数溢出
        //System.out.print(Math.abs(-2147483648));

        //无穷大
     //   System.out.print(1.0/0.0);
        //出错
       // System.out.print(1/0);

        //输出地址
        int[] a = {1,3,2,8,5,6,4};
        System.out.print(a);
    }

}
