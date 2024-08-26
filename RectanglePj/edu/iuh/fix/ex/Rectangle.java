/*
 * @ (#) Rectangle.java  1.0   8/23/2024
 *
 * Copyright (c) 2024 IUH. All right reserved
 */
package edu.iuh.fix.ex;
/**
 * @description : hi
 * @author : TheWinH , Thế Vinh Đào
 * @version 1.0
 * @created : 8/23/2024
 */

public class Rectangle {
    private double width ;
    private double length ;
    public Rectangle(){
        width  = 0.0 ;
        length = 0.0 ;
    }
    public Rectangle(double w , double l){
        if (w < 0 || l < 0){
            throw new IllegalArgumentException("Width and length must be greater than 0");
        }
        width = w ;
        length = l ;
    }
    public double getwidth(){
        return width ;
    }
    public double getlength(){
        return length ;
    }
    public void setwidth(double w){
        if (w < 0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        width = w ;
    }


    public void setlength(double l){
        if (l < 0){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        length = l ;
    }

    /**
     * Calculate the area of the rectangle
     * @return  the area of the rectangle
     */
    public double getArea(){
        return width * length ;
    }
    /**
     * Calculate the perimeter of the rectangle
     * @return  the perimeter of the rectangle
     */
    public double getPerimeter(){
        return 2 * (width + length) ;
    }

}
