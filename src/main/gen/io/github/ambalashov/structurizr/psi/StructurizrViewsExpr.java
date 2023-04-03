// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrViewsExpr extends PsiElement {

  @NotNull
  List<StructurizrComponentViewExpr> getComponentViewExprList();

  @NotNull
  List<StructurizrContainerViewExpr> getContainerViewExprList();

  @NotNull
  List<StructurizrStylesExpr> getStylesExprList();

  @NotNull
  List<StructurizrSystemContextExpr> getSystemContextExprList();

  @NotNull
  List<StructurizrSystemLandscapeExpr> getSystemLandscapeExprList();

  @NotNull
  List<StructurizrThemeExpr> getThemeExprList();

}
