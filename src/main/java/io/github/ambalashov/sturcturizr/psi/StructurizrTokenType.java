package io.github.ambalashov.sturcturizr.psi;

import com.intellij.psi.tree.IElementType;
import io.github.ambalashov.sturcturizr.StructurizrLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class StructurizrTokenType extends IElementType {

    public StructurizrTokenType(@NotNull @NonNls String debugName) {
        super(debugName, StructurizrLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "StructurizrTokenType." + super.toString();
    }

}