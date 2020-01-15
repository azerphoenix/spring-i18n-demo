package info.md7.springi18ndemo.initDemoData;

import info.md7.springi18ndemo.models.Language;
import info.md7.springi18ndemo.models.Post;
import info.md7.springi18ndemo.models.Translation;
import info.md7.springi18ndemo.repos.LanguageRepository;
import info.md7.springi18ndemo.repos.PostRepository;
import info.md7.springi18ndemo.repos.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class DemoDataInitializr {

    @Autowired
    private LanguageRepository languageRepository;

    @Autowired
    private TranslationRepository translationRepository;

    @Autowired
    private PostRepository postRepository;

    // Init languages
    @PostConstruct
    private void initLanguages() {

        Language de = new Language();
        de.setLanguageName("Deutsch");
        de.setLocale("de");
        languageRepository.save(de);

        Language ru = new Language();
        ru.setLanguageName("Русский");
        ru.setLocale("ru");
        languageRepository.save(ru);

        Language en = new Language();
        en.setLanguageName("English");
        en.setLocale("en");
        languageRepository.save(en);
    }

    // Init translations
    @PostConstruct
    private void initTranslations() {

        Translation home_RU = new Translation();
        home_RU.setKey("home");
        home_RU.setContent("Главная");
        home_RU.setLanguage(languageRepository.findLanguageByLocale("ru"));
        translationRepository.save(home_RU);

        Translation home_EN = new Translation();
        home_EN.setKey("home");
        home_EN.setContent("Home");
        home_EN.setLanguage(languageRepository.findLanguageByLocale("en"));
        translationRepository.save(home_EN);

        Translation home_DE = new Translation();
        home_DE.setKey("home");
        home_DE.setContent("Startseite");
        home_DE.setLanguage(languageRepository.findLanguageByLocale("de"));
        translationRepository.save(home_DE);

        Translation localizedPost_RU = new Translation();
        localizedPost_RU.setKey("localizedPost");
        localizedPost_RU.setContent("Статья");
        localizedPost_RU.setLanguage(languageRepository.findLanguageByLocale("ru"));
        translationRepository.save(localizedPost_RU);

        Translation localizedPost_EN = new Translation();
        localizedPost_EN.setKey("localizedPost");
        localizedPost_EN.setContent("Post Example");
        localizedPost_EN.setLanguage(languageRepository.findLanguageByLocale("en"));
        translationRepository.save(localizedPost_EN);

        Translation localizedPost_DE = new Translation();
        localizedPost_DE.setKey("localizedPost");
        localizedPost_DE.setContent("Artikelbeispiel");
        localizedPost_DE.setLanguage(languageRepository.findLanguageByLocale("de"));
        translationRepository.save(localizedPost_DE);

        Translation rest_RU = new Translation();
        rest_RU.setKey("rest");
        rest_RU.setContent("REST запрос");
        rest_RU.setLanguage(languageRepository.findLanguageByLocale("ru"));
        translationRepository.save(rest_RU);

        Translation rest_EN = new Translation();
        rest_EN.setKey("rest");
        rest_EN.setContent("REST request");
        rest_EN.setLanguage(languageRepository.findLanguageByLocale("en"));
        translationRepository.save(rest_EN);

        Translation rest_DE = new Translation();
        rest_DE.setKey("rest");
        rest_DE.setContent("REST Anfrage");
        rest_DE.setLanguage(languageRepository.findLanguageByLocale("de"));
        translationRepository.save(rest_DE);

        Translation language_RU = new Translation();
        language_RU.setKey("language");
        language_RU.setContent("Язык");
        language_RU.setLanguage(languageRepository.findLanguageByLocale("ru"));
        translationRepository.save(language_RU);

        Translation language_EN = new Translation();
        language_EN.setKey("language");
        language_EN.setContent("Language");
        language_EN.setLanguage(languageRepository.findLanguageByLocale("en"));
        translationRepository.save(language_EN);

        Translation language_DE = new Translation();
        language_DE.setKey("language");
        language_DE.setContent("Sprache");
        language_DE.setLanguage(languageRepository.findLanguageByLocale("de"));
        translationRepository.save(language_DE);

    }


    // Init Posts
    @PostConstruct
    private void initPosts(){

        Post post1 = new Post();
        post1.setPostTitle("Заголовок на русском");
        post1.setPostContent(" Задача организации, в особенности же консультация с широким активом позволяет оценить значение дальнейших направлений развития. Разнообразный и богатый опыт консультация с широким активом играет важную роль в формировании модели развития. Повседневная практика показывает, что реализация намеченных плановых заданий позволяет оценить значение направлений прогрессивного развития. С другой стороны рамки и место обучения кадров позволяет выполнять важные задания по разработке соответствующий условий активизации. Идейные соображения высшего порядка, а также реализация намеченных плановых заданий требуют от нас анализа направлений прогрессивного развития. С другой стороны новая модель организационной деятельности требуют от нас анализа форм развития.\n" +
                "\n" +
                "Таким образом укрепление и развитие структуры играет важную роль в формировании форм развития. Повседневная практика показывает, что постоянный количественный рост и сфера нашей активности представляет собой интересный эксперимент проверки модели развития. Повседневная практика показывает, что постоянный количественный рост и сфера нашей активности в значительной степени обуславливает создание форм развития. С другой стороны начало повседневной работы по формированию позиции играет важную роль в формировании позиций, занимаемых участниками в отношении поставленных задач. Не следует, однако забывать, что постоянный количественный рост и сфера нашей активности влечет за собой процесс внедрения и модернизации систем массового участия.\n" +
                "\n" +
                "Разнообразный и богатый опыт реализация намеченных плановых заданий позволяет оценить значение новых предложений. С другой стороны сложившаяся структура организации представляет собой интересный эксперимент проверки направлений прогрессивного развития. Товарищи! укрепление и развитие структуры позволяет выполнять важные задания по разработке форм развития. Повседневная практика показывает, что постоянное информационно-пропагандистское обеспечение нашей деятельности играет важную роль в формировании форм развития. Равным образом дальнейшее развитие различных форм деятельности влечет за собой процесс внедрения и модернизации позиций, занимаемых участниками в отношении поставленных задач. Товарищи! консультация с широким активом влечет за собой процесс внедрения и модернизации направлений прогрессивного развития. ");
        post1.setPostSlug("my-post");
        post1.setCreationDate(LocalDateTime.now());
        post1.setLanguage(languageRepository.findLanguageByLocale("ru"));
        postRepository.save(post1);


        Post post2 = new Post();
        post2.setPostTitle("Hier gibt es einfache deutsche Texte");
        post2.setPostContent("Hier gibt es einfache deutsche Texte, mit denen du dein Leseverstehen verbessern kannst. Deutschlehrer mit langjähriger Erfahrung haben diese Texte geschrieben, deshalb sind sie perfekt auf die Sprachniveaus A1 und A2 abgestimmt.\n" +
                "\n" +
                "Die Texte für Anfänger vermitteln Basisvokabular und einfach strukturierte Sätze.\n" +
                "\n" +
                "Das innovative System stellt in jeder Lektion dein Niveau fest, damit du schnell die für dich geeigneten Texte finden kannst.\n" +
                "\n" +
                "Nach jedem Text kannst du dein Leseverständnis überprüfen, indem du die Begleitfragen beantwortest. Jeder Text ist auch kostenlos als PDF verfügbar. Sie sind sowohl zum Lernen in Eigenregie als auch für den Unterricht geeignet. ");
        post2.setPostSlug("my-post");
        post2.setCreationDate(LocalDateTime.now());
        post2.setLanguage(languageRepository.findLanguageByLocale("de"));
        postRepository.save(post2);

        Post post3 = new Post();
        post3.setPostTitle("This is post title");
        post3.setPostContent("Lorem ipsum dolor sit amet, putant dictas probatus ad has. Iudico temporibus id nam, meliore dolores mandamus nec ad, aperiam repudiandae reprehendunt ea eam. Justo saepe nec id. Nostrud discere sit id. Minim recusabo in qui, pro dignissim ullamcorper ea.\n" +
                "\n" +
                "Ut est legere nostrum interesset, eu his ullum sententiae signiferumque. Fabellas facilisi assueverit per te, et augue congue pro, imperdiet pertinacia consetetur eu usu. Ponderum petentium cu cum. Dico minim labitur ei has, zril instructior no cum.\n" +
                "\n" +
                "Saperet accusam probatus no usu, tota omnium appetere no mel. Eu cum labore urbanitas, modus graecis cu vis. Usu et equidem honestatis, usu mutat erant ne. Malis placerat adipisci est cu, vix falli veniam fastidii at. Saepe ancillae ad eam, per quem enim similique ad, integre discere nominati ei nec.");
        post3.setPostSlug("my-post");
        post3.setCreationDate(LocalDateTime.now());
        post3.setLanguage(languageRepository.findLanguageByLocale("en"));
        postRepository.save(post3);



    }
}
