public class missingNo {
    public static void main(String[] args) {
        int arr[]= new int[]{3,0,1};
        int n = arr.length;
        int total= n*(n+1)/2;
        int sum =0;
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(total-sum);
    }
    
}
