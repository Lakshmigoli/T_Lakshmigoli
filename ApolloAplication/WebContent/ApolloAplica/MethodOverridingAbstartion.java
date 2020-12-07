abstract class Car
{
abstarct void cost();
abstract void millage();
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
class MethodOverridingAbstration
{
public static void main(String args[])
{
Car x;
x=new Audi();
x.cost();
x.millage();
x=new Bmw();
x.cost();
x.millage();
}
}