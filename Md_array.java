public class Md_array {
    public static void main(String[] args) {
        int [][] flats=new int[2][3];            // 2D Array
         
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        // displaying elements
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
