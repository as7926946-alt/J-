// code for printing marks using array 

/*public class Array{
    public static void main(String[]args){
        int []marks= new int[3];
        marks[0]=34;
        marks[1]=65;
        marks[2]=97;
    
    for(int i=0;i<3;i++){
        System.out.println(marks[i]);
    }
    }
}*/

// code for printing numbers using array 
/*public class Array{
    public static void main(String[]args){
        int[]number={1,2,3,4,5};
        for(int i=0;i<5;i++){
            System.out.println(number[i]);
        }
    }
}*/

// code for linearsearch using array 
/*public class Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(numbers[i]==x){
             System.out.println("X found at index"+i);
            }
    }
}
}*/
import java.util.Scanner;

// code for printing names using array 
/*public class Array{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out .println("Enter size of the array");
        int size=sc.nextInt();
        sc.nextLine();
        String name[]=new String[size];
        for(int i=0;i<size;i++){
            name[i]=sc.nextLine();
        }
        for( int i=0;i<size;i++){
            System.out.println(name[i]);
        }
    }
}*/

// code for finding mininmum and maximum number using array 
/*public class Array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int max=number[0];
        int min =number[0];
        for(int i=0;i<size;i++){
        if(number[i]>max){
            max=number[i];
        }
        if(number[i]<min){
            min=number[i];
        }
    }
    System.out.println("Maximum element is "+ max);
    System.out.println("Minimum element is "+ min);
    
    }
}*/

// code for checking whether the array is sorted or not in ascending order
/*public class Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<size;i++){
            if(number[i]>number[i+1]){
                isAscending=false;
                break;
            }
        }
        
            if(isAscending){
                System.out.println("Array is  Sorted in ascending order");
            }
            else{
                System.out.println("Array is not  Sorted in ascending order");
            }
        }
    }*/
