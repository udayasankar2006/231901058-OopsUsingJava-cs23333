import java.util.Scanner;
class ticket{
public static void main(String args[]){
int rt=50;
int vt=100;
int pt=150;
Scanner sc=new Scanner(System.in);
String tickets=sc.nextLine();
int nt=sc.nextInt();
if(tickets.equals("regular"))
{
if(nt>=10)
{
int a=nt*rt*10/100;
System.out.println("total price:"+(nt*rt-a));
}
else{
System.out.println("total price:"+(nt*rt));
}
}
else if(tickets.equals("vip"))
{
if(nt>=5)
{
int b=nt*vt*15/100;
System.out.println("total price:"+(nt*vt-b));
}
else
{
System.out.println("total price:"+nt*vt);
}
}
else if(tickets.equals("premium"))
{
if(nt>=3)
{
int c=nt*pt*20/100;
System.out.println("total price:"+(nt*pt-c));
}
else
{
System.out.println("total price:"+nt*pt);
}
}
}
}