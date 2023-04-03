package io.github.ambalashov.structurizr;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifier;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifierRef;

public class StructurizrElementFactory {

    public static StructurizrIdentifier createIdentifier(Project project, String name) {
        StructurizrFile file = createFile(project, name);
        return (StructurizrIdentifier) file.getFirstChild();
    }

    public static StructurizrIdentifierRef createIdentifierRef(Project project, String name) {
        StructurizrFile file = createFile(project, name + " -> " + name);
        return (StructurizrIdentifierRef) file.getFirstChild().getFirstChild();
    }

    public static StructurizrFile createFile(Project project, String text) {
        String name = "dummy.structz";
        return (StructurizrFile) PsiFileFactory.getInstance(project).
            createFileFromText(name, StructurizrFileType.INSTANCE, text);
    }
}
