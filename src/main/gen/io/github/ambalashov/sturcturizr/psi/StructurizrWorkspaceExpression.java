// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrWorkspaceExpression extends PsiElement {

  @Nullable
  StructurizrDescription getDescription();

  @Nullable
  StructurizrIdentifiersHierarchical getIdentifiersHierarchical();

  @Nullable
  StructurizrItemName getItemName();

  @Nullable
  StructurizrModelExpr getModelExpr();

  @Nullable
  StructurizrViewsExpr getViewsExpr();

}
