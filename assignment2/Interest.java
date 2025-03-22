interface InterestInterface{
    static final double interest = 25.0;

    double SimpleInterest(double p,double t);
    double CompoundInterest(double p,double t,double n);

}


class InterestCalculator implements InterestInterface{

    public double SimpleInterest(double p,double t){
        return (p * interest * t) / 100;
    }

    public double CompoundInterest(double p,double t,double n){
        return p * Math.pow((1 + (interest / (100 * n))), n * t) - p;
    }
}


public class Interest {
    public static void main(String[] args){
        InterestCalculator calc = new InterestCalculator();
        double principal = 1000, time = 2, n = 4;
        System.out.println("= = Interest Rate Calculator = = \n Mohammed Rayaan Pasha \n 10-03-25\n"); 
        System.out.println("Simple Interest: " + calc.SimpleInterest(principal, time));
        System.out.println("Compound Interest: " + calc.CompoundInterest(principal, time, n));

    }
}
