import java.util.HashMap;

public class SolutionSix {
    public static int goodPairs(int nums[]){
       int c=0;
       HashMap<Integer, Integer> hm= new HashMap<>();
       for(int i:nums){
        if(hm.containsKey(i)){
            c+=hm.get(i);
            hm.put(i,hm.get(i)+1);
        }
        else{
            hm.put(i,1);
        }
       }
    return c;
    
    }
    public static void main(String[] args) {
        int a[]={1,2,3,2,1,1,4};
        System.out.println(goodPairs(a));
    }
}
