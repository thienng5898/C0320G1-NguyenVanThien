package lopVaDoiTuongtrongJava.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public Double getRoot1() {
        if (this.getDiscriminant() >= 0 && a != 0) {
            return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        }
        return null;
    }

    public Double getRoot2() {
        if (this.getDiscriminant() >= 0 && a != 0) {
            return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
        }
        return null;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2.0) - 4 * a * c;
    }

    public static void main(String[] args) {
        double n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        double a = sc.nextDouble();
        System.out.println("nhap b: ");
        double b = sc.nextDouble();
        System.out.println("nhap c: ");
        double c = sc.nextDouble();

        QuadraticEquation b1 = new QuadraticEquation(a, b, c);
        double delta = b1.getDiscriminant();
        if (b1.getDiscriminant() > 0) {
            System.out.printf("The equation has two roots: %.5f and %.5f.\n", b1.getRoot1(), b1.getRoot2());
        } else if (b1.getDiscriminant() == 0) {
            System.out.printf("The equation has one root: %.5f.\n", b1.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }
        sc.close();
    }
}
