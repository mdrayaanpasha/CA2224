import java.util.*;

class Rotate{
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5,6,7,8,9,10,11};
        int cp[] = new int[arr.length];

        System.out.println("how much to rotate ? ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rs =  n % arr.length;
        for(int i = 0; i < rs; i++){
            cp[i]=arr[arr.length - rs + i];
        }

        for(int i=rs; i < arr.length; i++){
            cp[i]=arr[i-rs];
        }

        for(int elem:cp){
            System.out.print(elem + " ");
        }

        System.out.println();



    }
}