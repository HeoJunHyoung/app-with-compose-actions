package actions.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String appName;

    public App() {
    }

    public App(Long id, String appName) {
        this.id = id;
        this.appName = appName;
    }
}
