public class SolutionNine {

    public static void distance(int x1,int x2,int y1,int y2){
        double a = Math.sqrt(Math.pow(y1 - y2, 2) + Math.pow(x1 - x2, 2));
        System.out.println(a);

        }
        public static void main(String[] args) {
            int x1=2 ,x2=5, y1=3,y2=8;
            distance(x1, x2, y1, y2);
    }
}
