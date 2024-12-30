public class Break_n_Continue {
    public static void main(String[] args) {
        // for(int i=0;i<=5;i++){
        //     System.out.println(i);
        //     System.out.println("java is great");
        //     if(i==2){
        //         System.out.println("End of loop");
        //         break;
        //     }
        // }

        for(int i=0;i<=5;i++){
            if(i==2){
             System.out.println("Skip the current iteration i="+i);
             continue;
            }
            System.out.println(i);
          System.out.println("java is great");
        }












    }
}
