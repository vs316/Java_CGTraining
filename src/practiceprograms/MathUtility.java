package practiceprograms;

public class MathUtility {
    //Static Method
    static int add(int a, int b){
        return a+b;
    }
    static int diff(int a, int b){
        return a-b;
    }
    static int div(int a, int b){
        if(b!=0){
        return a/b;}
        else {
            return 0;
        }
    }
    static int mult(int a, int b){
        return a*b;
    }
    static int mod(int a, int b){
    return a%b;
    }
}


