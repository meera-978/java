import java.util.Scanner;
class Palindrome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter str:");
String str=sc.nextLine();
String rev="";
for(int i=str.length()-1;i>=0;i--){
rev=rev+str.charAt(i);
}
if(str.equals(rev)){
System.out.print("The string is palindrome");
}else{
System.out.print("The string is not palindrome");
}
}
}
