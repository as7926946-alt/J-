

/*public class fourthclass {                       // code for for loop using for loop
    public static void main(String []args){
        for(int i=0;i<100;i++)
        System.out.printf("%d Hello world%n",i);
    } 
}*/

/*public class fourthclass{                       // code for printing number using for loop
    public static void main(String[]args){
        int i;
        for(i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}*/

/*public class fourthclass {                     // same code but all output in one line 
    public static void main(String[]args){
        int i;
        for(i=0;i<11;i++)
        System.out.print(i);

    } 
}*/

//import java.util.Scanner;

/*public class fourthclass{                        // code for printing sum of first n natural number
    public static void main(String[]args){ 
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
            System.out.println(sum);
    }
    
    
}*/

/*public class fourthclass{                          // code for printing table
    public static void main(String[]args){
        Scanner Sc =new Scanner(System.in);
        int number=Sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d*%d=%d%n",number,i,number *i);
        } 
    }
}*/

/*public class fourthclass{                       // code for printing even numbers till n 
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0)
            System.out.println(i);
        }
    }
}*/

/*public class fourthclass{                       // code for printing one time 
    public static void main(String[]args){
        for(int i=0;i<1;i++){
            System.out.println("Apna college");
        }
    }
}*/

/*public class fourthclass{                        // code for menu driven program
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int choice =Sc.nextInt();
        switch (choice) {
            case 1:
            {
                int marks=Sc.nextInt();
                if(marks>=90){
                    System.out.println("Good");
                }
                else if(89<=marks){
                    System.out.println("Also good");
                }
                else {
                    System.out.println("Good as well but try to improve");
                }
                break;
            } 
            case 0:
            {
                System.out.println("Stop");
                break;
            }
            
            default:
            {
                System.out.println("Invalid operation");
            }
        }
    }
}*/

/*public class fourthclass{                              // code for printing prime number 
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int n=Sc.nextInt();
        if(n<=1){
            System.out.println(" Not Prime");
        }
        else{
            boolean isprime = true;
            for(int i=2;i<=n/2;i++){
                if (n%i==0){
                    isprime = false;
                    break;
               }
            }
            if(isprime){
                System.out.println("Number is prime ");
            }
            else{

                System.out.println("Number is not prime");
            }
        }        
    }
}*/

