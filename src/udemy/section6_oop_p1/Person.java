package udemy.section6_oop_p1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {
        return ((this.age > 12) && (this.age < 20));
    }

    public String getFullName() {
        String result = "";

        if (!firstName.isEmpty()) {
            result += firstName + " ";
        }

        if (!lastName.isEmpty()) {
            result += lastName;
        }

        return result.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100)) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
