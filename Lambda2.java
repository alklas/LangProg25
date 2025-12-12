class MyClass {
	static int myMeth() {
		return 100;
	}
}
interface MyInterface {
	int MyMeth();
	String MyMeth2();
}
class MyClass1 implements MyInterface {
	public int MyMeth() {
		return 100;
	}
	public String MyMeth2(){
		//...
		return "Строка";
	}
}
MyInterface var2 = new MyClass1();
interface MyFuncInterface {
	int MyMeth();
}
MyFuncInterface var1 = () -> 100;
System.out.println("Вызов лямбда-функции для переменной var1: " + var1.MyMeth());
System.out.println("Вызов лямбда-функции для переменной var2: " + var2.MyMeth());
interface FuncInterface2 {
	double MyMeth(int n);
}
FuncInterface2 reciprocal = (n)->(double)1/n;
System.out.println("Результат вызова метода интерфейса FuncInterface2 с одним параметром (обратное значение параметра): " + reciprocal.MyMeth(10));
reciprocal.MyMeth(100)
eval1.MyMeth(100)
FuncInterface2 eval1 = (n)->(double) n/1000;
eval1.MyMeth(100)