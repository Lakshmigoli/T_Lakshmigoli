import java.util.Scanner;
class Student
{
int student_id;
float percantage;
float height;
String bloddgroup;
String adress;
static String college_name;
static String department;
}
public class StudentScanner
{
public static void main(String args[])
{
Student suresh=new Student();
Scanner sc=new Scanner(System.in);
suresh.student_id=sc.nextInt();
suresh.percantage=sc.nextFloat();
suresh.height=sc.nextFloat();
suresh.bloddgroup=sc.next();
suresh.adress=sc.next();
Student.college_name=sc.next();
Student.department=sc.next();
System.out.println("student id="+suresh.student_id);
System.out.println("percantage="+suresh.percantage);
System.out.println("height="+suresh.height);
System.out.println("bloodgroup="+suresh.bloddgroup);
System.out.println("adress="+suresh.adress);
System.out.println("college name="+Student.college_name);
System.out.println("department="+Student.department);
}
}
