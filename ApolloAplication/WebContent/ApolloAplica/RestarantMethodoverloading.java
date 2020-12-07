class Restarent{
void menu()
{
System.out.println("1.idly/n2.dosa/n3.poori");
}
void takeorder(String order)
{
System.out.println("order given is"+order);
}
void takeorder(String order1,String order2)
{
System.out.println("order given is "+order1+" and "+order2);
}
}
class RestarantMethodoverloading
{
public static void main(String args[])
{
Restarent paradise=new Restarent();
paradise.menu();
paradise.takeorder("dosa");
paradise.takeorder("dosa","idly");
}
}
