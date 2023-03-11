package io.github.ambalashov.sturcturizr.psi;

import com.intellij.psi.tree.IElementType;
import io.github.ambalashov.sturcturizr.StructurizrLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class StructurizrElementType extends IElementType {

    public StructurizrElementType(@NotNull @NonNls String debugName) {
        super(debugName, StructurizrLanguage.INSTANCE);
    }

}