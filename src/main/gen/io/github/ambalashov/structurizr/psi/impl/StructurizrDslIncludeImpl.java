// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import io.github.ambalashov.structurizr.psi.StructurizrDslInclude;
import io.github.ambalashov.structurizr.psi.StructurizrIncludeFile;
import io.github.ambalashov.structurizr.psi.StructurizrIncludeKeyword;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class StructurizrDslIncludeImpl extends ASTWrapperPsiElement implements StructurizrDslInclude {

  public StructurizrDslIncludeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitDslInclude(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public StructurizrIncludeFile getIncludeFile() {
    return findNotNullChildByClass(StructurizrIncludeFile.class);
  }

  @Override
  @NotNull
  public StructurizrIncludeKeyword getIncludeKeyword() {
    return findNotNullChildByClass(StructurizrIncludeKeyword.class);
  }

}
