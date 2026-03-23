package Interfaces.DefaultMethodsinInterfaces.DatExportFeature;

public interface DataExporter {

    void exportData();

    // Default method
    default void exportToJSON() {
        System.out.println("Exporting data to JSON format...");
    }
}
