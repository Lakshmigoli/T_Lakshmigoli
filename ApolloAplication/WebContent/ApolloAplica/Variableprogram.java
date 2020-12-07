class Car{
static String company_name;
static  int no_of_wheels;
String color;
int no_of_seats;
int milage;
float price;
}
public class Variableprogram
{
public static void main(String args[])
{
Car Maruthisuzukicelerio=new Car();
Car.company_name="Maruthisuzuki";
Car. no_of_wheels=4;
Maruthisuzukicelerio.color="red";
Maruthisuzukicelerio.no_of_seats=4;
Maruthisuzukicelerio.milage=25;
Maruthisuzukicelerio.price=500000.0f;
System.out.println("Car name=Maruthusuzuki");
System.out.println("company name ="+ Car.company_name);
System.out.println("no of wheels ="+ Car.no_of_wheels);
System.out.println("color ="+ Maruthisuzukicelerio.color);
System.out.println("no of seats ="+ Maruthisuzukicelerio.no_of_seats);
System.out.println("milage ="+ Maruthisuzukicelerio.milage);
System.out.println("price ="+ Maruthisuzukicelerio.price);
}
}
