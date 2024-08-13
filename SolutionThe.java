import java.util.*;
public class SolutionThe {
    public static int Hcm(int n1, int n2){
        if(n1==n2){
            return n1;
        }
        if(n1>n2){
           return Hcm(n1-n2,n2);
        }

        return Hcm(n1,n2-n1);

    }
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int n1=sc.nextInt();
     int n2=sc.nextInt();
     int ans=Hcm(n1, n2);
     System.out.println(ans);
    }
}
