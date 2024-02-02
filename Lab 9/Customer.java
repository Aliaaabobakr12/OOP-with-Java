/*
 * Aliaa Abobakr Ebrahim Elshiekh
 * 120210151
 * CSE 3
 * Lab 9
 */

 class Customer {
    private String name, memberType;
    private boolean isMember;

    public Customer(String name) {
        this.name = name;
        this.isMember = false;
        this.memberType = "";
    }

    public String getName() {
        return this.name;
    }

    public boolean isMember() {
        return this.isMember;
    }
    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }
    public String getMemberType() {
        return this.memberType;
    }
    public void setMemberType(String type) {
        this.memberType = type;
    }

    @Override
    public String toString() {
        return "Customer \n" +
                "Name: " + name + "\n" +
                "isMember: " + isMember + "\n" +
                "Member Type='" + memberType;
    }
}