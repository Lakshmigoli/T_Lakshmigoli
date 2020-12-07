class Student{
int  student_id;
float percantage;
static String clg;
long contactno;
float height;
String bloodgroup;
String adress;
}
class Variable{
public static void main(String args[]){
Student Suresh=new Student();
Suresh.student_id=1010;
Suresh.percantage=88.6f;
Student.clg="kecw";
Suresh.contactno=6401321816l;
Suresh.height=5.8f;
Suresh.bloodgroup="o+";
Suresh.adress="guntur";
System.out.println("===========student Details=============");
System.out.println(" Student id="+Suresh.student_id);
System.out.println("percantage="+Suresh.percantage);
System.out.println("clg="+Student.clg);
System.out.println("contactno="+Suresh.contactno);
System.out.println("height="+Suresh.height);
System.out.println("bloodgroup="+Suresh.bloodgroup);
System.out.println("adress="+Suresh.adress);
}
}






