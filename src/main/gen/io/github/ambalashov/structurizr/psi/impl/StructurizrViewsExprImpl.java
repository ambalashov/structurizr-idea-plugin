// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import java.util.List;

import io.github.ambalashov.structurizr.psi.StructurizrComponentViewExpr;
import io.github.ambalashov.structurizr.psi.StructurizrContainerViewExpr;
import io.github.ambalashov.structurizr.psi.StructurizrStylesExpr;
import io.github.ambalashov.structurizr.psi.StructurizrSystemContextExpr;
import io.github.ambalashov.structurizr.psi.StructurizrSystemLandscapeExpr;
import io.github.ambalashov.structurizr.psi.StructurizrThemeExpr;
import io.github.ambalashov.structurizr.psi.StructurizrViewsExpr;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrViewsExprImpl extends ASTWrapperPsiElement implements StructurizrViewsExpr {

  public StructurizrViewsExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitViewsExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrComponentViewExpr> getComponentViewExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrComponentViewExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrContainerViewExpr> getContainerViewExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrContainerViewExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrStylesExpr> getStylesExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrStylesExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrSystemContextExpr> getSystemContextExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrSystemContextExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrSystemLandscapeExpr> getSystemLandscapeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrSystemLandscapeExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrThemeExpr> getThemeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrThemeExpr.class);
  }

}
