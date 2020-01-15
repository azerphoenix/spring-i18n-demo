package info.md7.springi18ndemo.repos;

import info.md7.springi18ndemo.models.Translation;
import info.md7.springi18ndemo.projections.TranslationProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TranslationRepository extends JpaRepository<Translation, Long> {

    Optional<Translation> findByKeyAndLanguageLocale(String key, String locale);

    boolean existsByKeyAndLanguageLocale(String key, String locale);

    @Query(value =
            "SELECT \"messagekey\",\n" +
                    "       MAX(CASE WHEN (\"locale\"='1') THEN \"messagecontent\" ELSE null END ) AS content_de," +
                    "       MAX(CASE WHEN (\"locale\"='2') THEN \"messagecontent\" ELSE null END ) AS content_ru," +
                    "       MAX(CASE WHEN (\"locale\"='3') THEN \"messagecontent\" ELSE null END ) AS content_en," +
                    "       MAX(CASE WHEN (\"locale\"='1') THEN \"translation_id\" ELSE null END ) AS id_de," +
                    "       MAX(CASE WHEN (\"locale\"='2') THEN \"translation_id\" ELSE null END ) AS id_ru," +
                    "       MAX(CASE WHEN (\"locale\"='3') THEN \"translation_id\" ELSE null END ) AS id_en " +
                    "FROM \"translations\" GROUP BY \"messagekey\";", nativeQuery = true)
    List<TranslationProjection> getAllTranslationsWithLocaleAndId();
}
