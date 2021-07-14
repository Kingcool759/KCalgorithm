package com.example.leetcode.array;

/**
 * @data on 3/28/21 9:34 PM
 * @auther KC
 * @describe 设计停车场系统
 */

//主方法
class ClassMain {
    public static void main(String[] args) {
        ParkingSystem p = new ParkingSystem(1, 1, 0);
        System.out.println(p.addCar(1)); //停小车
        System.out.println(p.addCar(2)); //停中车
        System.out.println(p.addCar(3)); //停大车
        System.out.println(p.addCar(1)); //停小车
    }
}

//设计类
//链接：https://leetcode-cn.com/problems/design-parking-system/
public class ParkingSystem {
    static int[] car = new int[4];

    public ParkingSystem(int big, int medium, int small) {
        car[1] = big;
        car[2] = medium;
        car[3] = small;
    }

    public boolean addCar(int carType) {
        return car[carType]!=0 && car[carType]-->0;
    }
}
