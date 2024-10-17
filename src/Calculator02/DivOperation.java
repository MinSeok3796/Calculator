package Calculator02;

public class DivOperation extends Operation{
    public DivOperation() {}
    @Override
    public double operate(){
        result = a / b;
        return result;
    }
}
