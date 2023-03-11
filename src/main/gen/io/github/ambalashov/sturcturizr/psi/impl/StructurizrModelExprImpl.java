// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi.impl;

import java.util.List;

import io.github.ambalashov.sturcturizr.psi.StructurizrDslInclude;
import io.github.ambalashov.sturcturizr.psi.StructurizrGroupModelExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifierRef;
import io.github.ambalashov.sturcturizr.psi.StructurizrModelExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrModelProperties;
import io.github.ambalashov.sturcturizr.psi.StructurizrPersonExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrRelationExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrSoftwareSystemExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrModelExprImpl extends ASTWrapperPsiElement implements StructurizrModelExpr {

  public StructurizrModelExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitModelExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrDslInclude> getDslIncludeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslInclude.class);
  }

  @Override
  @NotNull
  public List<StructurizrGroupModelExpr> getGroupModelExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrGroupModelExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrIdentifierRef> getIdentifierRefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrIdentifierRef.class);
  }

  @Override
  @NotNull
  public List<StructurizrModelProperties> getModelPropertiesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrModelProperties.class);
  }

  @Override
  @NotNull
  public List<StructurizrPersonExpr> getPersonExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrPersonExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrRelationExpr> getRelationExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrRelationExpr.class);
  }

  @Override
  @NotNull
  public List<StructurizrSoftwareSystemExpr> getSoftwareSystemExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrSoftwareSystemExpr.class);
  }

}
