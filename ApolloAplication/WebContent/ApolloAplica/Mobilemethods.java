class Mobileshowroom
{
void listmobiles()
{
System.out.println("1.redmi/n2.samsung/n3.realme");
}
void takemobile(String order){
System.out.println("mobile ordered is"+order);
}
String givemobile()
{
return "realme";
}
int bill()
{
return 13000;
}
String paybill(int amount)
{
System.out.println("The bill amount"+amount);
return "paid";
}
}
class Mobilemethods
{
public static void main(String args[])
{
Mobileshowroom mobiles=new Mobileshowroom();
mobiles.listmobiles();
mobiles.takemobile("realme");
System.out.println("mobile given is:"+mobiles.givemobile());
System.out.println("bill amount is:"+mobiles.bill());
System.out.println("is"+mobiles.paybill(mobiles.bill()));
}
}
