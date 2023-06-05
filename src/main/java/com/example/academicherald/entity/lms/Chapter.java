package com.example.academicherald.entity.lms;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "chapter")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne

    private Course course;
    @OneToMany
//    @JsonIgnore
    private List<Lectures> lectures;
    @OneToMany
//    @JsonIgnore
    private List<Exercise> exercises;

    public void setCourse(Course course) {
        this.course = course;
        course.getChapters().add(this); // Добавляем текущую главу в список глав курса
    }

}