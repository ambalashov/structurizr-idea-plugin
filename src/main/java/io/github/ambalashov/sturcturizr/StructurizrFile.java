package io.github.ambalashov.sturcturizr;


import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class StructurizrFile extends PsiFileBase {

    public StructurizrFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, StructurizrLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return StructurizrFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Structurizr File";
    }

}