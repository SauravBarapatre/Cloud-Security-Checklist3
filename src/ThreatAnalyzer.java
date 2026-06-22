class ThreatAnalyzer {

    public void analyzeThreats() {


        String[][] threats = {

                {"Data Breach","High"},

                {"Misconfigured Storage","Medium"},

                {"Malware","High"},

                {"Insider Threat","Medium"},

                {"DDoS Attack","High"}

        };


        System.out.println(

                "\n===== THREAT ANALYSIS =====");


        for(String[] threat : threats) {


            System.out.println(

                    "Threat : "

                            + threat[0]

                            + "\nRisk : "

                            + threat[1]

                            + "\n"

            );

        }

    }

}
