class Avengers
{
String fightername;
int noofsuperpowers;
String villan;
Avengers(String fn,int np,String v)
{
fightername=fn;
noofsuperpowers=np;
villan=v;
}
}
class Constructor
{
public static void main(String args[])
{
System.out.println("main method start");
Avengers a1=new Avengers("Thor",2,"Tanos");
System.out.println("fightername="+a1.fightername);
System.out.println("noofsuperpowers="+a1.noofsuperpowers);
System.out.println("villan="+a1.villan);
Avengers a2=new Avengers("Hulk",1,"Laki");
System.out.println("fightername="+a2.fightername);
System.out.println("noofsuperpowers="+a2.noofsuperpowers);
System.out.println("villan="+a2.villan);
System.out.println("main method ended");
}
}
