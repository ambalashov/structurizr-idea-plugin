// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import io.github.ambalashov.structurizr.psi.StructurizrItemName;
import io.github.ambalashov.structurizr.psi.StructurizrTypes;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrItemNameImpl extends ASTWrapperPsiElement implements StructurizrItemName {

  public StructurizrItemNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitItemName(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getQuotedText() {
    return findNotNullChildByType(StructurizrTypes.QUOTED_TEXT);
  }

}
