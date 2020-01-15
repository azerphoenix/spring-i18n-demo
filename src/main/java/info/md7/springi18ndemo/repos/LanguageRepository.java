package info.md7.springi18ndemo.repos;

import info.md7.springi18ndemo.models.Language;
import info.md7.springi18ndemo.models.Translation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

    Language findLanguageByLocale(String locale);

    boolean existsByLocale(String locale);


}