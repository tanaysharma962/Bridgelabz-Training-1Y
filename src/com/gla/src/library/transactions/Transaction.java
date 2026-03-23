package library.transactions;
import library.books.Book;
import library.members.Member;
public class Transaction {

        public void issueBook(Member m, Book b) {
            System.out.println("Issuing book to " + m);
            b.borrowBook();
        }
    }
