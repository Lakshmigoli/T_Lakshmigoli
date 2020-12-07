class Shoppingapp
{
public void shop()
{
System.out.println("Shopping");
}
}
class myntra extends Shoppingapp
{
public void sell()
{
System.out.println(" only for Shopping");
}
}
class flipcart extends Shoppingapp
{
public void Buy()
{
System.out.println("Buy sarees");
}
}
class amazon extends Shoppingapp
{
public void Bank()
{
System.out.println("transfer money");
}
}
class Hierachicalprogram
{
public static void main(String args[])
{
Shoppingapp ref=new Shoppingapp();
ref.shop();
ref.sell();
ref.Buy();
ref.Bank();
}
}