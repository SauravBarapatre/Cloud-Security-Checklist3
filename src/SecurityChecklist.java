import java.util.ArrayList;

import java.util.List;
class SecurityChecklist {


    private List<SecurityItem> checklist;


    public SecurityChecklist() {

        checklist = new ArrayList<>();


        checklist.add(

                new SecurityItem(

                        "Multi-Factor Authentication",

                        true));


        checklist.add(

                new SecurityItem(

                        "Role-Based Access Control",

                        true));


        checklist.add(

                new SecurityItem(

                        "Encryption At Rest",

                        true));


        checklist.add(

                new SecurityItem(

                        "Encryption In Transit",

                        false));


        checklist.add(

                new SecurityItem(

                        "Firewall Configuration",

                        true));

    }



    public void displayChecklist() {

        System.out.println(

                "\n===== CLOUD SECURITY CHECKLIST =====");


        for(SecurityItem item : checklist) {

            System.out.println(item);

        }

    }


    public int getScore() {

        int count = 0;


        for(SecurityItem item : checklist) {

            if(item.isImplemented()) {

                count++;

            }

        }


        return (count * 100)

                / checklist.size();

    }

}
