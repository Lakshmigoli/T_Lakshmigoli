import java.util.Scanner;
class Laptop {
String ram;
String processor;
int display;
static String company_name;
static String processor_company_name;
}
public class LaptopScanner
{
public static void main(String args[])
{
Laptop Alienware=new Laptop();
Scanner sc=new Scanner(System.in);
Alienware.ram=sc.next();
Alienware.processor=sc.next();
Alienware.display=sc.nextInt();
Laptop.company_name=sc.next();
Laptop.processor_company_name=sc.next();
System.out.println("Laptop name=Alienware");
System.out.println("ram="+Alienware.ram);
System.out.println("processor="+Alienware.processor);
System.out.println("display="+Alienware.display);
System.out.println("company name="+Laptop.company_name);
System.out.println("processor_company_name="+Laptop.processor_company_name);
}
}


