package com.github.gittest;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("new string in master branch");
    }
    public void newMethod() {
        System.out.println("new line in feature-newmethod branch");
        System.out.println("new line from feature-newLineInNewMethod branch");
        System.out.println("third line from feature-newLineInNewMethod branch");
    }
}
