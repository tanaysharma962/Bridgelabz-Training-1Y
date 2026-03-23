package Interfaces.StaticMethodsinInterfaces.DateFormatUtility;
import java.time.LocalDate;
public class InvoiceGenerator {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String formattedDate = DateUtils.formatDate(today, "dd-MM-yyyy");

        System.out.println("Invoice Date: " + formattedDate);
    }
}
