package io.github.ambalashov.sturcturizr;

import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.codeStyle.CustomCodeStyleSettings;

public class StructurizrCodeStyleSettings extends CustomCodeStyleSettings {
    protected StructurizrCodeStyleSettings(CodeStyleSettings container) {
        super("StructurizrCodeStyleSettings", container);
    }
}
