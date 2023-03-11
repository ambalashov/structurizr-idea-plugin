// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi.impl;

import java.util.List;

import io.github.ambalashov.sturcturizr.psi.StructurizrComponentExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrDslInclude;
import io.github.ambalashov.sturcturizr.psi.StructurizrGroupContainerExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifier;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifierRef;
import io.github.ambalashov.sturcturizr.psi.StructurizrItemName;
import io.github.ambalashov.sturcturizr.psi.StructurizrRelationExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrGroupContainerExprImpl extends ASTWrapperPsiElement implements StructurizrGroupContainerExpr {

  public StructurizrGroupContainerExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitGroupContainerExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrComponentExpr> getComponentExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrComponentExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrDslInclude> getDslIncludeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslInclude.class);
  }

  @Override
  @NotNull
  public List<StructurizrGroupContainerExpr> getGroupContainerExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrGroupContainerExpr.class);
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
