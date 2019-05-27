package com.bsuir.favref.model.db;

import lombok.*;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.jboss.logging.Field;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author a.shakarov
 * @version 1.0
 */
@Entity
@Table(name = "materials")
@Getter
@Setter
@EqualsAndHashCode(exclude = {"tags"})
@NoArgsConstructor
@AllArgsConstructor
@Indexed
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "img")
    private String image;

    @Column(name = "link")
    private String link;

    @Column(name = "isFavorite")
    private Boolean isFavorite;

    @ManyToOne
    @JoinColumn(name = "creator_user")
    private User creatorUser;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "material_tags", joinColumns = @JoinColumn(name = "material_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    @IndexedEmbedded
    private Set<Tag> tags;
}
