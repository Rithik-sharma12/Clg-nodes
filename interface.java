package javaapplication3;
abstract class shape
{
int a=3,b=4;
abstract public void print_area();
}
class rectangle extends shape
{
public int area_rect;
@Override
public void print_area()
{
area_rect=a*b;
System.out.println("The area ofrectangle is:"+area_rect);
}
}
class triangle extends shape
{
int area_tri;
@Override
public void print_area()
{
area_tri=(int) (0.5*a*b);
System.out.println("The area oftriangle is:"+area_tri);
}
}
class circle extends shape
{
int area_circle;
@Override
public void print_area()
{
area_circle=(int) (3.14*a*a);
System.out.println("The area ofcircle is:"+area_circle);
}
}
public class JavaApplication3 {
public static void main(String[] args) {
rectangle r=new rectangle();
r.print_area();
triangle t=new triangle();
t.print_area();
circle r1=new circle();
r1.print_area();
}
}
Using Interface:
interface Shape
{
 void input();
 void area();
}
class Circle implements Shape
{
 int r = 0;
 double pi = 3.14, ar = 0;
 @Override
 public void input()
 {
 r = 5;
 }@Override
 public void area()
 {
 ar = pi * r * r;
 System.out.println("Area of circle:"+ar);
 }
}
class Rectangle extends Circle
{
 int l = 0, b = 0;
 double ar;
 public void input()
 {
 super.input();
 l = 6;
 b = 4;
 }
 public void area()
 {
 super.area();
 ar = l * b;
 System.out.println("Area of rectangle:"+ar);
 }
}
public class Demo
{
 public static void main(String[] args)
 {
 Rectangle obj = new Rectangle();
 obj.input();
 obj.area();
}
}