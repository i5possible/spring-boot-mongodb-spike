package spike.mongodb.model;

import org.springframework.stereotype.Component;

@Component
public class Human {

    private String id;
    private String name;
    private String password;


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
}
