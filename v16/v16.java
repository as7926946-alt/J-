import java.util.Scanner;

// code for bubble sort ascending order
/*public class v16 {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) 
        arr[i]=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}*/

// code for bubble sort descending order 
/*public class v16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
}*/

// code for selection sort for ascending order 
/*public class v16{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest =j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The sorted array is ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
}*/

// code for selection sort for descending order
/*public class v16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[smallest]) {
                    smallest = j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        System.out.println("The sorted array is");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}*/

// code for insertion sort for ascending order 
/*public class v16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       for(int i=1; i<arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
               while(j >= 0 && arr[j] > current){
                   arr[j+1] = arr[j];
                   j--;
               }
           arr[j+1] = current;
       }
        System.out.println("The sorted array is");
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + " ");
       }
       System.out.println();
    }
}*/

// code for isertion sort for descending order
/*public class v16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       for(int i=1; i<arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
               while(j >= 0 && arr[j] < current){
                   arr[j+1] = arr[j];
                   j--;
               }
           arr[j+1] = current;
       }
        System.out.println("The sorted array is");
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] + " ");
       }
       System.out.println();
    }
}*/