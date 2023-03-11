// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrContainerViewExpr extends PsiElement {

  @NotNull
  List<StructurizrAutoLayoutExpr> getAutoLayoutExprList();

  @Nullable
  StructurizrDescription getDescription();

  @NotNull
  List<StructurizrExcludeExpr> getExcludeExprList();

  @NotNull
  StructurizrIdentifierRef getIdentifierRef();

  @NotNull
  List<StructurizrIncludeExpr> getIncludeExprList();

  @Nullable
  StructurizrKey getKey();

  @NotNull
  List<StructurizrTitleExpr> getTitleExprList();

}
