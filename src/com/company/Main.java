package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        fibonacci(12);
        typeQuit();
    }

    public static int parameterCount (String... s){
        return s.length;
    }

    public static int stringLength(String s){
        return s.length();
    }

    public static String longestString(String s1, String s2){
        if (s1.length() > s2.length()){
            return s1;
        }
        else if (s1.length() < s2.length())
            return s2;
        else
            System.out.println("Invalid Strings...");
        return "Invalid Strings";
    }

    public static void userInput(){
        Scanner s = new Scanner(System.in);
        String userLine = s.nextLine();
        while(!userLine.toLowerCase().equals("exit")){
            System.out.println(userLine);
            s.nextLine();
        }
    }

    public static void typeQuit(){
        Scanner s = new Scanner(System.in);
        String userLine = s.nextLine();
        if(userLine.equals("quit"))
            return;
        typeQuit(s);
    }

    private static void typeQuit(Scanner s){
        String userLine = s.nextLine();
        System.out.println(userLine);
        if(userLine.equals("quit"))
            return;
        typeQuit(s);
    }

    public static boolean isEven(int n){
        return (n % 2) == 0;
    }

    public static void fibonacci(int n) {
        int nextNum;
        System.out.println("0");
        System.out.println("1");
        nextNum = 0 + 1;
        fibonacci(1, nextNum, n);
        return;
    }

    public static void fibonacci(int prevNum, int num, int target){


        if(num > target) { return; }
        System.out.println(num);
        int nextNum = prevNum + num;
        fibonacci(num, nextNum, target);
        return;



    }
}
