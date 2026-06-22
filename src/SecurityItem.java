class SecurityItem {

    private String name;

    private boolean implemented;


    public SecurityItem(String name, boolean implemented) {

        this.name = name;

        this.implemented = implemented;

    }


    public String getName() {

        return name;

    }


    public boolean isImplemented() {

        return implemented;

    }


    public void setImplemented(boolean implemented) {

        this.implemented = implemented;

    }


    @Override

    public String toString() {

        return name + " : "

                + (implemented ?

                "Implemented"

                :

                "Not Implemented");

    }

}
