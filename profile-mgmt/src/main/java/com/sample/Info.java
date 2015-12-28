package com.sample;

/**
 * Created by vgandsa on 12/21/15.
 */
public class Info {
    String name;
    String address;
    String phone;


    public Info(String address, String phone, String name) {
        this.address = address;
        this.phone = phone;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Info)) return false;

        Info info = (Info) o;

        if (!name.equals(info.name)) return false;
        return address.equals(info.address);

    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
