import java.util.*;


class New{

	public static void main(String args[]){
	
	Scanner s=new Scanner(System.in);
	System.out.println("GIVE ME A NUMBER: ");
	int num = s.nextInt();

	boolean prime=true;


	if(num <= 1){
	System.out.println("ITS NOT A PRIME");
	return;
	}


	for(int i=2;i<Math.sqrt(num);i++){
		if(num%i==0){
		prime=false;
		break;
		}
	
	}

	if(prime){
	
	System.out.println("ITS A PRIME");
	}else{
	System.out.println("ITS NOT A PRIME");
	}

	}

}
