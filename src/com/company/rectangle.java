package com.company;
import java.util.Scanner;

public class rectangle
{
    int x1, x2, y1, y2 ,h,w;

    public rectangle( int x1,int x2,int y1,int y2)
    {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    public rectangle( int h,int w)
    {
        this.h=h;
        this.w=w;
    }

    public rectangle()
    {
        this.x1=0;
        this.x2=0;
        this.y1=0;
        this.y2=0;
    }

    public String toString()
    {
        return "x1="+x1+"x2="+x2+"y1="+y1+"y2="+y2;
    }

    public int move(int dx, int dy)
    {
        dx+=dx;
        dy+=dy;
        System.out.println(dx+" Новое положение х");
        System.out.println(dy+" Новое положение у");
        return dx;
    }

    public int minSquare(int xx, int yy)
    {
        System.out.println(xx*yy+" Площадь");
        return xx*yy;
    }


    static class DrawRect {
        public String draw(String outColor)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите внешний цвет: ");
            String color = in.next();
            return color;
        }
        static class ColoredRect
        {
            DrawRect dr=new DrawRect();
            String inColor;

            public String draw(String outColor, String inColor)
            {
                String out;
                out=dr.draw("");
                Scanner in = new Scanner(System.in);
                System.out.print("Введите внутренний цвет: ");
                String inn = in.next();
                System.out.println(out+" внешний цвет; "+inn+" внутренний цвет.");
                return inn;
            }
        }
    }
}