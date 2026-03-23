package Interfaces.DefaultMethodsinInterfaces.DatExportFeature;

public class CSVExporter implements DataExporter {
    public void exportData() {
        System.out.println("Data exported to CSV");
    }
}

class PDFExporter implements DataExporter {

    public void exportData() {
        System.out.println("Data exported to PDF");
    }
}
