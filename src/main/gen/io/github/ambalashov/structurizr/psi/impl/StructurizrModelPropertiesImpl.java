// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import java.util.List;

import io.github.ambalashov.structurizr.psi.StructurizrModelProperties;
import io.github.ambalashov.structurizr.psi.StructurizrModelPropertiesItem;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrModelPropertiesImpl extends ASTWrapperPsiElement implements StructurizrModelProperties {

  public StructurizrModelPropertiesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitModelProperties(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<StructurizrModelPropertiesItem> getModelPropertiesItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, StructurizrModelPropertiesItem.class);
  }

}
