public class kadanesAlg {
    public static void main(String[] args) {
        
        int arr[]= new int []{-2,1,-3,4,-1,2,1,-5,4};
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;

            }
            
        }
        System.out.println(max);
}
    
}
