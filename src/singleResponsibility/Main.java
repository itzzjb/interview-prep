package singleResponsibility;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("Report 1", "This is a report.");
        ReportPrinter.printReport(report);
    }
}
