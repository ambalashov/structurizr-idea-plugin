// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface StructurizrRelationExpr extends PsiElement {

  @Nullable
  StructurizrDescription getDescription();

  @Nullable
  StructurizrIdentifier getIdentifier();

  @NotNull
  List<StructurizrIdentifierRef> getIdentifierRefList();

  @Nullable
  StructurizrItemName getItemName();

  @Nullable
  StructurizrTags getTags();

  @Nullable
  StructurizrTechnology getTechnology();

}
