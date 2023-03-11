// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrGroupModelExpr extends PsiElement {

  @NotNull
  List<StructurizrDslInclude> getDslIncludeList();

  @NotNull
  List<StructurizrGroupSsExpr> getGroupSsExprList();

  @Nullable
  StructurizrIdentifier getIdentifier();

  @NotNull
  List<StructurizrIdentifierRef> getIdentifierRefList();

  @NotNull
  StructurizrItemName getItemName();

  @NotNull
  List<StructurizrRelationExpr> getRelationExprList();

  @NotNull
  List<StructurizrSoftwareSystemExpr> getSoftwareSystemExprList();

}
