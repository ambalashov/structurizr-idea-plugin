// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.structurizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrIncludeExpr extends PsiElement {

  @NotNull
  List<StructurizrIdentifierRef> getIdentifierRefList();

  @NotNull
  List<StructurizrIncludeExpression> getIncludeExpressionList();

}
