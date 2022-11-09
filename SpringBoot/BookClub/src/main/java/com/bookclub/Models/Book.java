package com.bookclub.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Setter
@Getter
    @Entity
    @Table(name="books")
    public class Book {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @NotNull
        @NotEmpty(message="Title is required!")
        private String Title;

        @NotNull
        @NotBlank
        @NotEmpty(message="Author Name is required!")
        private String authorname;

        @NotNull
        @NotBlank
        @NotEmpty(message="Password is required!")
        private String thoughts;

        @Column(updatable=false)
        @DateTimeFormat(pattern="yyyy-MM-dd")
        private Date createdAt;
        @DateTimeFormat(pattern="yyyy-MM-dd")
        private Date updatedAt;

        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="user_id")
        private User postedBy;

        public Book() {}
    }
