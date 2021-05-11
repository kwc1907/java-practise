package javaÉĎťú4;
interface service
{
void method1();
void method2();
}
class imple1 implements service
{
public void method1() {System.out.println("imple1 method1");}
public void method2() {System.out.println("imple1 method2");}
}
class imple2 implements service
{
public void method1() {System.out.println("imple2 method1");}
public void method2() {System.out.println("imple2 method2");}
}
abstract class factory
{
abstract service creat();	
}
class imple1factory extends factory
{
service creat() {return new imple1();}	
}
class imple2factory extends factory
{
service creat() {return new imple2();}	
}
public class practise4 {
	public static void test(factory t)
	{
		service x=t.creat();
		x.method1();
		x.method2();
	}
	public static void main(String[] args) {
	factory a=new imple1factory();
	factory b=new imple2factory();
	test(a);
	test(b);
	}

}
