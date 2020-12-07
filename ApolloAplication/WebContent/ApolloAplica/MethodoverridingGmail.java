class Gmailv1
{
public void composemsg()
{
System.out.println("full screen implements");
}
}
class Gmailv2 extends Gmailv1
{
public void composemsg()
{
System.out.println("pop up screen implements");
}
}
class MethodoverridingGmail
{
public static void main(String args[])
{
Gmailv2 ref=new Gmailv2();
ref.composemsg();
}
}
