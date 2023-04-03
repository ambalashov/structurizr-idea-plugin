// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import io.github.ambalashov.structurizr.psi.StructurizrModelPropertiesItem;
import io.github.ambalashov.structurizr.psi.StructurizrPropKey;
import io.github.ambalashov.structurizr.psi.StructurizrPropValue;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrModelPropertiesItemImpl extends ASTWrapperPsiElement implements StructurizrModelPropertiesItem {

  public StructurizrModelPropertiesItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitModelPropertiesItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public StructurizrPropKey getPropKey() {
    return findNotNullChildByClass(StructurizrPropKey.class);
  }

  @Override
  @NotNull
  public StructurizrPropValue getPropValue() {
    return findNotNullChildByClass(StructurizrPropValue.class);
  }

}
