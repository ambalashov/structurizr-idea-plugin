// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi.impl;

import io.github.ambalashov.sturcturizr.psi.StructurizrAutoLayoutExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrAutoLayoutExprImpl extends ASTWrapperPsiElement implements StructurizrAutoLayoutExpr {

  public StructurizrAutoLayoutExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitAutoLayoutExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

}
