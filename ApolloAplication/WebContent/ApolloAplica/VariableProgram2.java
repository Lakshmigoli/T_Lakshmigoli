class Laptop
{
String ram;
String processor;
int display;
static String company_name;
static String processor_company_name;
}
public class VariableProgram2
{
public static void main(String args[])
{
Laptop Alienware=new Laptop();
Alienware.ram="4GB";
Alienware.processor="coe i3";
Alienware.display=17;
Laptop.company_name="DELL";
Laptop.processor_company_name="intel";
System.out.println("Laptop Name = Alienware");
System.out.println("Company Name = " + Laptop.company_name);
System.out.println("Ram = "+ Alienware.ram);
System.out.println("Processor = "+ Alienware.processor);
System.out.println("Display = "+ Alienware.display);
System.out.println("processor company name = "+Laptop.processor_company_name);
}
}





