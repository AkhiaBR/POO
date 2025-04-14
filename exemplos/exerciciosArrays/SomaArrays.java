import javax.swing.*;

public class SomaArrays
{
    public static void main(String[] args) {
        int [] A = {2,2,2,2,2,2,2,2,2,2};
        int [] B = {2,2,2,2,2,2,2,2,2,2};
        int [] C = new int [10];
        int todosC = 0;

        for (int i=0; i<A.length; i++) {
            C[i] = A[i] + B[i];
        }

        for (int i=0; i<C.length; i++) {
            todosC += C[i];
        }

        JOptionPane.showMessageDialog(null, todosC);
    }
}
