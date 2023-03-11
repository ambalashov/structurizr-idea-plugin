// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi.impl;

import io.github.ambalashov.sturcturizr.psi.StructurizrItemName;
import io.github.ambalashov.sturcturizr.psi.StructurizrTitleExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrTitleExprImpl extends ASTWrapperPsiElement implements StructurizrTitleExpr {

  public StructurizrTitleExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitTitleExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public StructurizrItemName getItemName() {
    return findNotNullChildByClass(StructurizrItemName.class);
  }

}
