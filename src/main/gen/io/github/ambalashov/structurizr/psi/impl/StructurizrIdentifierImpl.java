// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi.impl;

import io.github.ambalashov.structurizr.psi.StructurizrIdentifier;
import io.github.ambalashov.structurizr.psi.StructurizrVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;

import static io.github.ambalashov.structurizr.psi.StructurizrTypes.*;

public class StructurizrIdentifierImpl extends StructurizrNamedElementImpl implements StructurizrIdentifier {

  public StructurizrIdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull StructurizrVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof StructurizrVisitor) accept((StructurizrVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdToken() {
    return findNotNullChildByType(ID_TOKEN);
  }

  @Override
  public String getId() {
    return StructurizrPsiImplUtil.getId(this);
  }

  @Override
  public String getName() {
    return StructurizrPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return StructurizrPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return StructurizrPsiImplUtil.getNameIdentifier(this);
  }

}
