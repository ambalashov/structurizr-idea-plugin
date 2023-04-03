// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import java.util.List;

import io.github.ambalashov.structurizr.psi.StructurizrAutoLayoutExpr;
import io.github.ambalashov.structurizr.psi.StructurizrDescription;
import io.github.ambalashov.structurizr.psi.StructurizrExcludeExpr;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifierRef;
import io.github.ambalashov.structurizr.psi.StructurizrIncludeExpr;
import io.github.ambalashov.structurizr.psi.StructurizrKey;
import io.github.ambalashov.structurizr.psi.StructurizrSystemContextExpr;
import io.github.ambalashov.structurizr.psi.StructurizrTitleExpr;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrSystemContextExprImpl extends ASTWrapperPsiElement implements StructurizrSystemContextExpr {

  public StructurizrSystemContextExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitSystemContextExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrAutoLayoutExpr> getAutoLayoutExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrAutoLayoutExpr.class);
  }

  @Override
  @Nullable
  public StructurizrDescription getDescription() {
    return findChildByClass(StructurizrDescription.class);
  }

  @Override
  @NotNull
  public List<StructurizrExcludeExpr> getExcludeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrExcludeExpr.class);
  }

  @Override
  @NotNull
  public StructurizrIdentifierRef getIdentifierRef() {
    return findNotNullChildByClass(StructurizrIdentifierRef.class);
  }

  @Override
  @NotNull
  public List<StructurizrIncludeExpr> getIncludeExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrIncludeExpr.class);
  }

  @Override
  @Nullable
  public StructurizrKey getKey() {
    return findChildByClass(StructurizrKey.class);
  }

  @Override
  @NotNull
  public List<StructurizrTitleExpr> getTitleExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrTitleExpr.class);
  }

}
