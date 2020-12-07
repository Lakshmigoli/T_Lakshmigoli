class AK47GUN
{
byte noofbullets;
double speed;
boolen hastrigger; 
AK47GUN()
{
noofbullets=47;
speed=60.5;
hastrigger=true;
}
}
class ZeroarugumentConstructor
{
public Static void main(String args[])
{
System.out.println("main method started");
AK47GUN a1=new AK47GUN();
System.out.println("nofbullets="+a1.noofbullets);
System.out.println("speed="+a1.speed);
System.out.println("hastrigger="+a1.hastrigger);
System.out.println("main method ended");
}
}