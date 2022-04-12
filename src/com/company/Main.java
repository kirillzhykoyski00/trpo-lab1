package com.company;
        import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        rectangle r1 = new rectangle(1,2,3,4);
        rectangle r2 = new rectangle(2,3);
        rectangle r3 = new rectangle();

        r1.move(3,4);
        r2.minSquare(4,6);

        rectangle.DrawRect dr= new rectangle.DrawRect();

        dr.draw("black");
        rectangle.DrawRect.ColoredRect cd = new rectangle.DrawRect.ColoredRect();

        cd.draw("black","black");
    }
}

