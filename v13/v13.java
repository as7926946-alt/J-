import java.util.Scanner;

// code for printing string using string builder
/*public class v13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Anshika Sinha");
        System.out.println(sb);
    }
}*/

// code for printing character using string builder
/*public class v13{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Saanvi");
        System.out.println(sb.charAt(0));
    }
}*/

// code for seting character using string builder
/*public class v13{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Sony");
        sb.setCharAt(0 ,'T');
        System.out.println(sb);
    }
}*/

// code for inserting a character before given string 
/*public class v13{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Tony");
        sb.insert(0,'S');
        System.out.println(sb);
    }
}*/

// code for doubling any character 
/*public class v13{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Roten");
        sb.insert(2,'t');
        System.out.println(sb);
    }
}*/

// code for deleting a character 
/*public class v13{
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("Holds");
        sb.delete(4,5);
        System.out.println(sb);
    }
}*/

// code for adding a character at last
/*public class v13{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("H");
        sb.append("i");
        System.out.println(sb);
    }
}*/

// code for finding length of a string
/*public class v13{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("I am at hostel");
        System.out.println(sb.length());
    }
}*/

// code for reversing a string 
/*public class v13{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder("Keshav");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back = sb.length()-1-i;
            char frontchar= sb.charAt(front);
            char backchar= sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    } 
}*/

// code for printing string by taking input from user by using string builder
/*public class v13{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb= new StringBuilder(input);
        System.out.println(sb);
    }
}*/

