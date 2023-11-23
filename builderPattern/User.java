package builderPattern;

public class User {
    String name;
    String username;
    String password;
    int age;
    double salary;
    String country;
    String address;

    // User(String name, String username, String password,
    // int age, double salary, String country, String address) {
    // this.name = name;
    // this.username = username;
    // this.password = password;
    // this.age = age;
    // this.salary = salary;
    // this.country = country;
    // this.address = address;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
