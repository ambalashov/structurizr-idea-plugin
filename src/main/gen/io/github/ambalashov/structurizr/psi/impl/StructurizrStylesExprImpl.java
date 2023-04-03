// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import java.util.List;

import io.github.ambalashov.structurizr.psi.StructurizrElementExpr;
import io.github.ambalashov.structurizr.psi.StructurizrStylesExpr;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrStylesExprImpl extends ASTWrapperPsiElement implements StructurizrStylesExpr {

  public StructurizrStylesExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitStylesExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrElementExpr> getElementExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrElementExpr.class);
  }

}
