package solidPrinciples.singleResponsibility;

public class ReportPrinter {

    public static void printReport(Report report) {
        System.out.println("Report name: " + report.getName());
        System.out.println("Report text: " + report.getText());
    }
}
