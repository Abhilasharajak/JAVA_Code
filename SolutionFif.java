import java.util.*;
public class SolutionFif {
/* In an array a superior element is one which is greater than all the element to its 
 * right side the right most element itself itself be a superior elemtn.
 * input n=6 arr[]={8,10,6,2,9,7}
 * output is 3 because 10 , 9 , 7 are greater than all the riht side element.
 */
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
   }
   int count=0;
   int sup=Integer.MIN_VALUE;
   for(int i=n-1;i>=0;i--){
      if(arr[i]>sup){
         count++;
         sup=arr[i];

      }
   }
   System.out.println("Answer in a single digit : "+count);
   } 
}
