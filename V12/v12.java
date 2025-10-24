import java.util.Scanner;

// code for printing name using string
/*public class v12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println("Your name is "+ name);
    }
}*/

// code for concatenation concept of string
/*public class v12{
    public static void main(String[]args){
        String first="My name is ";
        String second="Anshika Sinha";
        String third=first + second;
        System.out.println(third);
    }
}*/

// code for finding length of the string 
/*public class v12{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println(name.length());
    }
}*/

// code for finding char this method is called charAt 
/*public class v12{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
        System.out.println(name.charAt(i));
    }
}
}*/

// code for comparing two strings
/*public class v12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        if(name1.compareTo(name2)==0){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}*/

// code for finding a word from a string sentence
/*public class v12{
    public static void main(String[] args) {
        String sentence="I am a student of school";
        String name =sentence.substring(14,sentence.length());
        System.out.println(name);
    }
}*/

// code for printing integer through string
/*public class v12 {
   public static void main(String args[]) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);   
   }
}*/

// code for printing length of integer string 
/*public class v12 {
   public static void main(String args[]) {
      int number = 123;
      String str = Integer.toString(number);
      System.out.println(str.length());       
   }
}*/

// code for printing array using string and calculating its total length
/*public class v12{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String array[]=new String[5];
        int tl=0;
        for(int i=0;i<5;i++){
            array[i]=sc.next();
            tl += array[i].length();
        }
            System.out.println(tl); 
    }
}*/

// code for printing i in place of e
/*public class v12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String result= "";
        for(int i=0; i<sentence.length(); i++) {
       if(sentence.charAt(i) == 'e') {
         result += 'i';
       } else {
         result += sentence.charAt(i);
       }
     }
     System.out.println(result);
   }
}*/

// code for giving username by taking email 
/*public class v12{
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
     String email = sc.next();
     String userName = "";
     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }
     System.out.println(userName);
   }
}*/


      
