import java.util.*;

class automorphic{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int cp=num;
        int square = num * num;
        
        boolean isAutomorphic = false;

        while(num != 0 && square != 0){
        
            if((num % 10) != (square % 10)){
                isAutomorphic = false;
                break;
            }
            num/=10;
            square/=10;
        }


        if(isAutomorphic){
            System.out.println(cp + " is an automorphic number");
        }else{
            System.out.println(cp + " is not an automorphic number");
        }
    }
}
