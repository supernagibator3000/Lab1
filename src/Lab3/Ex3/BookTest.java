package Lab3.Ex3;

import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year;
        String author, title;
        Book book = new Book();

        System.out.println("Enter the book info (author, title, year): ");

        author = sc.nextLine();
        title = sc.nextLine();
        year = sc.nextInt();

        book.setAuthor(author);
        book.setTitle(title);
        book.setYear(year);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());
    }
}