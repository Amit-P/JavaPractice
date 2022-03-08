//Write a program to demonstrate to find out the biggest and smallest integer in the array
class MyClass {  
    public static void main(String[] args){     
       bigInt();
       smallInt();
    }    
    public static int bigInt(){
        int[] arr={10, 20, 31, -5, 67, 12};
        int big = arr[0];
        for (int i=0; i<=arr.length-1; i++){
            //System.out.println(arr[i]);
            if (big<=arr[i]){
                big=arr[i];
            }
        }
        System.out.println("Biggest integer in the array is:"+big);
        return big;
    }  
    public static int smallInt(){
        int[] arr2={10, 20, 31, -5, 67, 12};
        int small = arr2[0];
        for (int i=0; i<=arr2.length-1; i++){
            //System.out.println(arr[i]);
            if (small>=arr2[i]){
                small=arr2[i];
            }
        }
        System.out.println("Smallest integer in the array is:"+small);
        return small;
        
    }
}