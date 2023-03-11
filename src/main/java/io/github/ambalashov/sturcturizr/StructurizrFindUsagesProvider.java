package io.github.ambalashov.sturcturizr;

import com.intellij.lang.cacheBuilder.DefaultWordsScanner;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiTreeUtil;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifier;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifierRef;
import io.github.ambalashov.sturcturizr.psi.StructurizrItemName;
import io.github.ambalashov.sturcturizr.psi.StructurizrRelationExpr;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StructurizrFindUsagesProvider implements FindUsagesProvider {

    @Override
    public @Nullable WordsScanner getWordsScanner() {
        return new DefaultWordsScanner(new StructurizrLexerAdapter(),
            StructurizrTokenSets.IDENTIFIERS,
            StructurizrTokenSets.IDENTIFIER_REF,
            // StructurizrTokenSets.COMMENTS,
            TokenSet.EMPTY);
    }

    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return psiElement instanceof PsiNamedElement;
    }

    @Override
    public @Nullable @NonNls String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @Override
    public @Nls @NotNull String getType(@NotNull PsiElement element) {
        if (element instanceof StructurizrIdentifier) {
            return "structurizr identifier";
        }
        if (element instanceof StructurizrIdentifierRef) {
            return "structurizr identifier ref";
        }
        return "";
    }

    @Override
    public @Nls @NotNull String getDescriptiveName(@NotNull PsiElement element) {
        if (element instanceof StructurizrIdentifier) {
            StructurizrItemName itemName = PsiTreeUtil.getNextSiblingOfType(element, StructurizrItemName.class);
            return "structurizr identifier";
        }
        if (element instanceof StructurizrRelationExpr) {
            return "structurizr relation";
        }
        return "";
    }

    @Override
    public @Nls @NotNull String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        if (element instanceof StructurizrIdentifier) {
            return ((StructurizrIdentifier) element).getId();
        }
        return "";
    }
}
