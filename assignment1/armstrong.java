import java.util.*;

class Armstrong{

	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		int cp=num;
		int sum=0;
		while(num!=0){
			sum+=Math.pow((num%10),3);
			num/=10;
		
		}

		if(cp==sum){
			System.out.println("ITS AN ARMSTRONG NUM");
		}else{
			System.out.println("NOT ARMSTRONG");
		}
	}

}
