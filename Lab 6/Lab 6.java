/*
 * Aliaa Abobakr Ebrahim Elshiekh
 * 120210151
 * CSE 3
 * Lab 6
 */

// Setters and getters, get a copy of class in another class and make copy of class.

 public class Person {
    private String name, mName, lName;
    Person(String name, String mName, String lName) {
        this.name = name;
        this.mName = mName;
        this.lName = lName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public boolean isNameEqual(String inputName) {
        return this.name.equals(inputName);
    }
    public boolean ismNameEqual(String inputmName) {
        return this.mName.equals(inputmName);
    }
    public boolean islNameEqual(String inputlName) {
        return this.lName.equals(inputlName);
    }
    public boolean equal(Person othrtPerson) {
        return this.name.equals(othrtPerson.name) &&
                this.mName.equals(othrtPerson.mName) &&
                this.lName.equals(othrtPerson.lName);
    }
    public void makeCopy(Person otherPerson) {
        this.name = otherPerson.name;
        this.mName = otherPerson.mName;
        this.lName = otherPerson.lName;
    }

    public Person getCopy() {
        return new Person(this.name, this.mName, this.lName);
    }
    public static void main(String[] args) {
        Person aliaa = new Person("Aliaa", "Abobakr", "Elshiekh");
        Person aliaa2 = new Person("Aliaa", "Abobakr", "Elshiekh");
        Person shahd = new Person("Shahd", "Mohamed", "Zaki");
        Person sohaila = new Person("Sohaila", "Mohamed", "Hassan");

        System.out.println(aliaa.equal(shahd));
        System.out.println(aliaa.equal(aliaa2));

        System.out.println("Aliaa original Object: " + aliaa);
        System.out.println("Aliaa's copy: " + aliaa.getCopy());

        aliaa2.makeCopy(sohaila);
        System.out.println("Aliaa after make copy of sohaila: " + aliaa2.name + " " + aliaa2.mName + " " + aliaa2.lName);
        System.out.println("The real sohaila: " + sohaila.name + " " + sohaila.mName + " " + sohaila.lName);
    }
}
