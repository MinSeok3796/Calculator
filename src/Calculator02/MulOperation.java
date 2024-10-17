package Calculator02;

public class MulOperation extends Operation{
    public MulOperation() {}

    @Override
    public double operate(){
        result = a * b;
        return result;
    }
}
