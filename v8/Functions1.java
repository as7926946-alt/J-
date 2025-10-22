import java.util.Scanner;

// code for printing average using functions 
/*public class Functions1 {
    public static void printAverage(float a, float b, float c) {
        float avg;
          avg = a + b + c / 3;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        printAverage(a, b, c);
    }
}*/

// code for printing sum from 1 to n natural numbers using 
/*public class Functions1{
    public static void printSum(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum=sum+i;
             System.out.println(sum);
        }
    }
         public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printSum(n);
    }
 }*/

// code for checking greater number from two numbers using functions
/*public class Functions1{
    public static void greaterNumber(int a,int b){
        if(a==b){
            System.out.println("Both are equal");
        }
        else if(a>b){
            System.out.println( a + "is greater than"+ b);
        }
        else{
            System.out.println( b + " is greater than "+ a);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greaterNumber(a,b);
    }
}*/

// code for finding circumference using functions
/*public class Functions1{
    public static void findCirumference(float r){
        float p= (float)3.14;
        float c= 2*p*r;
        System.out.println(c);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        findCirumference(r);
    }
}*/

// code for checking eligibility to vote using functions 
/*public class Functions1{
    public static void voteEligibility(int age){
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else if(age<=0){
            System.out.println("Invalid age");
        }
        else{
            System.out.println("Not eligible to vote");
        }
   
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();
            voteEligibility(age);
        }
}*/

// code for infinte loop using do while loop
/*public class Functions1{
    public static void main(String[]args){
        do{
            System.out.println("This is an infinite loop");
        }
        while(true);
    }
}*/

// code for entering numbers as user want and checking positive , negative , zero

/*public class Functions1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int positive =0;
        int negative =0;
        int zero=0;
        char choice;
        do{
            System.out.println("Enter a number");
            int n=sc.nextInt();
            if(n==0){
                zero++;
            }
            else if(n>0){
                positive++;
            }
            else{
                negative++;
            }
        System.out.println("Do you want to continue adding another number yes or no");
         choice =sc.next().charAt(0);
        }
        while(choice == 'y' || choice == 'Y');
            System.out.println("Total Positive numbers are" + positive);
            System.out.println("Total Negative numbers are" + negative);
            System.out.println("Total Zeroes are " + zero);         
    }
}*/

// code for finding power of numbers given by user 

/*public class Functions1{
    public static void findPower(double x,double n){
        double result=Math.pow(x, n);
        System.out.println("The result is " + result);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextInt();
        double n=sc.nextInt(); 
        findPower(x, n); 
    }
}*/

// code for finding GCD 

/*public class Functions1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int temp=0;
        while(b!=0){
            temp=b;
            b=a%b;
            a =temp;
            }
            System.out.println("GCD is "+ a);
        }
}*/

// code for fibonacci series 
/*public class Functions1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms of Fibonacci series you want: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}*/


   
        
    







 

   
