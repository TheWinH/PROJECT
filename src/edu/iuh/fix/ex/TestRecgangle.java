/*
 * @ (#) TestRecgangle.java  1.0   8/23/2024
 *
 * Copyright (c) 2024 IUH. All right reserved
 */
package edu.iuh.fix.ex;
/*
 * @description : hi
 * @author : TheWinH , Thế Vinh Đào
 * @version 1.0
 * @created : 8/23/2024
 */

public class TestRecgangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.0, 3.0);
       // r1.setwidth(-1.0);
        System.out.println("Width of r1: " + r2.getwidth());
        System.out.println("Length of r1: " + r2.getlength());
        System.out.println("Area of r1: " + r2.getArea());
        System.out.println("Perimeter of r1: " + r2.getPerimeter());
    }
}
