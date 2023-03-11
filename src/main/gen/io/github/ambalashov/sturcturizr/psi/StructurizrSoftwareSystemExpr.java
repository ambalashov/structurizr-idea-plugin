// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrSoftwareSystemExpr extends PsiElement {

  @NotNull
  List<StructurizrContainerExpr> getContainerExprList();

  @Nullable
  StructurizrDescription getDescription();

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

  @Nullable
  StructurizrTags getTags();

}
