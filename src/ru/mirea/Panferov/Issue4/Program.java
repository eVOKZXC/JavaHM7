package ru.mirea.Panferov.Issue4;

public class Program {
    static public void main(String[] args){
        MathCalculable mathCalculable = new MathFunc();
        MathFunc mathFunc = new MathFunc();
        System.out.println(mathCalculable.abs(-12));
        System.out.println(mathCalculable.pow(2,8));
        System.out.println(mathFunc.lengthCircle(5));
    }
}
