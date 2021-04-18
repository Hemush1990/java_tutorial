package com.tutotial.java;

class Point2D{
    protected int x, y;

    public Point2D(){

    };

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;

    }

    public void print(){
        System.out.printf(" (%d, %d) %n", x, y);
    }

}

class Point3D extends Point2D{
    private int z;

    public Point3D(){

    };

    public Point3D(int z){
        this.z = z;
    };

    public Point3D(int x, int y, int z){
        super(x,y);  //extends from main class
        this.z = z;
    }

    public void print(){
        System.out.printf(" (%d, %d, %d) %n", x, y, z);
    }
}

public class Super2 {
    public static void main(String[] args) {

        Point2D p1 = new Point2D();
        p1.print();

        Point2D p2 = new Point2D(10, 70);
        p2.print();

        Point3D p3 = new Point3D();
        p3.print();

        Point3D p4 = new Point3D(7);
        p4.print();
    }
}
