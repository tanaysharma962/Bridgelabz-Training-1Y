package com.gla.polymorphism.storyQuestions;
import java.util.*;
    class Book{
        int bookId;String title;double price;
        static String libraryName="City Library";
        Book(int bookId,String title,double price){
            this.bookId=bookId;
            this.title=title;
            this.price=price;
        }
        double calculateFine(int daysLate){
            return 0;
        }
    }
    class TextBook extends Book{
        TextBook(int bookId,String title,double price){
            super(bookId,title,price);
        }
        double calculateFine(int daysLate){
            return daysLate*2;
        }
    }
    class Magazine extends Book{
        Magazine(int bookId,String title,double price){
            super(bookId,title,price);
        }
        double calculateFine(int daysLate){
            return daysLate*5;
        }
    }
    class Main{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter days late:");
            int days=sc.nextInt();
            Book b1=new TextBook(1,"Java",500);
            Book b2=new Magazine(2,"TechToday",200);
            System.out.println("Library: "+Book.libraryName);
            System.out.println("TextBook Fine: "+b1.calculateFine(days));
            System.out.println("Magazine Fine: "+b2.calculateFine(days));
        }
    }

