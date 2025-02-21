package simplecalculator;


public class Calculator {

    
    
    public double power(double a, double b) {
        if (a == 0) {
            if (b > 0) {
                return 0; 
            } else if (b < 0) {
                throw new ArithmeticException();
            } else {
                return 1; 
            }
        }

        if (a < 0 && (b % 1 != 0)) {
            throw new ArithmeticException();
        }

        if (b == 0) {
            return 1;
        }


        double result = Math.pow(a, b);

        if (Double.isInfinite(result)) {
            throw new ArithmeticException(); 
        }
        if (Double.isNaN(result)) {
             throw new ArithmeticException(); 
        }

        return result;
    }

    public double multiply(double a, double b) {
        return (a * b);
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException(); 
        }
        return a / b;
    }

    public double add(double a, double b) {
        return a + b;
    }
    
    public double substract(double a, double b) {
        return a - b;
    }
    
}
