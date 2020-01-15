package info.md7.springi18ndemo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // ID
    private Long languageId;

    private String languageName;

    private String locale;

    @OneToMany(mappedBy = "language")
    private List<Translation> translations = new ArrayList<>();

    @OneToMany(mappedBy = "language")
    private List<Post> posts = new ArrayList<>();


    // Constructor, Getters, Setters

    public Language() {}

    public Long getLanguageId() {
        return languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public String getLocale() {
        return locale;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public void setTranslations(List<Translation> translations) {
        this.translations = translations;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
