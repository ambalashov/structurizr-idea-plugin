// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi.impl;

import java.util.List;

import io.github.ambalashov.sturcturizr.psi.StructurizrComponentExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrDescription;
import io.github.ambalashov.sturcturizr.psi.StructurizrDslInclude;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifier;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifierRef;
import io.github.ambalashov.sturcturizr.psi.StructurizrItemName;
import io.github.ambalashov.sturcturizr.psi.StructurizrRelationExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrTags;
import io.github.ambalashov.sturcturizr.psi.StructurizrTechnology;
import io.github.ambalashov.sturcturizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrComponentExprImpl extends ASTWrapperPsiElement implements StructurizrComponentExpr {

  public StructurizrComponentExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitComponentExpr(this);
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
  @NotNull
  public List<StructurizrDslInclude> getDslIncludeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrDslInclude.class);
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

  @Override
  @Nullable
  public StructurizrTags getTags() {
    return findChildByClass(StructurizrTags.class);
  }

  @Override
  @Nullable
  public StructurizrTechnology getTechnology() {
    return findChildByClass(StructurizrTechnology.class);
  }

}
