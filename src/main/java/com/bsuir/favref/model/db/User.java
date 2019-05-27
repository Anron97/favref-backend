package com.bsuir.favref.model.db;

import lombok.*;
import org.hibernate.search.annotations.Field;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author a.shakarov
 * @version 1.0
 */

@Entity
@Table(name = "users")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"materials"})
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    @Field
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "photo")
    private String photo;

    @OneToMany(mappedBy = "creatorUser",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Material> materials;

}
