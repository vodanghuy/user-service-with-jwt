package io.danghuy.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Annotation cua Lombok, tu dong sinh Getter, Setter, toString(), equals(), hashCode()
@NoArgsConstructor // Annotation cua Lombok, tao constructor khong co tham so
@AllArgsConstructor // Annotation cua Lombok, tao constructor voi day du tham so
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
}
