import java.util.Scanner;

public class ClassMate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter A:  ");
        a=scanner.nextInt();
        System.out.print("Enter B:  ");
        b=scanner.nextInt();
        System.out.print("Enter C:  ");
        c=scanner.nextInt();
        double delta=b*b-4*a*c;
        if(delta<0) {
            System.out.println("This is not a valid Root");
        }

        else if(delta==0) {
            double root=Math.sqrt(delta);
            double result=(-b+root)/2*a;
            System.out.println("Result is: "+result);
        }

        else {
            double root=Math.sqrt(delta);
            double result1=(-b+root)/2*a;
            double result2=(-b-root)/2*a;
            System.out.println("x1:  "+result1+" x2: "+result2);
        }

    }

    static int add(int x,int y) {
        return x+y;
    }

    static int factorial(int n) {
        int fact=1;
        for(int i=1; i<=n; i++) {
            fact*=i;
        }
         //   for(statement; condition; statement)
       return fact;
    }

    static int sum(int n) {
        int s=0;
        for(int i=1; i<=n; i++) {
            s=s+i;
        }
        return s;
    }

    static void getResult(int a,int b,int c) {
        double delta=b*b-4*a*c;
        if(delta<0) {
            System.out.println("it is Not a valid Root");
        }

        else if(delta==0) {
            double root=Math.sqrt(delta);
            double result=(-b+root)/2*a;
            System.out.println("The result is:  "+result);
        }

        else {
          double root=Math.sqrt(delta);
          double result1=(-b+root)/2*a;
          double result2=(-b-root)/2*a;
          System.out.println("x1:  "+result1+" x2: "+result2);
        }
    }
}

