package Calculator02;

public class AddOperation extends Operation {
    public AddOperation(){}

    @Override
    public double operate(){
        result = a + b;
        return result;
    }
}
