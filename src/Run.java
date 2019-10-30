import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        double b =  scanner.nextDouble();
        System.out.println("Nhập số c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDelta()<0) {
            System.out.println("No root");
        }else if (quadraticEquation.getDelta()==0) {
            System.out.println("Equation has 1 root: " + quadraticEquation.getRoot1());
        }else {
            System.out.println("Equation has 2 root: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
    }
}
