package DSA.Arrays.Assignment1;

public class Q4 {
    public static void main(String[] args) {
        String[] arr = {"igtrgrtg"}; 
    }  
    public static void largestString(String[] str){
        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(str[i].length()>largest.length()){
                largest = str[i];
            } 
        }
    }
}
