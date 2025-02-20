package simplecalculator;


public class Calculator {

    
    
    public static double power(double a, double b) {
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
        
        if(b == 0) {
            return 1; 
        }

        return Math.pow(a, b);
    }

    public static double multiply(double a, double b) {
        return (a * b);
    }

    public static double divide(double a, double b) throws ArithmeticException {
        return (a / b);
    }

    public int add(int a, int b) {
        return a + b;
    }
    
    public int substract(int a, int b) {
        return a - b;
    }
    
}
