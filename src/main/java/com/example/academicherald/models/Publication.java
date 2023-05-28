package com.example.academicherald.models;

import com.example.academicherald.enums.PublicationType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "publications")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String subtitle;
    private String text;
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dateOfCreation = LocalDateTime.now();

    @ManyToMany
    @JoinColumn(name = "category")
//    @Size(max = 1)
    @JsonIgnore
    private List<Category> category;

    @ManyToOne
    @JoinColumn(name = "author")
    @JsonBackReference
    private User author;

    @Enumerated(EnumType.STRING)
    private PublicationType type;

    @ManyToMany
    @JoinTable(
            name = "publication_tags",
            joinColumns = @JoinColumn(name = "publication_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @JsonIgnore
    private List<Tag> tags;
}
