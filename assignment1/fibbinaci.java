import java.util.*;


class New{

public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();

	int fib[]= new int[num+2];


	fib[0]=0;
	fib[1]=1;


	for(int i=2;i<=num+1;i++){
	fib[i]=fib[i-1]+fib[i-2];
	
	}

	System.out.printf("THE FIB IS: %d",fib[num+1]);

}

}
