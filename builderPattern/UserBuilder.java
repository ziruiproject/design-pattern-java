package builderPattern;

public class UserBuilder {
    private User user = new User();

    public UserBuilder setName(String name) {
        user.name = name;
        return this;
    }

    public UserBuilder setUsername(String username) {
        user.username = username;
        return this;
    }

    public UserBuilder setPassword(String password) {
        user.password = password;
        return this;
    }

    public UserBuilder set(String username) {
        user.username = username;
        return this;
    }

    public UserBuilder setAge(int age) {
        user.age = age;
        return this;
    }

    public UserBuilder setUsername(double salary) {
        user.salary = salary;
        return this;
    }

    public UserBuilder setCountry(String country) {
        user.country = country;
        return this;
    }

    public UserBuilder setAddress(String address) {
        user.address = address;
        return this;
    }

    public User build() {
        return user;
    }
}
