// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import io.github.ambalashov.structurizr.psi.StructurizrDescription;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifiersHierarchical;
import io.github.ambalashov.structurizr.psi.StructurizrItemName;
import io.github.ambalashov.structurizr.psi.StructurizrModelExpr;
import io.github.ambalashov.structurizr.psi.StructurizrViewsExpr;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import io.github.ambalashov.structurizr.psi.StructurizrWorkspaceExpression;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrWorkspaceExpressionImpl extends ASTWrapperPsiElement implements StructurizrWorkspaceExpression {

  public StructurizrWorkspaceExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitWorkspaceExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public StructurizrDescription getDescription() {
    return findChildByClass(StructurizrDescription.class);
  }

  @Override
  @Nullable
  public StructurizrIdentifiersHierarchical getIdentifiersHierarchical() {
    return findChildByClass(StructurizrIdentifiersHierarchical.class);
  }

  @Override
  @Nullable
  public StructurizrItemName getItemName() {
    return findChildByClass(StructurizrItemName.class);
  }

  @Override
  @Nullable
  public StructurizrModelExpr getModelExpr() {
    return findChildByClass(StructurizrModelExpr.class);
  }

  @Override
  @Nullable
  public StructurizrViewsExpr getViewsExpr() {
    return findChildByClass(StructurizrViewsExpr.class);
  }

}
