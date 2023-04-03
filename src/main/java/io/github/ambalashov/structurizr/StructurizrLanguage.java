package io.github.ambalashov.structurizr;

import com.intellij.lang.Language;

public class StructurizrLanguage extends Language {

    public static final StructurizrLanguage INSTANCE = new StructurizrLanguage();

    private StructurizrLanguage() {
        super("Structurizr");
    }

}