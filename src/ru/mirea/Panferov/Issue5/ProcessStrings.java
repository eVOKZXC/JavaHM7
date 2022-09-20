package ru.mirea.Panferov.Issue5;

public class ProcessStrings implements StringInterface{
    private char[] string;

    public ProcessStrings(char[] string) {
        this.string = new char[string.length];
    }

    @Override
    public int countChars() {
        int res = 0;
        for(char i : string) res++;
        return res;
    }

    @Override
    public String oddElements() {
        char[] stringNew = new char[string.length];
        int index = 0;
        for (int i = 0; i < string.length; ++i){
            if (i % 2 != 0){
                stringNew[index] = string[i];
                System.out.println(stringNew[index]);
                index++;
            }
        }
        String str = new String(stringNew);
        return str;
    }

    @Override
    public String reverse() {
        for (int i = 0; i < string.length / 2; ++i){
            char temp = string[i];
            string[i] = string[string.length-(i+1)];
            string[string.length-(i+1)] = temp;
        }
        String str = new String(string);
        return str;
    }
}
