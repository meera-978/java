Class Demo
{
int a,b;
Demo()
{
a=10;
b=20;
}
Demo(int x)
{
a=x;
b=20;
}
void add()
{
System.out.println("sum="+
(a+b));
}
void add(int x,int y)
{
System.out.println("sum="+
(x+y));
}
public static void main
(String arg[])
{
Demo d1=new Demo()
Demo d2=new Demo(30);
d1.add()
d2.add(40,50);
}
}
