import javax.swing.*;
import java.util.Arrays;

public class SomaABMetodoArray
{
    public static String SomarArray (int [] A, int[] B) {
        int [] C = new int[A.length];

        for (int i=0; i<C.length; i++) {
            C[i] = A[i] + B[i];
        }

        return Arrays.toString(C);
    }

    public static void main(String[] args) {
        int [] A = {2,2,2,2,2};
        int [] B = {2,2,2,2,2};

        JOptionPane.showMessageDialog(null, "A soma dos arrays é igual a: "+SomarArray(A, B));
    }
}
