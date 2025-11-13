package io.danghuy.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data // Annotation cua Lombok, tu dong sinh Getter, Setter, toString(), equals(), hashCode()
@NoArgsConstructor // Annotation cua Lombok, tao constructor khong co tham so
@AllArgsConstructor // Annotation cua Lombok, tao constructor voi day du tham so
public class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
