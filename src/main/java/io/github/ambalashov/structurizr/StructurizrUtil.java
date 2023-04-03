package io.github.ambalashov.structurizr;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import io.github.ambalashov.structurizr.psi.StructurizrIdentifier;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class StructurizrUtil {

    /**
     * Searches the entire project for Structurizr language files with instances of the Structurizr person with the given key.
     *
     * @param project current project
     * @param id      to check
     * @return matching properties
     */
    public static List<StructurizrIdentifier> findReferences(Project project, String id) {
        List<StructurizrIdentifier> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
            FileTypeIndex.getFiles(StructurizrFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            StructurizrFile file = (StructurizrFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                findIdentifiers(file, result, el -> id.equals(el.getText()));
            }
        }
        return result;
    }

    public static List<StructurizrIdentifier> findReferences(Project project) {
        List<StructurizrIdentifier> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
            FileTypeIndex.getFiles(StructurizrFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            StructurizrFile file = (StructurizrFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (file != null) {
                findIdentifiers(file, result, e -> true);
            }
        }
        return result;
    }

    private static void findIdentifiers(PsiElement parent, List<StructurizrIdentifier> collector,
                                        Predicate<StructurizrIdentifier> filter) {
        if (parent == null) {
            return;
        }
        for (PsiElement child : parent.getChildren()) {
            if (child instanceof StructurizrIdentifier) {
                var elem = (StructurizrIdentifier) child;
                if (filter.test(elem)) {
                    collector.add(elem);
                }
            }
            findIdentifiers(child, collector, filter);
        }
    }

    public static PsiElement findTarget(@NotNull Project project, String key) {
        Collection<VirtualFile> virtualFiles =
            FileTypeIndex.getFiles(StructurizrFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            StructurizrFile file = (StructurizrFile) PsiManager.getInstance(project).findFile(virtualFile);
            List<PsiElement> collector = new ArrayList<>();
            collectTargets(file, collector, i -> key.equals(i.getText()));
            if (collector.size() > 0) {
                return collector.get(0);
            }
        }
        return null;
    }

    private static void collectTargets(PsiElement parent, List<PsiElement> collector, Predicate<StructurizrIdentifier> filter) {
        if (parent == null) {
            return;
        }
        for (PsiElement child : parent.getChildren()) {
            if (child instanceof StructurizrIdentifier) {
                var elem = (StructurizrIdentifier) child;
                if (filter.test(elem)) {
                    collector.add(elem);
                }
            }
            collectTargets(child, collector, filter);
        }
        return;
    }

}
