// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrElementExpr extends PsiElement {

  @NotNull
  StructurizrKey getKey();

  @NotNull
  List<StructurizrShapeExpr> getShapeExprList();

}
