package spike.mongodb.model;

import org.springframework.data.annotation.Id;

public class HumanModel {
    @Id
    public String Id;

    public String name;

    public HumanModel() {
    }

    public HumanModel(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
