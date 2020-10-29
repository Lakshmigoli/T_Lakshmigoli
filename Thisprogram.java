calss Tv
{
int size;
String brand;
boolean hasinternet;
double price;
Tv()
{
size=32;
brand="mi";
hasinternet=true;
price=10000.00;
}
Tv(int size)
{
this();
this.size=size;
price=1500.00;
}
Tv(boolean hasinternet)
{
this()
this.hasinternet=hasinternet;
price=2000.00;
}
Tv(int size,boolean hasinternet)
{
this();
this.size=size;
this.hasinternet=hasinternet;
}
}
clss Thisprogram
{
public static void main(String args[])
{
System.out.println("main method start");
Tv t1=new Tv(true);
System.out.println("size="+t1.size);
System.out.println("brand="+t1.brand);
System.out.println("hasinternet="+t1.hasinternet);
System.out.println("price="+t1.price);
Tv t2=new Tv(42);
System.out.println("size="+t2.size);
System.out.println("brand="+t2.brand);
System.out.println("hasinternet="+t2.hasinternet);
System.out.println("price="+t2.price);
Tv t3=new Tv(47,true);
System.out.println("size="+t3.size);
System.out.println("brand="+t3.brand);
System.out.println("hasinternet="+t3.hasinternet);
System.out.println("price="+t3.price);
}
}

