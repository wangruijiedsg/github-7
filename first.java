import java.util.Scanner;
public class first{
public static void main(String agrs[]){
Scanner in=new Scanner (System.in);
System.out.print("Enter a,b,c:");
int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();
System.out.print("Enter color:");
String color=in.next();
System.out.println("1.true 2.false");
System.out.print("Enter filled:");
int num = in.nextInt();
boolean filled=true;
if(num == 1)
filled = true;
else
filled = false;
SimpleGeometricObject test1=new SimpleGeometricObject( color, filled);
Triangle test = new Triangle(a,b,c);
System.out.println(test.toString());
System.out.println(test1.toString());
}
}
class SimpleGeometricObject{
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;
public SimpleGeometricObject(){
dateCreated = new java.util.Date();
}
public SimpleGeometricObject(String color, boolean filled){
dateCreated = new java.util.Date();
this.color = color;
this.filled = filled;
}
public String getColor(){
return color;
}
public void setColor(String color){
this.color = color;}
public boolean isFilled(){
return filled;}
public void setFilled(boolean filled){
this.filled = filled;
}
public java.util.Date getDateCreated(){
return dateCreated;
}
public String toString(){
return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
}
}
class Triangle extends SimpleGeometricObject{
private double side1 = 1.0;
private double side2 = 1.0;
private double side3 = 1.0;
public Triangle(){
super();
side1 = side2 = side3 = 1.0;}
public Triangle(double side1, double side2, double side3){
super();
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}
public double getSide1(){
return side1;
}
public double getSide2(){
return side2;
}
public double getSide3(){
return side3;
}
public double getArea(){
double p = (side1 + side2+ side3) / 2;
return Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));
}
public double getPerimeter(){
return side1 + side2 + side3;
}
public String toString(){
return "Triangle: side1=" +side1+" side2="+side2+" side3="+side3+"\nArea: "+ this.getArea() + "\nPerimeter: " + this.getPerimeter();
}
}