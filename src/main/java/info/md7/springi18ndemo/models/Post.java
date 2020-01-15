package info.md7.springi18ndemo.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // ID
    private Long postId;

    // Заголовок статьи
    private String postTitle;

    // Текст статьи
    @Column( length = 100000 )
    private String postContent;

    // ЧПУ статьи
    private String postSlug;

    // Дата и время создания
    @Column(nullable = false, updatable = false)
    private LocalDateTime creationDate;

    @ManyToOne
    @JoinColumn(name = "locale")
    private Language language;

    // Constructor, getters, setters

    public Post(){}

    public Long getPostId() {
        return postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public String getPostSlug() {
        return postSlug;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public void setPostSlug(String postSlug) {
        this.postSlug = postSlug;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }


}
