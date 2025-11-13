package io.danghuy.userservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data // Annotation cua Lombok, tu dong sinh Getter, Setter, toString(), equals(), hashCode()
@NoArgsConstructor // Annotation cua Lombok, tao constructor khong co tham so
@AllArgsConstructor // Annotation cua Lombok, tao constructor voi day du tham so
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, updatable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @ManyToAny(fetch = FetchType.EAGER)
    /*
        The hien moi quan he n - n giua User va Role.
        fetch = FetchType.EAGER - khi lay User, Hibernate tu truy xuat
        danh sach roles (thay vi cho goi)
     */
    private Collection<Role> roles = new ArrayList<>();
}
