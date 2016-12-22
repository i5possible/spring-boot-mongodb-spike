package spike.mongodb.model;

import org.springframework.stereotype.Component;

@Component
public class Human {

    private String id;
    private String name;


    public Human() {
    }

    public Human(String name) {
        this.name = name;
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
}
