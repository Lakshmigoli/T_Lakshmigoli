interface Vechicle
{
void cost();
void milage();
}
abstarct class car implements Vechicle
{
void viper()
{
System.out.println("including car");
}
class Audi extends car
{
void cost()
{
System.out.println("Audi cost is 50laks");
}
void milage()
{
System.out.println("Audi milage is 10km");
}
}
}
class Bmw extends car
{
void cost()
{
System.out.println("Bmw cost is 40laks");
}
void milage()
{
System.out.println("Bmw milage is 15km");
}
}
abstarct class Bike implements Vechicle
{
void stand()
{
System.out.println("standing on bike");
}
}
class Fz extends Bike
{
void cost()
{
System.out.println("Fz cost is 1lak");
}
void milage()
{
System.out.println("Fz milage is 45km");
}
}
class Apache extends Bike
{
void cost()
{
System.out.println("Apache cost is 2lak");
}
void milage()
{
System.out.println("Apache milage is 42km");
}
}
class Vechicleinterface
{
public static void main(String args[])
{
car c1=new Vechicle();
c1=new car();
c1.viper();
c1=new Audi();
c1.cost();
c1.milage();
c1=new Bmw();
c1.cost();
c1.milage();
Bike b1=new Vechicle();
b1=new bike();
b1.stand();
b1=new Fz();
b1.cost();
b1.milage();
b1=new Apache();
b1.cost();
b1.milage();
}
}





