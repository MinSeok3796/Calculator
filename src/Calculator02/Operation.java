package Calculator02;

public abstract class Operation {

    double a,b = 0;
    double result = 0;
    public Operation(){}

    public void setNum(double a, double b){
        this.a = a;
        this.b = b;
    }

    public abstract double operate();

}
