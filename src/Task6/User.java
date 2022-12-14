package Task6;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(final String firstName, final String lastName, final int age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {

        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {

        this.email = email;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        final User user = (User) o;
        return getAge() == user.getAge() && Objects.equals(getFirstName(),
                user.getFirstName()) && Objects.equals(getLastName(),
                user.getLastName()) && Objects.equals(getEmail(),
                user.getEmail());
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getEmail());
    }
}
