public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 40, 16, 45, 30,60};
       int key = 90;
       int index = linearSearach(arr, key);
       if(key == -1){
        System.out.println("Key is not found");        
       }
       else{
        System.out.println("key at index : " + index);
       }
    }
    public static int linearSearach(int[] arr, int key){
        for(int i =1; i< arr.length; i++){
            if(arr[i]==key){
                return i;
            }           
        }
        return -1;
    }
}
