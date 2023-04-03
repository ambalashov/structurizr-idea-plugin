package io.github.ambalashov.structurizr.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import io.github.ambalashov.structurizr.StructurizrElementFactory;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifier;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifierRef;
import org.jetbrains.annotations.NotNull;

import static com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry.getReferencesFromProviders;

public class StructurizrPsiImplUtil {

    public static String getId(StructurizrIdentifier element) {
        ASTNode keyNode = element.getNode();
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getName(StructurizrIdentifier element) {
        return getId(element);
    }

    public static PsiElement setName(PsiElement element, String newName) {
        ASTNode keyNode = element.getNode();
        if (keyNode != null) {
            if (element instanceof StructurizrIdentifier) {
                StructurizrIdentifier newIdentifier =
                    StructurizrElementFactory.createIdentifier(element.getProject(), newName);
                ASTNode newKeyNode = newIdentifier.getNode();
                element.getParent().getNode().replaceChild(keyNode, newKeyNode);
            }
            if (element instanceof StructurizrIdentifierRef) {
                StructurizrIdentifierRef newIdentifier =
                    StructurizrElementFactory.createIdentifierRef(element.getProject(), newName);
                ASTNode newKeyNode = newIdentifier.getNode();
                element.getParent().getNode().replaceChild(keyNode, newKeyNode);
            }

        }
        return element;
    }


    public static PsiElement getNameIdentifier(StructurizrIdentifier element) {
        ASTNode keyNode = element.getNode();
        return keyNode != null ? keyNode.getPsi() : null;
    }

    public static PsiReference getReference(StructurizrIdentifierRef element) {
        PsiReference[] references = getReferences(element);
        return references.length > 0 ? references[0] : null;
    }

    public static PsiReference @NotNull [] getReferences(StructurizrIdentifierRef element) {
        return getReferencesFromProviders(element);
    }

}
