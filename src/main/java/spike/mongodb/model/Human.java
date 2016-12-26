package spike.mongodb.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class Human {

    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String password;

    private String email;
    private int age;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
