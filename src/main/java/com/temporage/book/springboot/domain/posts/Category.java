package com.temporage.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "category_name", length = 128, nullable = false)
    private String categoryName;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'hh:mm:ss")
    @CreationTimestamp
    private LocalDate create_date;

    @Builder
    public Category(String category_name){
        this.categoryName = category_name;
    }

}
