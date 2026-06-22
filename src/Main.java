class Main {


    public static void main(String[] args) {


        SecurityChecklist checklist

                = new SecurityChecklist();


        ThreatAnalyzer analyzer

                = new ThreatAnalyzer();


        SecurityReport report

                = new SecurityReport();



        checklist.displayChecklist();



        analyzer.analyzeThreats();



        int score

                = checklist.getScore();



        report.generateReport(score);

    }

}
