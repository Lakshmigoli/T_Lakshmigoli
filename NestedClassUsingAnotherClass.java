class University{
void announcement(){
System.out.println("exam start from dec 1");
Department cse=new Department ();
cse.exampapers();
}
class Department {
void exampapers(){
System.out.println("exam papers being prepared");
}
}
}
class NestedClassUsingAnotherclass
{
public static void main(String args[])
{
 University jntu=new  University();
jntu.announcement();
}
}
