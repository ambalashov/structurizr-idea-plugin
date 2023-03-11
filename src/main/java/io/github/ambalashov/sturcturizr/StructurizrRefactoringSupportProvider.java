package io.github.ambalashov.sturcturizr;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifier;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifierRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StructurizrRefactoringSupportProvider extends RefactoringSupportProvider {

    @Override
    public boolean isMemberInplaceRenameAvailable(@NotNull PsiElement elementToRename, @Nullable PsiElement context) {
        return (elementToRename instanceof StructurizrIdentifierRef)
            || elementToRename instanceof StructurizrIdentifier;
    }
}
