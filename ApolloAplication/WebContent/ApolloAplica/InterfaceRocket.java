interface Rocket
{
void fly();
}
interface car
{
void moveonwheels();
}
class Aeroplane implements Rocket,car
{
public void fly()
{
System.out.println("fly..");
}
public void moveonwheels()
{
System.out.println("move on Wheels");
}
}
class InterfaceRocket
{
public static void main(String args[])
{
System.out.println("main method");
Rocket r1=new Aeroplane();
r1.fly();
Aeroplane r2=(Aeroplane)r1;
r2.moveonwheels();
System.out.println("main method ended");
}
}