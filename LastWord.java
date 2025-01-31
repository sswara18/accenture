public class LastWord {
    public static void main(String[] args) {
        String s= "Hello World";
        String x = s.trim();
        int len =0;
        for(int i =0; i<x.length();i++){
            if(x.charAt(i)==' '){
                len=0;
            }else{
                len++;
            }
        }
        System.out.println(len);
    }
    
}
