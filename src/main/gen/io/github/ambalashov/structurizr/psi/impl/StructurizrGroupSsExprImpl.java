// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import java.util.List;

import io.github.ambalashov.structurizr.psi.StructurizrContainerExpr;
import io.github.ambalashov.structurizr.psi.StructurizrDslInclude;
import io.github.ambalashov.structurizr.psi.StructurizrGroupSsExpr;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifier;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifierRef;
import io.github.ambalashov.structurizr.psi.StructurizrItemName;
import io.github.ambalashov.structurizr.psi.StructurizrRelationExpr;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrGroupSsExprImpl extends ASTWrapperPsiElement implements StructurizrGroupSsExpr {

  public StructurizrGroupSsExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitGroupSsExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrContainerExpr> getContainerExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrContainerExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslInclude> getDslIncludeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslInclude.class);
  }

  @Override
  @NotNull
  public List<StructurizrGroupSsExpr> getGroupSsExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrGroupSsExpr.class);
  }

  @Override
  @Nullable
  public StructurizrIdentifier getIdentifier() {
    return findChildByClass(StructurizrIdentifier.class);
  }

  @Override
  @NotNull
  public List<StructurizrIdentifierRef> getIdentifierRefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrIdentifierRef.class);
  }

  @Override
  @NotNull
  public StructurizrItemName getItemName() {
    return findNotNullChildByClass(StructurizrItemName.class);
  }

  @Override
  @NotNull
  public List<StructurizrRelationExpr> getRelationExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrRelationExpr.class);
  }

}
