package io.github.ambalashov.structurizr.breadcrumbs;

import com.intellij.lang.Language;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.psi.PsiElement;
import com.intellij.ui.breadcrumbs.BreadcrumbsProvider;
import io.github.ambalashov.structurizr.StructurizrLanguage;
import io.github.ambalashov.structurizr.psi.StructurizrComponentExpr;
import io.github.ambalashov.structurizr.psi.StructurizrContainerExpr;
import io.github.ambalashov.structurizr.psi.StructurizrGroupContainerExpr;
import io.github.ambalashov.structurizr.psi.StructurizrGroupModelExpr;
import io.github.ambalashov.structurizr.psi.StructurizrGroupSsExpr;
import io.github.ambalashov.structurizr.psi.StructurizrModelExpr;
import io.github.ambalashov.structurizr.psi.StructurizrPersonExpr;
import io.github.ambalashov.structurizr.psi.StructurizrSoftwareSystemExpr;
import io.github.ambalashov.structurizr.psi.StructurizrWorkspaceExpression;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class StructurizrBreadcrumbsProvider implements BreadcrumbsProvider {
    @Override
    public Language[] getLanguages() {
        return new Language[] {StructurizrLanguage.INSTANCE};
    }

    @Override
    public boolean acceptElement(@NotNull PsiElement e) {
        return e instanceof StructurizrWorkspaceExpression
               || e instanceof StructurizrModelExpr
               || e instanceof StructurizrGroupModelExpr
               || e instanceof StructurizrGroupSsExpr
               || e instanceof StructurizrGroupContainerExpr
               || e instanceof StructurizrSoftwareSystemExpr
               || e instanceof StructurizrContainerExpr
               || e instanceof StructurizrComponentExpr
               || e instanceof StructurizrPersonExpr
            ;
    }

    @Override
    public @NotNull @NlsSafe String getElementInfo(@NotNull PsiElement e) {
        if (e instanceof StructurizrWorkspaceExpression) {
            StructurizrWorkspaceExpression we = (StructurizrWorkspaceExpression) e;
            return "workspace " + Optional.ofNullable(we.getItemName()).map(PsiElement::getText).orElse("");
        }
        if (e instanceof StructurizrModelExpr) {
            return "model ";
        }
        if (e instanceof StructurizrGroupModelExpr) {
            StructurizrGroupModelExpr ge = (StructurizrGroupModelExpr) e;

            return "group " + Optional.ofNullable(ge.getItemName()).map(PsiElement::getText).orElse("");
        }
        if (e instanceof StructurizrGroupSsExpr) {
            StructurizrGroupSsExpr ge = (StructurizrGroupSsExpr) e;

            return "group " + Optional.ofNullable(ge.getItemName()).map(PsiElement::getText).orElse("");
        }
        if (e instanceof StructurizrGroupContainerExpr) {
            StructurizrGroupContainerExpr ge = (StructurizrGroupContainerExpr) e;

            return "group " + Optional.ofNullable(ge.getItemName()).map(PsiElement::getText).orElse("");
        }
        if (e instanceof StructurizrSoftwareSystemExpr) {
            StructurizrSoftwareSystemExpr sse = (StructurizrSoftwareSystemExpr) e;
            return "softwareSystem " + Optional.ofNullable(sse.getItemName()).map(PsiElement::getText).orElse("");
        }
        if (e instanceof StructurizrContainerExpr) {
            StructurizrContainerExpr sse = (StructurizrContainerExpr) e;
            return "container " + Optional.ofNullable(sse.getItemName()).map(PsiElement::getText).orElse("");
        }
        if (e instanceof StructurizrComponentExpr) {
            StructurizrComponentExpr sse = (StructurizrComponentExpr) e;
            return "component " + Optional.ofNullable(sse.getItemName()).map(PsiElement::getText).orElse("");
        }
        if (e instanceof StructurizrPersonExpr) {
            StructurizrPersonExpr sse = (StructurizrPersonExpr) e;
            return "person " + Optional.ofNullable(sse.getItemName()).map(PsiElement::getText).orElse("");
        }
        throw new IllegalArgumentException("This element should not pass #acceptElement");
    }
}
