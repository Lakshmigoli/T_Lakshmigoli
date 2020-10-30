class Car
{
void cost()
{
System.out.println("No cost");
}
void millage()
{
System.out.println("No millage");
}
}
class Audi extends Car
{
void cost()
{
System.out.println("Audi cost is 50lakhs");
}
void millage()
{
System.out.println("Audi millage is 10km");
}
}
class Bmw extends Car
{
void cost()
{
System.out.println("Bmw cost is 40lakhs");
}
void millage()
{
System.out.println("Bmw millage is 10km");
}
}
class Methodoverriding
{
public static void main(String args[])
{
Car x=new Car();
x.cost();
x.millage();
x=new Audi();
x.cost();
x.millage();
x=new Bmw();
x.cost();
x.millage();
}
}