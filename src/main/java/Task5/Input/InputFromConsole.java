package Task5.Input;

public class InputFromConsole {
    private double arg1;
    private String operType;
    private double arg2;

    public InputFromConsole() {
    }

    public InputFromConsole(double arg1, String operType, double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operType = operType;
    }

    public double getArg1() {
        return arg1;
    }

    public void setArg1(double arg1) {
        this.arg1 = arg1;
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType;
    }

    public double getArg2() {
        return arg2;
    }

    public void setArg2(double arg2) {
        this.arg2 = arg2;
    }
}
