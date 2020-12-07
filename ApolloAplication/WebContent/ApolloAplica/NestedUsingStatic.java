class University
{
static class Department{
void announcement(){
System.out.println("cse result declared");
}
static void result(){
System.out.println("Result kept in website");
}
}
}
class NestedUsingStatic
{
public static void main(String args[])
{
University.Department cse=new University.Department();
cse.announcement();
University.Department.result();
}
}
