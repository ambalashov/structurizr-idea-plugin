package io.github.ambalashov.sturcturizr.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;
import com.intellij.util.ArrayUtil;
import io.github.ambalashov.sturcturizr.StructurizrIdentifierReference;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifierRef;
import org.jetbrains.annotations.NotNull;

abstract class StructurizrIdentifierRefMixin extends ASTWrapperPsiElement implements StructurizrIdentifierRef {
    public StructurizrIdentifierRefMixin(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public PsiReference getReference() {
        return new StructurizrIdentifierReference(this, getRange());
    }

    private TextRange getRange() {
        return TextRange.from(0, this.getTextLength());
    }

    @Override
    public PsiReference @NotNull [] getReferences() {
        final PsiReference[] fromProviders = ReferenceProvidersRegistry.getReferencesFromProviders(this);
        return ArrayUtil.prepend(new StructurizrIdentifierReference(this, getRange()), fromProviders);
    }

}
