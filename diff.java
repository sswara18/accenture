public class diff {
    public static void main(String[] args) {
        int n =4;
        int m =20;
        int sum1 =0;
        int sum2 =0;
        for(int i =1; i<=m; i++){
            if(i%n==0)
            sum1+=i;
            else
            sum2+=i;
        }
        System.out.println(sum2-sum1);
    }
    
}
