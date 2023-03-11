package io.github.ambalashov.sturcturizr;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.util.IncorrectOperationException;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifier;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrPsiImplUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.stream.Collectors;

public class StructurizrIdentifierReference extends PsiReferenceBase<PsiElement> implements PsiReference {
    private final String key;

    public StructurizrIdentifierReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        key = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        return StructurizrUtil.findTarget(myElement.getProject(), key);
    }

    @Override
    public PsiElement handleElementRename(@NotNull String newElementName) throws IncorrectOperationException {
        return StructurizrPsiImplUtil.setName(myElement, newElementName);
    }

    @Override
    public boolean isReferenceTo(@NotNull PsiElement element) {
        if(element instanceof StructurizrIdentifier) {
            return key.equals(((StructurizrIdentifier) element).getId());
        }
        return false;
    }

    @Override
    public String @NotNull [] getVariants() {
        List<StructurizrIdentifier> references = StructurizrUtil.findReferences(getElement().getProject());
        return references.stream().map(i -> i.getId()).collect(Collectors.toList()).toArray(new String[]{});
    }
}
