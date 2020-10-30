class FBmessenger
{
public void message()
{
System.out.println("message");
}
}
class FBmessngerv2 extends FBmessenger
{
public void call()
{
System.out.println("call");
}
}
class SingleInheritance2
{
public static void main(String args[])
{
FBmessngerv2 a1=new FBmessngerv2();
a1.message();
a1.call();
}
}
