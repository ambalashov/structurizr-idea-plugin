package io.github.ambalashov.sturcturizr;

import com.intellij.lang.Language;

public class StructurizrLanguage extends Language {

    public static final StructurizrLanguage INSTANCE = new StructurizrLanguage();

    private StructurizrLanguage() {
        super("Structurizr");
    }

}