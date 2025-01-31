public class EOindSumSep {
    public static void main(String[] args) {
        int arr[]= new int []{1,2,3,4,5,6};
        int evensum= 0;
        int oddsum=0;
        for(int i =0; i<arr.length; i++){
            if(i%2==0){
                evensum+=arr[i];
            }else{
                oddsum+=arr[i];
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
    

    
}
