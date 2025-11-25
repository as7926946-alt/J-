import java.util.Scanner;

/*public class thirdclass {                             // code for printing adult not adult using if else
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int age=Sc.nextInt();
        if(age>=18)
        {
            System.out.println("Adult");
        }
        else{
            System.out.println("Not adult");
        } 
    }
    
}*/

/*public class thirdclass{                         // code for printing even odd using if else
    
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        if (n%2==0) {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }

}*/

/*public class thirdclass{                             // code for printing greater number using else if
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        if(a == b){
            System.out.println("A=B is equal");
        }
        else if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
    }
}*/

/*public class thirdclass{                           // code for printing greater number or equal number
    public static void main(String[]args){               // using if else
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        if(a==b){
            System.out.println("a=b is equal");
        }
        else{
            if(a<b){
                System.out.println("A is smaller");
            }
            else{
                System.out.println("A is greater");
            }
        }

    }

}*/

/*public class thirdclass{                            // code for printing bazinga if 3 is even
    public static void main(String[]args){
       int number = 3;
        if(number%2==0){
            System.out.println("Bazinga");
        }
        else{
            System.out.println("inavlid !!!");
        }
    }
}*/


/*public class thirdclass{                                 // same code just in different way
    public static void main(String[]args){
        if(3%2==0){
            System.out.println("Bazinga");
        }
        else{
            System.out.println("inavlid !!!");
        }
    }
}*/

/*public class thirdclass{                          // code printing hello etc using else if
   public static void main(String[]args){
      Scanner Sc=new Scanner(System.in);
      int number=Sc.nextInt();
      if(number==1){
        System.out.println("Hello");
      }
      else if (number==2){
        System.out.println("Namaste");
      }
      else if(number==3)
      {
        System.out.println("Bonjour");
      }
      else{
        System.out.println("Invalid operation");
      }

   }
}*/

/*public class thirdclass {                         // code for printing hello etc using switch case 
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int number=Sc.nextInt();
        switch(number){
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid operator");
        } 
    }
}*/

/*public class thirdclass{
    public static void main(String[]args){              // code for calculator switch case
        Scanner Sc = new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        System.out.println("Press 1 for Add \n 2 for Sub\n 3 for mul\n 4 for div\n 5 for modulo\n");
        int choice=Sc.nextInt();
        switch(choice){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            case 5:
            System.out.println(a%b);
            break;
            default:
            System.out.println("Invalid operator");
        }
    }
}*/

public class thirdclass{                          // code for printing months using switch case
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);
        int month=Sc.nextInt();
        switch(month){
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("Feburary");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default :
            System.out.println("Invalid operation");
        }


        
    }
}


