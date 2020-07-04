package com.codegym.blog.models;



import com.codegym.blog.validation.NameAuthorConstraint;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Size(min=5,max=50,message = "Tiêu đề không được nhỏ hơn 5 hoặc lớn 50 kí tự")
    @Column(name="title")
    private String title ;

    @Size(min=300,message = "nội dung không nhỏ hơn 300 kí tự")
    @Column(name="content",length = 5000)
    private String content ;

    @NameAuthorConstraint
    @Column(name="author")
    private String author ;


    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    private Date blogUploadDate = new Date();

    @Column(name="isDelete")
    private Boolean isDelete ;

    @JoinColumn(name="category_id")
    @ManyToOne(targetEntity = Category.class)
    private Category category ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getBlogUploadDate() {
        return blogUploadDate;
    }

    public void setBlogUploadDate(Date blogUploadDate) {
        this.blogUploadDate = blogUploadDate;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Post() {
    }
}
