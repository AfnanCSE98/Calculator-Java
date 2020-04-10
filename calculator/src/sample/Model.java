package sample;

public class Model {
    public double calculate(long a , long b , String operator){
        switch (operator){
            case "+":
                return a+b;
            case "-":
                return  a-b;
            case  "/":
                if(b==0)return  0;
                return  (double)(a/b);
            case  "*":
                return a*b;
                default:
                    return  0;
        }
    }
}
