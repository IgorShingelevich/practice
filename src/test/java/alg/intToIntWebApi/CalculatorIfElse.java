package alg.intToIntWebApi;

public class CalculatorIfElse {
    public int businessProcess(int a) {
        if (a>=1 && a <= 10) return a * 2;
        else if (a >= 11 && a <= 15) return a / 2;
        else if (a >= 16 && a <=20) throw new RuntimeException("first exception range");
        else if ( a >= 21 && a <= 25) throw new RuntimeException("second exception range");
        else throw new RuntimeException("Out of range");
    }
}
