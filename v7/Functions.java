import java.util.Scanner;
// code for printing name using functions 

/*public class Functions {
    
    public static void printMyName(String name){
       System.out.println(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        
        printMyName(name);     
   }
}*/

// code for calculating sum of two numbers 

/*public class Functions{
    public static int calculateSum(int a,int b){
        int sum= a + b;
        return sum;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println(sum);
    }
}*/

// code for calculating product of two numbers 

/*public class Functions{
    public static int  calculateProduct(int a,int b){
        return a*b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(calculateProduct(a , b));
    }
}*/

// code for printing factorial using functions 

/*public class Functions{
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid operator");
            return;
        }    
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    } 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            printFactorial(n); 
    }
}*/

// code for prime number using functions

/*public class Functions{
    public static void checkPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
        if(n%i==0){
                count++;
            }
        }
             if(count==2)
            System.out.println("Prime Number");
    
    else{
        System.out.println(" Not Prime Number"); 
    } 
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkPrime(n);
    }
}*/

//code for even odd number using functions 
/*public class Functions{
    public static void checkEvenodd(int n){
        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkEvenodd(n);
    }
}*/

// code for printing table usig functionns

/*  public class Functions{
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + "x" + i + "=" + (n*i));
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printTable(n);
    }
 }*/

 






 