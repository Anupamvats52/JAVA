public class array_prblm {
    public static void main(String[] args) {

        // array of float and their Sum
        /*float []marks={50.0f,60.0f,71.0f,99.0f,100.0f };

        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum= sum + marks[i];
            
        }
        System.out.println(sum);
        */
// ***************************************************
        
        //  finding key from array
        // int []marks={20,25,27,19,17};
        // int key=25;
        // boolean isInArray= false;
        // for(int element:marks){
        //     if(key==element){
        //         isInArray= true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("Element is present");
        // }else{
        //     System.out.println("Not found");
        // }
// *******************************************************
        // Average marks of array
        // float []marks= {70.0f,65.0f,67.0f,83.0f,79.0f};  // average= (total sum)/length of array
        // float sum=0;
        // for(float element:marks){
        //     sum= sum + element;

        // }
        // System.out.println("The Average value is: "+sum/marks.length);
// *******************************************************

    //   Adding two Matrix of size 2*3

    // int [][] matrix1= { {1,2,3},{4,5,6},{7,8,9} };
    // int [][] matrix2= { {1,2,3},{4,5,6},{7,8,9} };

    // int [][] matrix3= new int[3][3];

    // for(int i=0;i<matrix1.length;i++){
    //     for(int j=0;j<matrix1[i].length;j++){
    //         matrix3[i][j]= matrix1[i][j] + matrix2[i][j];
    //         System.out.print(matrix3[i][j]+" ");
    //     }
    //     System.out.println();
    // }
// *********************************************************
     
    //  Reverse an array
    // int[] arr={1,2,3,4,5};
    // int l= arr.length;
    // int n= Math.floorDiv(l, 2);
    // int temp;
    // for(int i=0;i<n;i++){
    //     temp= arr[i];
    //     arr[i]= arr[l-i-1];
    //     arr[l-i-1]= temp;
    // }
    // for(int element:arr){
    //     System.out.print(element+" ");
    // }
// *******************************************************

    // Maximum in a array
    // int[] arr={20,27,7,19,1,32};
    // int largest=0;
    // for(int element:arr){
    //     if(largest<element){
    //         largest=element;
    //     }
    // }
    // System.out.println("The value of Maximum element is: "+largest);
// **********************************************************   

    // Minimum in an Array
    // int[] arr={20,27,7,19,1,32,0};
    // int Smallest=Integer.MAX_VALUE;
    // for(int element:arr){
    //     if(Smallest>element){
    //         Smallest=element;
    //     }
    // }
    // System.out.println("The value of Minimum element is: "+Smallest);
// ***********************************************************
     
    //  Sorted Array or not
    // int[] arr= {23,24,25,26,27};
    // boolean isSorted= true;
    
    // for(int i=1;i<arr.length;i++){
    //     if(arr[i-1]>arr[i]){
    //         isSorted= false;
    //         break;
    //     }
    // }
    // if(isSorted || arr.length==0 || arr.length==1){
    //     System.out.println("Sorted array");
    // }else{
    //     System.out.println("Unsorted array");
    // }




    }
}
