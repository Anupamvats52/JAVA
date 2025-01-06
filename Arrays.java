public class Arrays {
    public static void main(String[] args) {
        int [] marks= {10,12,23,42,32};
        System.out.println(marks[1]);      // indexing
        System.out.println(marks.length);  //Length of Array

        // Displaying an Array
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // For-each loop
        for(int element:marks){
            System.out.println(element);
        }
    }
}
