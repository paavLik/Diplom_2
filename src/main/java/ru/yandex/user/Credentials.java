package ru.yandex.user;

public class Credentials {
    private String email;
    private String password;
    private String name;

    public static Credentials from(User user) {
        return new Credentials(user.getEmail(), user.getPassword(), user.getName());
    }

    public Credentials(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}