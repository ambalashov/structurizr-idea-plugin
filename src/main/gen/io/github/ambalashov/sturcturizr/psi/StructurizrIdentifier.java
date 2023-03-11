// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrIdentifier extends StructurizrNamedElement {

  @NotNull
  PsiElement getIdToken();

  String getId();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
