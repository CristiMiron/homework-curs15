package ro.fasttrackit.curs15;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int diff(int a, int b) {
        return a - b;
    }

    public double division(int a, int b){
        if(b==0){
            return 0;
        }
        return a/b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

}
