class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (null != firstName && !"".equals(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (null != lastName && !"".equals(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        boolean fN = false;
        boolean lN = false;
        String fullName = "Unknown";

        // write your code here
        if (null != firstName && !"".equals(firstName)) {
            fN = true;
        }

        if (null != lastName && !"".equals(lastName)) {
            lN = true;
        }

        if (fN && lN) {
            fullName = firstName + " " + lastName;
        }
        else if(fN && !lN) {
            fullName = firstName;
        }
        else if (!fN && lN) {
            fullName = lastName;
        }

        return fullName;
    }
}