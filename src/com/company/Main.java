package com.company;

import java.util.Scanner;

public class Main {

    public class CircleTest {

    }
        public static void main(String[] args) {
            // write your code here
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter radius ");
            double radius = scanner.nextDouble();
            System.out.print("Enter x coordinate ");
            int x = scanner.nextInt();
            System.out.print("Enter y coordinate ");
            int y = scanner.nextInt();
            Circle circle = new Circle(radius, x, y);
            System.out.println(circle);
            String num;
            do {
                System.out.println("If u want to change the circle's radius enter '1' ");
                System.out.println("If u want to change the circle's x coordinate enter '2' ");
                System.out.println("If u want to change the circle's y coordinate enter '3' ");
                System.out.println("If u want to end programm enter '0' ");
                num = scanner.next();
                if (num.equals("1")) {
                    System.out.print("Enter radius ");
                    radius = scanner.nextInt();
                    circle.setRadius(radius);
                }
                if (num.equals("2")) {
                    System.out.print("Enter x coordinate ");
                    x = scanner.nextInt();
                    circle.setX(x);
                }
                if (num.equals("3")) {
                    System.out.print("Enter y coordinate ");
                    y = scanner.nextInt();
                    circle.setY(y);
                }
                System.out.println(circle);
            } while (!num.equals("0"));
        }
}