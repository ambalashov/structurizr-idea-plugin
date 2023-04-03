// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrGroupContainerExpr extends PsiElement {

  @NotNull
  List<StructurizrComponentExpr> getComponentExprList();

  @NotNull
  List<StructurizrDslInclude> getDslIncludeList();

  @NotNull
  List<StructurizrGroupContainerExpr> getGroupContainerExprList();

  @Nullable
  StructurizrIdentifier getIdentifier();

  @NotNull
  List<StructurizrIdentifierRef> getIdentifierRefList();

  @NotNull
  StructurizrItemName getItemName();

  @NotNull
  List<StructurizrRelationExpr> getRelationExprList();

}
