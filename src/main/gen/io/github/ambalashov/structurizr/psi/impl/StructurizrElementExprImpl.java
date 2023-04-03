// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import java.util.List;

import io.github.ambalashov.structurizr.psi.StructurizrElementExpr;
import io.github.ambalashov.structurizr.psi.StructurizrKey;
import io.github.ambalashov.structurizr.psi.StructurizrShapeExpr;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrElementExprImpl extends ASTWrapperPsiElement implements StructurizrElementExpr {

  public StructurizrElementExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitElementExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public StructurizrKey getKey() {
    return findNotNullChildByClass(StructurizrKey.class);
  }

  @Override
  @NotNull
  public List<StructurizrShapeExpr> getShapeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrShapeExpr.class);
  }

}
