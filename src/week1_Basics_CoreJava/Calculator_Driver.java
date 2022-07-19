package week1_Basics_CoreJava;
class Calculator{
    public static int add(int a, int b){
        int sum=a+b;
        System.out.println("Sum is::"+sum);
        return sum;
    }

    public static int sub(int a,int b){
        int sub=a-b;
        System.out.println("sub is::"+sub);
        return sub;
    }

    public static int mult(int a,int b){
        int mult=a*b;
        System.out.println("mult is::"+mult);
        return mult;
    }

    public static float div(int a,int b){
        float div=(a/b);
        System.out.println("div is::"+div);
        return div;
    }

}
public class Calculator_Driver {
    public static void main(String... args){
        System.out.println("This is second commit ");
        System.out.println(Calculator.add(23,34));
        System.out.println(Calculator.sub(40,21));
        System.out.println(Calculator.mult(23,8));
        System.out.println(Calculator.div(25,5));
    }
}
