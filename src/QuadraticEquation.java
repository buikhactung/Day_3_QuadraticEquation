public class QuadraticEquation {
    double a, b, c, Delta;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDelta() {
        return (this.b * this.b - 4* this.a*this.c);
    }
    public double getRoot1() {
    return ((-this.b +Math.sqrt(getDelta()))/(2*this.a));
    }
    public double getRoot2() {
        return ((-this.b -Math.sqrt(getDelta()))/(2*this.a));
    }
}
