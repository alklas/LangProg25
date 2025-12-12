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
interface FuncInterface3 {
	double MyMeth(int n, int m);
}
FuncInterface3 del = (n,m)->(double)n/m;
del.MyMeth(5,3);
del.MyMeth(5,3);
del.MyMeth(9,3);
del.MyMeth(a,b);
FuncInterface3 del2 = (n,m) -> Math.random()*n / (Math.random()*m);
del2.MyMeth(a,b)
del2.MyMeth(a,b)
del2.MyMeth(a,b)
del2.MyMeth(a,b)
double x;
del2 = (n,m) -> { if ((n+m)%2 == 0) x = 0.0; return x;}
if (del2.MyMeth(4,2)==0.0) System.out.println("Сумма n и m - чётное число");
if (del2.MyMeth(4,3)==0.0) System.out.println("Сумма n и m - чётное число");
del2 = (n,m) -> { if ((n+m)%2 == 0) x = 1.0; return x;}
if (del2.MyMeth(4,3)==1.0) System.out.println("Сумма n и m - чётное число");
if (del2.MyMeth(4,3)==1.0) System.out.println("Сумма n и m - чётное число"); else System.out.println("Сумма нечётная");
if (del2.MyMeth(4,16)==1.0) System.out.println("Сумма n и m - чётное число"); else System.out.println("Сумма нечётная");
if (del2.MyMeth(3,16)==1.0) System.out.println("Сумма n и m - чётное число"); else System.out.println("Сумма нечётная");
if (del2.MyMeth(3,16)==1.0) System.out.println("Сумма n и m - чётное число"); else System.out.println("Сумма нечётная");
del2 = (n,m) -> { if ((n+m)%2 == 0) x = 1.0; else x = 0.0; return x;}
if (del2.MyMeth(3,16)==1.0) System.out.println("Сумма n и m - чётное число"); else System.out.println("Сумма нечётная");
if (del2.MyMeth(6,16)==1.0) System.out.println("Сумма n и m - чётное число"); else System.out.println("Сумма нечётная");
interface FuncInterface4 {
    boolean MyMeth(int m, int n);
}
FuncInterface4 del3 = (n,m) -> (n+m)%2 == 0;
del3.MyMeth(5,2)
del3.MyMeth(6,2)
if (del3.MyMeth(6,2)) System.out.println("Сумма n и m - чётное число");
if (del3.MyMeth(6,2)) System.out.println("Сумма n и m - чётное число"); else System.out.println("Сумма n и m - нечётное число");
if (del3.MyMeth(3,2)) System.out.println("Сумма n и m - чётное число"); else System.out.println("Сумма n и m - нечётное число");
interface MyValue {
    double getValue();
}
interface MyParamValue {
    double getValue(double v);
}
MyValue myVal;
myVal = () -> 35.5
myVal.getValue()
MyParamValue myPval = (n) -> n*n / 1000;
myPval.getValue(50)
myPval.getValue(10000)
FuncInterface4 isFactor = (n, v) -> (n%v) == 0;
isFactor.MyMeth(10,3)
isFactor.MyMeth(10,2)
FuncInterface4 lessThan = (n,m) -> (n<m);
lessThan.MyMeth(3,10)
lessThan.MyMeth(13,10)
FuncInterface4 absEqual = (n,m) -> (n < 0 ? -n : n) == (m<0 ? -m : m);
absEqual.MyMeth(-100,100)
absEqual.MyMeth(-110,100)
absEqual.MyMeth(110,100)
absEqual.MyMeth(100,100)
interface StringTest {
    boolean test (String aStr, String bStr);
}
StringTest isIn = (a, b) -> a.indexOf(b) != -1;
isIn.test("Подстрока", "строка")
isIn.test("Подстрока", "Строка")
a.compareToIgnoreCase(b)
a.compareToIgnoreCase(b)
String b = "Строка 4";
a.compareToIgnoreCase(b)
a.compareToIgnoreCase(b)
String a = "Атрока 9";
a.compareToIgnoreCase(b)
interface NumericFunc {
    int func(int n);
}
smallestF.func(12)
smallestF.func(9)
smallestF.func(25)
smallestF.func(11)
smallestF.func(11)
smallestF.func(11)
smallestF.func(11)
smallestF.func(11)
smallestF.func(11)
smallestF.func(11)
smallestF.func(17)
smallestF.func(117)
smallestF.func(19)
smallestF.func(19)
smallestF.func(19)
smallestF.func(11)
NumericFunc smallestF = (n) -> {
    int result = 1;
    n = n < 0 ? -n : n;
    for(int i=2; i <= (n/i + n); i++) {
    if((n/i)==1) {System.out.println("Параметр - простое число");
    break;}
    if((n%i) == 0) {
        result = i;
        break;
    }
}
    return result;
};