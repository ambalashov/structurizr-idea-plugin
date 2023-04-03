package io.github.ambalashov.structurizr;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class StructurizrCodeStyleSettings extends CustomCodeStyleSettings {
    protected StructurizrCodeStyleSettings(CodeStyleSettings container) {
        super("StructurizrCodeStyleSettings", container);
    }
}
