// This is a generated file. Not intended for manual editing.

package io.github.ambalashov.structurizr.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifierRef;
import io.github.ambalashov.structurizr.psi.StructurizrTypes;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.NotNull;

public class StructurizrIdentifierRefImpl extends StructurizrIdentifierRefMixin implements StructurizrIdentifierRef {

    public StructurizrIdentifierRefImpl(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull StructurizrVisitor visitor) {
        visitor.visitIdentifierRef(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
      if (visitor instanceof StructurizrVisitor) {
        accept((StructurizrVisitor) visitor);
      } else {
        super.accept(visitor);
      }
    }

    @Override
    @NotNull
    public PsiElement getIdToken() {
        return findNotNullChildByType(StructurizrTypes.ID_TOKEN);
    }

    @Override
    public PsiElement setName(String newName) {
        return StructurizrPsiImplUtil.setName(this, newName);
    }

}
