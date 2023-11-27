package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       ReportService reportService = new ReportService(Map.of(
                DocumentType.pdf, 757,
                DocumentType.json, 343,
                DocumentType.xml, 152,
                DocumentType.doc, 514,
                DocumentType.xls, 151));

    }


    static class ReportService {
        public Map<DocumentType, Integer> reportServiceMap;

        public ReportService(Map<DocumentType, Integer> reportServiceMap) {
            this.reportServiceMap = reportServiceMap;
        }


        public double getReportService(Document document) {
            double coefficient = reportServiceMap.get(document.getType());
            double iddoc = document.getIdDoc();
            return iddoc;
        }
    }

    public static class Document {
        private int iddoc;
        private DocumentType type;

        public Document(int iddoc, DocumentType type) {
            this.iddoc = iddoc;
            this.type = type;
        }

        public double getIdDoc() {
            return iddoc;
        }

        public DocumentType getType() {
            return type;
        }
    }

    public enum DocumentType {
        pdf,
        json,
        xml,
        doc,
        xls;

    }
}
// 1) Для добавления нового типа документа, необходимо его прописать в 2-х полях.
// 2) Если будет более 1000 типов отчетов будет расширяться 2 поля.
