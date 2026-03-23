package Interfaces.DefaultMethodsinInterfaces.DatExportFeature;

public class ExportSystem {
    public static void main(String[] args) {

        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();

        csv.exportData();
        csv.exportToJSON();

        pdf.exportData();
        pdf.exportToJSON();
    }
}
