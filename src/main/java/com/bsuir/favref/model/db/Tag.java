package com.bsuir.favref.model.db;

import lombok.*;
import org.hibernate.search.annotations.Field;

import javax.persistence.*;
import java.util.Set;

/**
 * @author a.shakarov
 * @version 1.0
 */
@Entity
@Table(name = "tags")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"materials"})
@NoArgsConstructor
@AllArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private Long id;

    @ManyToMany(mappedBy = "tags", cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST},
            fetch = FetchType.LAZY)
    private Set<Material> materials;

    @Column(name = "tag_name")
    @Field
    private String tagName;

}
