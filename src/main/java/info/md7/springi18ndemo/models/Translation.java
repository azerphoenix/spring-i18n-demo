package info.md7.springi18ndemo.models;

import javax.persistence.*;

@Entity
@Table(name = "translations")
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // ID
    private Long translationId;

    @Column(name = "messagekey", length = 3000)
    private String key;

    @Column(name = "messagecontent", length = 100000)
    private String content;

    @ManyToOne
    @JoinColumn(name = "locale")
    private Language language;

    // Constructor, getters, setters
    public Translation() {}

    public Long getTranslationId() {
        return translationId;
    }

    public void setTranslationId(Long translationId) {
        this.translationId = translationId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }


}