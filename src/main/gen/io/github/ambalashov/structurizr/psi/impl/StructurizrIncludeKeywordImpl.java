// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import io.github.ambalashov.structurizr.psi.StructurizrIncludeKeyword;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrIncludeKeywordImpl extends ASTWrapperPsiElement implements StructurizrIncludeKeyword {

  public StructurizrIncludeKeywordImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitIncludeKeyword(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

}
