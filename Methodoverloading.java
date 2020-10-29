class Google
{
public void search(String data)
{
System.out.println("searching data for String"+
data);
}
public void search(int data)
{
System.out.println("searching data for int"+
data);
}
public void search(double data)
{
System.out.println("searching data for double"+
data);
}
}
class Methodoverloading
{
public static void main(String args[])
{
Google g1=new Google();
g1.search(10.04);
g1.search("what are the skills required for job");
g1.search(25);
}
}
