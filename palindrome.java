public class palindrome {
    public static void main(String[] args) {
        int x= 121;
        int temp =x;
        int rem=0,rev=0;
        while(temp>0){
            rem = temp%10;
            rev =rev*10+rem;
            temp/=10;

        }
        if(rev==x){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}
