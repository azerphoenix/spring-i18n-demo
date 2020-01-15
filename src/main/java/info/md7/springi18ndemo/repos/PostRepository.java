package info.md7.springi18ndemo.repos;

import info.md7.springi18ndemo.models.Language;
import info.md7.springi18ndemo.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Post findPostByPostSlugAndLanguage(String postSlug, Language language);
}
