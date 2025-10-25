import java.util.Scanner;

// code for get bit
/*public class v15 {
    public static void main(String[]args){
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask & n)==0){
            System.out.println("Bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }
    } 
}*/

// code for set bit
/*public class v15{
    public static void main(String[]args){
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int newNumber=bitMask|n;
        System.out.println(newNumber);
        }
}*/

// code for clear bit 
/*public class v15{
    public static void main(String[]args){
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int notbitMask= ~(bitMask);
        int newNumber= notbitMask & n;
        System.out.println(newNumber);
    }
}*/

// code for update bit
/*public class v15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        if(op==1){
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int notbitMask= ~(bitMask);
            int newNumber=notbitMask & n;
            System.out.println(newNumber);
        }
    }
}*/

// code for checking whether number is power of two or not 
/*public class v15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int pos = 0; pos < 32; pos++) {
            int bitMask = 1 << pos;
            if ((n & bitMask) != 0) {
                count++;
            }
            if (count > 1) {
                break;
            }
        }
        if (count == 1) {
            System.out.println("The number is a power of two");
        } else {
            System.out.println("The number is NOT a power of two");
        }
    }
}*/

// code for toggle position of a number
/*public class v15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println("Enter position which you want to toggle");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        int newNumber = bitMask ^ n;
        System.out.println(newNumber);
    }
}*/

// code for counting number of 1 in a binary number 
/*public class v15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int count=0;
       while(n!=0){
            if((n & 1) == 1){
                count++;
            }  
             n=n>>1;     
        }
         System.out.println("The number of 1's are"+ count);

    }
}*/

// code for converting binary number to decimal and vice versa
/*public class v15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        System.out.println("Press 1 to convert decimal to binary or Press 2 to convert binary to decimal ");
        int choice = sc.nextInt();
        if(choice==1){
            StringBuilder sb=new StringBuilder();
            while (n>0) {
               int  r= n % 2;
                sb.append(r);
                n=n/2;
                
            }
            System.out.println(sb.reverse());
        }
        else if(choice ==2){
            System.out.println("Enter binary number:");
            String binary = sc.next();
            int decimal = 0;
            for(int i = 0; i < binary.length(); i++){
             int current_digit = binary.charAt(i) - '0';
            decimal = decimal * 2 + current_digit;
        }
         System.out.println(decimal);
    }
        else{
            System.out.println("Invalid number");
        }   
}
}*/

    



