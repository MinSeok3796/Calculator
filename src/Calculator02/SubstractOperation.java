package Calculator02;

public class SubstractOperation extends Operation {

    public SubstractOperation() {}

    @Override
    public double operate(){
        result = a - b;
        return result;
    }
}
