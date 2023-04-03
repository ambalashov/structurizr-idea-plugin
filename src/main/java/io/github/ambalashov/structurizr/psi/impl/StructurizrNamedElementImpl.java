package io.github.ambalashov.structurizr.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public abstract class StructurizrNamedElementImpl extends ASTWrapperPsiElement {

    public StructurizrNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
