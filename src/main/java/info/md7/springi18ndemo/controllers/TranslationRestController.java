package info.md7.springi18ndemo.controllers;

import info.md7.springi18ndemo.projections.TranslationProjection;
import info.md7.springi18ndemo.repos.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/translations")
public class TranslationRestController {

    @Autowired
    private TranslationRepository translationRepository;


    @GetMapping()
    public List<TranslationProjection> getAllTranslations() {
        return translationRepository.getAllTranslationsWithLocaleAndId();
    }


}
