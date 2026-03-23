import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class Main {
    public static void main(String[] args){
        Book b1 = new Book("Java Basics", "Author A");
        Member m1 = new Member("Rahul", 101);
        Transaction t1 = new Transaction();

        b1.displayBook();
        m1.displayMember();
        t1.issueBook(m1, b1);
    }
}