// code for tower of hanoi
/*public class Recursion2 {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}*/

// code for reversing a string 
/*public class Recursion2{
    public static void reversestring(String str, int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reversestring(str, index-1);
    }
    public static void main(String[]args){
        String str ="abcd";
        reversestring(str, str.length()-1);
    }
}*/

// code for finding occurance of a element in a string
/*public class Recursion2{
    public static int first=-1;
    public static int last=-1;
    public static void printocc(String str,int index,char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char cc=str.charAt(index);
        if(cc==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        printocc(str, index+1, element);
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        printocc(str, 0,'a');
    }
}*/

// code for array checking sorted or not
/*public class Recursion2{
    public static boolean issorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return issorted(arr, index+1);
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        System.out.println(issorted(arr, 0));
    }
}*/

// move all the x to the end of the string
/*public class Recursion2{
    public static void movex(String str,int index,int count,String newString){
        if(index==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char cc=str.charAt(index);
        if(cc=='x'){
            count++;
            movex(str, index+1, count, newString);
        }
        else{
           newString+=cc;
           movex(str, index+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        movex(str, 0, 0, "");
    }
}*/

// code for removing duplicate in a string 
/*public class Recursion2{
    public static boolean[] map=new boolean [26];
    public static void removedupli(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char cc=str.charAt(index);
        if(map[cc-'a']){
            removedupli(str, index+1, newString);
        }
        else{
            newString+=cc;
            map[cc-'a']=true;
            removedupli(str, index+1, newString);
        }
    }
    public static void main(String[]args){
        String str="abbccda";
        removedupli(str, 0, "");
    }
}*/

// code for subsequence
/*public class Recursion2{
    public static void subsequence(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char cc=str.charAt(index);
        subsequence(str, index+1, newString+cc);
        subsequence(str, index+1, newString);
    }
    public static void main(String[]args){
        String str="abc";
        subsequence(str, 0, "");
    }
}*/

// code for printing unique subsequence
/*import java.util.HashSet;
public class Recursion2{
    public static void uniquesub(String str,int index,String newString, HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char  cc=str.charAt(index);
        uniquesub(str, index+1, newString+cc, set);
        uniquesub(str, index+1, newString, set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        uniquesub(str, 0, "", set);
    }
}*/

// code for keypad combinations 
/*public class Recursion2{
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char cc=str.charAt(index);
        String mapping =keypad[cc-'0'];
        for(int i=0;i<mapping.length();i++){
            printcomb(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[]args){
        String str="23";
        printcomb(str, 0, "");
    }
}*/

    
    
