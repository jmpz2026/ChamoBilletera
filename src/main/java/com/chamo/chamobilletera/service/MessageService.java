package com.chamo.chamobilletera.manager;


import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class MessageManager {

    private final MessageSource messageSource;

    public MessageManager(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String get(String key) {
        return messageSource.getMessage(key, null, LocaleContextHolder.getLocale());
    }

    public String get(String key, Object... args) {
        return messageSource.getMessage(key, args, LocaleContextHolder.getLocale());
    }
}
