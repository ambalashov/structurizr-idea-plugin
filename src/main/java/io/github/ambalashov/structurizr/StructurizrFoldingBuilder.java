package io.github.ambalashov.structurizr;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import io.github.ambalashov.structurizr.psi.StructurizrComponentExpr;
import io.github.ambalashov.structurizr.psi.StructurizrContainerExpr;
import io.github.ambalashov.structurizr.psi.StructurizrGroupContainerExpr;
import io.github.ambalashov.structurizr.psi.StructurizrGroupModelExpr;
import io.github.ambalashov.structurizr.psi.StructurizrGroupSsExpr;
import io.github.ambalashov.structurizr.psi.StructurizrItemName;
import io.github.ambalashov.structurizr.psi.StructurizrModelExpr;
import io.github.ambalashov.structurizr.psi.StructurizrSoftwareSystemExpr;
import io.github.ambalashov.structurizr.psi.StructurizrViewsExpr;
import io.github.ambalashov.structurizr.psi.StructurizrWorkspaceExpression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StructurizrFoldingBuilder extends FoldingBuilderEx implements DumbAware {
    @Override
    public FoldingDescriptor @NotNull [] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {
        // Initialize the group of folding regions that will expand/collapse together.
        FoldingGroup group = FoldingGroup.newGroup("model");
        // Initialize the list of folding regions
        List<FoldingDescriptor> descriptors = new ArrayList<>();
        // Get a collection of the literal expressions in the document below root
        addDescriptor(root, descriptors, StructurizrWorkspaceExpression.class);
        addDescriptor(root, descriptors, StructurizrModelExpr.class);
        addDescriptor(root, descriptors, StructurizrViewsExpr.class);
        addDescriptor(root, descriptors, StructurizrGroupModelExpr.class);
        addDescriptor(root, descriptors, StructurizrSoftwareSystemExpr.class);
        addDescriptor(root, descriptors, StructurizrGroupSsExpr.class);
        addDescriptor(root, descriptors, StructurizrContainerExpr.class);
        addDescriptor(root, descriptors, StructurizrGroupContainerExpr.class);
        addDescriptor(root, descriptors, StructurizrComponentExpr.class);

        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);

    }

    private static <T extends PsiElement> void addDescriptor(@NotNull PsiElement root, List<FoldingDescriptor> descriptors, Class<T> aClass) {
        Collection<T> elements = PsiTreeUtil.findChildrenOfType(root, aClass);
        for (final T element : elements) {
            descriptors.add(new FoldingDescriptor(element.getNode(), new TextRange(element.getTextRange().getStartOffset(),
                element.getTextRange().getEndOffset())));
        }
    }

    @Override
    public @Nullable String getPlaceholderText(@NotNull ASTNode node) {
        String retTxt = "...";
        if (node.getPsi() instanceof StructurizrWorkspaceExpression) {
            String place = "workspace " + getPlaceText(((StructurizrWorkspaceExpression) node.getPsi()).getItemName());
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        if (node.getPsi() instanceof StructurizrSoftwareSystemExpr) {
            String place = "softwareSystem " + getPlaceText(((StructurizrSoftwareSystemExpr)node.getPsi()).getItemName());
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        if (node.getPsi() instanceof StructurizrContainerExpr) {
            String place = "container " + getPlaceText(((StructurizrContainerExpr)node.getPsi()).getItemName());
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        if (node.getPsi() instanceof StructurizrComponentExpr) {
            String place = "component " + getPlaceText(((StructurizrComponentExpr)node.getPsi()).getItemName());
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        if (node.getPsi() instanceof StructurizrGroupModelExpr) {
            String place = "group " + getPlaceText(((StructurizrGroupModelExpr)node.getPsi()).getItemName());
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        if (node.getPsi() instanceof StructurizrGroupSsExpr) {
            String place = "group " + getPlaceText(((StructurizrGroupSsExpr)node.getPsi()).getItemName());
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        if (node.getPsi() instanceof StructurizrGroupContainerExpr) {
            String place = "group " + getPlaceText(((StructurizrGroupContainerExpr)node.getPsi()).getItemName());
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        if (node.getPsi() instanceof StructurizrModelExpr) {
            String place = "model";
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        if (node.getPsi() instanceof StructurizrViewsExpr) {
            String place = "views";
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        return retTxt;
    }

    private static String getPlaceText(@Nullable StructurizrItemName itemName) {
        return itemName.getText().replace("\"", "");
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return false;
    }
}
