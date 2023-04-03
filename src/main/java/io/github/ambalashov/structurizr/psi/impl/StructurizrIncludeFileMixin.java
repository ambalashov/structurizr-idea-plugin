package io.github.ambalashov.structurizr.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.model.Symbol;
import com.intellij.model.psi.PsiSymbolReference;
import com.intellij.openapi.paths.PathReferenceManager;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import io.github.ambalashov.structurizr.psi.StructurizrIncludeFile;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Collections;

import static io.github.ambalashov.structurizr.psi.StructurizrTypes.FILE;

public class StructurizrIncludeFileMixin extends ASTWrapperPsiElement implements StructurizrIncludeFile, PsiSymbolReference {
    public StructurizrIncludeFileMixin(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public @NotNull PsiElement getFile() {
        return findNotNullChildByType(FILE);
    }

    @Override
    public PsiReference @NotNull [] getReferences() {
        return PathReferenceManager.getInstance().createReferences(this, false, false, true);
    }

    @Override
    public @NotNull PsiElement getElement() {
        return this;
    }

    @Override
    public @NotNull TextRange getRangeInElement() {
        return this.getTextRange();
    }

    @Override
    public @NotNull Collection<? extends Symbol> resolveReference() {
        return Collections.emptyList();
    }
}
