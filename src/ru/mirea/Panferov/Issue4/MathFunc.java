package ru.mirea.Panferov.Issue4;

public class MathFunc implements MathCalculable{
    @Override
    public int pow(int x, int q) {
        int res = 1;
        for (int i = 0; i < q; ++i) res *= x;
        return res;
    }

    @Override
    public int abs(int x) {
        if(x < 0)  return -1*x;
        else return x;
    }

    public double lengthCircle(int radius){
        return 2*PI*radius;
    }
}
