import java.util.*;

public class SolutionEight {
    public static void findfirstAndLast(int a[], int x){
         int first=-1, last=-1;
         for(int i=0; i<a.length;i++){
            if(x!=a[i]){
                continue;
            }
            if(first == -1)first=i;
            last=i;
         }
         if(first!=-1){
            System.out.println("First and last Occurance " + first +" "+last);
         }
         else{
            System.out.println("No occurance");
         }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] a= {1,2,3,5,5,6,7,5};
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        int x=5;
        findfirstAndLast(a,x);
    }
}