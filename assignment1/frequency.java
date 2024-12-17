import java.util.*;

class frequency{
    public static void main(String[] args){
        int arr[] = {1,1,2,2,3,3,4,5};
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }else{
                h.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: h.entrySet()){

            System.out.println("There are "+entry.getValue() +" " + entry.getKey() + "'s");
            
        }
    
    }
}