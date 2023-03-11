// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi.impl;

import io.github.ambalashov.sturcturizr.psi.StructurizrDescription;
import io.github.ambalashov.sturcturizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static io.github.ambalashov.sturcturizr.psi.StructurizrTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrDescriptionImpl extends ASTWrapperPsiElement implements StructurizrDescription {

  public StructurizrDescriptionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitDescription(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getQuotedText() {
    return findNotNullChildByType(QUOTED_TEXT);
  }

}
