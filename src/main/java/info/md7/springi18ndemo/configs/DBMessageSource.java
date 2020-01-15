package info.md7.springi18ndemo.configs;

import info.md7.springi18ndemo.models.Translation;
import info.md7.springi18ndemo.repos.TranslationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Locale;

@Component("messageSource")
public class DBMessageSource extends AbstractMessageSource {

    @Autowired
    private TranslationRepository translationRepository;

    private static final String DEFAULT_LOCALE_CODE = "ru";

    @Override
    protected MessageFormat resolveCode(String key, Locale locale) {

        Translation message = translationRepository.findByKeyAndLanguageLocale(key, locale.getLanguage()).orElse(new Translation());

        if (message == null || message.getContent() == null) {
            return null;
        }
        return new MessageFormat(message.getContent(), locale);
    }

}