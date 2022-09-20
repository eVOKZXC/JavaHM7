package ru.mirea.Panferov.Issue5;

public class Program {
    static public void main(String[] args){
        ProcessStrings processStrings = new ProcessStrings("Study".toCharArray());
        System.out.println(processStrings.countChars());
        System.out.println(processStrings.oddElements());
        System.out.println(processStrings.reverse());
    }
}
