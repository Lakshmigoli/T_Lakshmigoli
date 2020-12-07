class Day1
{
public void Apti()
{
System.out.println("cleared");
}
public void Gd()
{
System.out.println("cleared");
}
}
class Day2 extends Day1
{
public void Programmingtest()
{
System.out.println("cleared");
}
}
class Day3 extends Day2
{
public void Testingtest()
{
System.out.println("cleared");
}
}
class Day4 extends Day3
{
public void Hr()
{
System.out.println("cleared");
}
}
class Multilevelprogram
{
public static void main(String args[])
{
Day4 ref=new Day4();
ref.Apti();
ref.Gd();
ref.Programmingtest();
ref.Testingtest();
ref. Hr();
}
}



