package com.sample;

/**
 * Created by vgandsa on 12/21/15.
 */
public class User implements Comparable<User>{


    private  String firstName;

    private String lastName;
     private int age;
    public User(String fname, String lastName, int age){
        this.firstName=fname;
        this.lastName=lastName;
        this.age=age;

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
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getAge() != user.getAge()) return false;
        if (!getFirstName().equals(user.getFirstName())) return false;
        return getLastName().equals(user.getLastName());

    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return  "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User other) {

        int i = firstName.compareTo(other.firstName);
        if (i != 0) return i;

        i = lastName.compareTo(other.lastName);
        if (i != 0) return i;

        return Integer.compare(age, other.age);
    }
}
