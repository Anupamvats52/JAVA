import java.util.*;
class PrintStackElements {
    public void show(){
        Stack st = new Stack();
        st.push(12);
        st.push(45);
        st.push(56);
        st.push(49);
        System.out.println(st);
        // using Loops
        for(int i=0;i<st.size();i++){
            System.out.print(st.get(i)+"\t");
        }
        System.out.println(" ");
        // stack elements in reverse order
        for(int i=st.size()-1;i>=0;i--){
            System.out.print(st.get(i)+"\t");
        }
    }
}



public class StackElements{
    public static void main(String[] args) {
        PrintStackElements p = new PrintStackElements();
        p.show();
    }
}
