import java.util.Scanner;

// code for printing number from 5 to 1
/*public class recursion {
    public static void printnumber(int n){
        if(n==0)
        return;
        System.out.println(n);
        printnumber(n-1);
    }
    public static void main(String[]args){
        printnumber(5);
    }
}*/

// code for printing number from 1 to 5
/*public class recursion{
    public static void printnumber(int n){
        if (n==6)
        return;
        System.out.println(n);
        printnumber(n+1);
    }
    public static void main(String[]args){
        printnumber(1);
    }
}*/

// code for printing sunm of first n natural numbers 
/*public class recursion{
    public static void printsum(int n,int sum){
        if(n==0){
        System.out.println(sum);
        return;
        }
        sum+=n;
        printsum(n-1,sum);
    }
    public static void main(String[]args){
        printsum(5, 0);
    }
}*/

// code for printing factorial
/*public class recursion{
    public static void printfactorial(int n,int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        fact=fact*n;
        printfactorial(n-1, fact);
    }
    public static void main(String[]args){
        printfactorial(5, 1);
    }
}*/

// code for printing fibonacci series 
/*public class recursion{
    public static void printfib(int a,int b,int n){
        if(n==0){
            return;
        }
        System.out.println(a);
        printfib(b, a+b, n-1);
    }
    public static void main(String[]args){
        printfib(0, 1, 10);
    }
}*/

// code for printing power where n=stack height
/*public class recursion{
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_=printPower(x, n-1);
        int xn=x*x_;
        return xn;
    }
    public static void main(String[]args){
        int x=2,n=5;
        int output=printPower(x, n);
        System.out.println(output);
    }
}*/

// code for power where stack height is logn
/*public class recursion {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            return x * printPower(x, n / 2) * printPower(x, n / 2);
        }
    }
 public static void main(String args[]) {
 int x = 2, n = 5;
 int output =printPower(x, n);
 System.out.println(output);
    }
}*/


