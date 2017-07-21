package project;

import java.util.Scanner;


public class ReadInput {
    public String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public int readNumber(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public double readDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
