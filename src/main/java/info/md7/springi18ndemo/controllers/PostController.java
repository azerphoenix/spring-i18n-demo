package info.md7.springi18ndemo.controllers;

import info.md7.springi18ndemo.repos.LanguageRepository;
import info.md7.springi18ndemo.repos.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping("/{postSlug}")
    public String postView (
            @PathVariable("postSlug") String postSlug,
            Model model,
            Locale locale

    ) {
        model.addAttribute("post", postRepository.findPostByPostSlugAndLanguage(postSlug, languageRepository.findLanguageByLocale(locale.getLanguage())));
        return"postView";
    }
}
