package io.github.ambalashov.sturcturizr;

import com.intellij.model.Symbol;
import com.intellij.model.psi.PsiExternalReferenceHost;
import com.intellij.model.psi.PsiSymbolReference;
import com.intellij.model.psi.PsiSymbolReferenceHints;
import com.intellij.model.psi.PsiSymbolReferenceProvider;
import com.intellij.model.search.SearchRequest;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Collections;

public class StructurizrFilePsiSymbolReferenceProvider implements PsiSymbolReferenceProvider {
    @Override
    public @NotNull Collection<? extends @NotNull PsiSymbolReference> getReferences(@NotNull PsiExternalReferenceHost element,
                                                                                    @NotNull PsiSymbolReferenceHints hints) {
        return Collections.emptyList();
    }

    @Override
    public @NotNull Collection<? extends @NotNull SearchRequest> getSearchRequests(@NotNull Project project, @NotNull Symbol target) {
        return Collections.emptyList();
    }
}
