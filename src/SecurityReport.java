 class SecurityReport {


    public void generateReport(int score) {


        System.out.println(

                "\n===== SECURITY REPORT =====");


        System.out.println(

                "Security Score : "

                        + score

                        + "%");


        if(score >= 80) {

            System.out.println(

                    "Status : SECURE");

        }

        else {

            System.out.println(

                    "Status : NEEDS IMPROVEMENT");

        }


        System.out.println(

                "\nRecommendations");


        System.out.println(

                "- Enable all controls");


        System.out.println(

                "- Conduct monthly audits");


        System.out.println(

                "- Monitor security logs");

    }

}
