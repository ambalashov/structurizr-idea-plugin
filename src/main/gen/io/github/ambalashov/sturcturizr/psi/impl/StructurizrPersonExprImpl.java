// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi.impl;

import io.github.ambalashov.sturcturizr.psi.StructurizrDescription;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifier;
import io.github.ambalashov.sturcturizr.psi.StructurizrItemName;
import io.github.ambalashov.sturcturizr.psi.StructurizrPersonExpr;
import io.github.ambalashov.sturcturizr.psi.StructurizrTags;
import io.github.ambalashov.sturcturizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrPersonExprImpl extends ASTWrapperPsiElement implements StructurizrPersonExpr {

  public StructurizrPersonExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitPersonExpr(this);
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
  public StructurizrIdentifier getIdentifier() {
    return findChildByClass(StructurizrIdentifier.class);
  }

  @Override
  @NotNull
  public StructurizrItemName getItemName() {
    return findNotNullChildByClass(StructurizrItemName.class);
  }

  @Override
  @Nullable
  public StructurizrTags getTags() {
    return findChildByClass(StructurizrTags.class);
  }

}
