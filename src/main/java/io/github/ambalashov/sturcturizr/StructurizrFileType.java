package io.github.ambalashov.sturcturizr;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class StructurizrFileType extends LanguageFileType {

    public static final StructurizrFileType INSTANCE = new StructurizrFileType();

    private StructurizrFileType() {
        super(StructurizrLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Structurizr File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Structurizr language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "structz";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return StructurizrIcons.FILE;
    }

}