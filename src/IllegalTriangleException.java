import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void getInput() throws Exception{
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập vào cạnh A");
            double canhA = scanner.nextDouble();
            System.out.println("nhập vào cạnh B");
            double canhB = scanner.nextDouble();
            System.out.println("nhập vào cạnh C");
            double canhC = scanner.nextDouble();
            if (canhA <0 || canhB<0 || canhC<0 || canhA+canhB<canhC || canhA+canhC<canhB || canhB+canhC<canhA) {
                throw new Exception("Nhap sai roi");
            }
        }catch(Exception e) {
            e.printStackTrace();
            getInput();
        }

    }
    public static void main(String[] args) throws Exception {
        getInput();
    }
}
