// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrModelExpr extends PsiElement {

  @NotNull
  List<StructurizrDslInclude> getDslIncludeList();

  @NotNull
  List<StructurizrGroupModelExpr> getGroupModelExprList();

  @NotNull
  List<StructurizrIdentifierRef> getIdentifierRefList();

  @NotNull
  List<StructurizrModelProperties> getModelPropertiesList();

  @NotNull
  List<StructurizrPersonExpr> getPersonExprList();

  @NotNull
  List<StructurizrRelationExpr> getRelationExprList();

  @NotNull
  List<StructurizrSoftwareSystemExpr> getSoftwareSystemExprList();

}
