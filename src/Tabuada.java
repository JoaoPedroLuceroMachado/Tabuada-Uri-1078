import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numleit = sc.nextInt();

        for(int numtabuada = 1; numtabuada <= 10; numtabuada++){
            int Rtabuada = numleit * numtabuada;
            System.out.println(numtabuada + " x " + numleit + " = " + Rtabuada);
        }

    }
}
