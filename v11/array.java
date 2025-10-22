import java.util.Scanner;

// code for printing 2-D array given by user
/*public class array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns");
        int cols=sc.nextInt();
        int[][]numbers=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("The matrix is"+ numbers[i][j]);
            }
            System.out.println();
        }    
    } 
}*/

// code for linear search using 2-D array 
/*public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();
        
        int[][] numbers = new int[rows][cols];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to search (x):");
        int x = sc.nextInt();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("The x is found at index (" + i + ", " + j + ")");
                }
            }
        }
    }
}*/

// code for printing spiral matrix
/*public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("The matrix is ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The spiral matrix is ");
        int rowstart = 0;
        int rowend = rows- 1;
        int colstart = 0;
        int colend = cols- 1;
        while (rowstart <= rowend && colstart <= colend) {
            for (int colu = colstart; colu <= colend; colu++) {
                System.out.println(matrix[rowstart][colu]+ " ");
            }
            rowstart++;

            for (int row = rowstart; row <= rowend; row++) {
                System.out.println(matrix[row][colend]+ " ");
            }
            colend--;

            for (int colu = colend; colu >= colstart; colu--) {
                System.out.println(matrix[rowend][colu]+ " ");
            }
            rowend--;

            for (int row = rowend; row >= rowstart; row--) {
                System.out.println(matrix[row][colstart]+ " ");
            }
            colstart++;
            System.out.println();
        }
    }
}*/

// code for transposing of  a matrix
/*public class array{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose of the matrix is ");
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}*/
