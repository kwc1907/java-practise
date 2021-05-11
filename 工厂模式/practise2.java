package javaÉĎťú4;
interface service
{
void method1();
void method2();
}
interface  factory
{
service creat();	
}

class imple1 implements service
{
public void method1() {System.out.println("imple1 method1");}
public void method2() {System.out.println("imple1 method2");}
public static factory imple1factory=
new factory() {public service creat(){return new imple1();}};
}
class imple2 implements service
{
public void method1() {System.out.println("imple2 method1");}
public void method2() {System.out.println("imple2 method2");}
public static factory imple2factory=
new factory(){public service creat() {return new imple2();}};
}
public class practise2 {
	public static void test(factory t)
	{
		service x=t.creat();
		x.method1();
		x.method2();
	}
	public static void main(String[] args) {
	test(imple1.imple1factory);
	test(imple2.imple2factory);
	}

}
