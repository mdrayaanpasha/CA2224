import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int a  = s.nextInt();
      int rem;
      int cp=a;
      int rev=0;
      
      while(a!=0){
        rem=a%10;
        rev=rev*10+rem;
        a/=10;
      }
      
      if(rev==cp){
	      System.out.println("ITS A PALINDROME");
      }else{
	      System.out.println("ITS NOT A PALINDROME");
      }
  }
}

