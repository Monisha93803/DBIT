
public class JavaApplication4 {
 public static void main(String[] args) {
 int num=121;
 int temp=num;
 int rev = 0;
 while(num>0)
 {
 rev = rev*10;
 rev = rev + num%10;
 num = num/10;
 }
 if(temp == rev)
 {
 System.out.println("Palindrome");
 }
 else
 {
 System.out.println("Not Palindrome");
 }
 }
}