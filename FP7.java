interface SomeTest<T> {
    boolean test(T n, T m);
}
isFactor.test(10,2)
isFactor.test(10,3)
SomeTest <Double> isFactorD = (n,d) -> (n%d) == 0;
isFactor.test(10,3)
isFactorD.test(10.0,3.3)
isFactorD.test(10.0,2.5)
SomeTest <Double> isFactor = (n,d) -> (n%d) == 0;
isFactor.test(10.0,2.5)
SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
isIn.test("Незачёт","зачёт")
isIn.test("зачёт","Незачёт")
interface StringFunc {
    String func(String str);
}
static String changeStr(StringFunc sf, String s) {
    return sf.func(s);
}
String inStr = "Исходная строка";
String outStr;
StringFunc reverse = (str) -> {
    String result = "";
    for(int i = str.length()-1; i>= 0; i--)
    result += str.charAt(i);
    return result;
};
outStr = changeStr(reverse, inStr);
outStr = changeStr(reverse, "Вторая строка");
outStr = changeStr((str) -> {
    String result = "";
    char ch;
    for(int i=0;i<str.length();i++){
        ch=str.charAt(i);
        if(Character.isUpperCase(ch))
        result += Character.toLowerCase(ch);
        else
        result += Character.toUpperCase(ch);
    } return result;
}, inStr);
MyIOAction myIO = (rdr) -> {
    int ch = rdr.read();
    System.out.println("Введён символ: " + ch);
    return true;
};
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
myIO.ioAction(reader)
myIO.ioAction(reader)
myIO.ioAction(reader)
interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
MyIOAction myIO2 = (rdr) -> {
    int ch = rdr.read();
    System.out.println("Введён символ: " + ch);
    return true;
};
interface MyTransform <T> {
    void transform(T[] a);
}
MyTransform<Double> sqrts = (v) -> {
    for(int i=0; i < v.length; i++)
    v[i] = Math.sqrt(v[i]);
};
Double arrayD[] = new Double[3];
arrayD[0] = 0.9
arrayD[1] = 6.5
arrayD[2] = 226.5
arrayD
sqrts.transform(arrayD)
arrayD
interface IntPrdicate {
    boolean test(int n);
}
class MyIntPredicates {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i=2; i <= n/i; i++) {
            if((n%i) == 0)
            return false;
        }
        return true;
    }
    
    static boolean isPositive(int n) {
        return n > 0;
    }
    
    static boolean isEven(int n) {
    return (n%2)==0;
    }
}
MyIntPredicates.isPrime(5)
MyIntPredicates.isPrime(56)
boolean result;
static boolean numTest(IntPredicate p, int v) {
    return p.test(v);
}
result = numTest(MyIntPredicates::isPrime, 17)
result = numTest(MyIntPredicates::isPrime, 18)
result = numTest(MyIntPredicates::isPositive, 17)
result = numTest(MyIntPredicates::isPositive, -17)
result = numTest(MyIntPredicates::isEven, -17)
result = numTest(MyIntPredicates::isEven, -16)
class MyIntNum {
    private int v;
    MyIntNum(int x) {v = x;}
    int getNum() {return v;}
    
    boolean isFactor(int n) {
        return (v%n) == 0;
    }
}
MyIntNum myNum = new MyIntNum(12);
MyIntNum myNum2 = new MyIntNum(16);
interface IntPredicate {
    boolean test(int n);
}
result = ip.test(3);
IntPredicate ip = myNum2::isFactor;
result = ip.test(3);