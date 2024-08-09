public class Fractions {
    private int num;
    private int den;
    public Fractions(int numerator, int denominator){
        if (denominator == 0){
            throw new ArithmeticException();
        }
        int GCD = getGCD(numerator, denominator);
        num = numerator/GCD;
        den = denominator/GCD;
    }
    public int getNum(){
        return num;
    }
    public int getDenom(){
        return den;
    }
    public int getGCD (int a, int b){
        if(b == 0) return a;
        return getGCD(b, a % b);
    }
    public String toString(){
        return num + "/" + den;
    }

    public static void main(String[] args) {
        Fractions f = new Fractions(10, 20);
        System.out.println(f.toString());
    }
}
