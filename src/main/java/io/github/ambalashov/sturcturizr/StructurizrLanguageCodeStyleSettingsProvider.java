package io.github.ambalashov.sturcturizr;

import com.intellij.application.options.IndentOptionsEditor;
import com.intellij.application.options.SmartIndentOptionsEditor;
import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable;
import com.intellij.psi.codeStyle.CommonCodeStyleSettings;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StructurizrLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {

    public static final String SAMPLE = "// first line comment\n"
                                        + "workspace \"test\" {\n"
                                        + "  // workspace line comment\n"
                                        + "  model {\n"
                                        + "    // model line comment\n"
                                        + "    ss1 = softwareSystem \"SoftwareSystem 1\" {\n"
                                        + "      con = container \"Container\" {\n"
                                        + "        comp = component \"component\" {\n"
                                        + "          \n"
                                        + "        }\n"
                                        + "      }\n"
                                        + "    }\n"
                                        + "    p1 = person \"Person 1\"\n"
                                        + "    \n"
                                        + "    ss1 -> p1 \"ss1->p1\"\n"
                                        + "  }\n"
                                        + "}";

    @NotNull
    @Override
    public Language getLanguage() {
        return StructurizrLanguage.INSTANCE;
    }

    @Override
    public void customizeSettings(@NotNull CodeStyleSettingsCustomizable consumer, @NotNull SettingsType settingsType) {
        if (settingsType == SettingsType.SPACING_SETTINGS) {
            consumer.showStandardOptions("SPACE_AROUND_ASSIGNMENT_OPERATORS");
        } else if (settingsType == SettingsType.WRAPPING_AND_BRACES_SETTINGS) {
            consumer.showStandardOptions("INDENT_SIZE");
        } else if (settingsType == SettingsType.COMMENTER_SETTINGS) {
            consumer.showStandardOptions("LINE_COMMENT_ADD_SPACE");
        } else if (settingsType == SettingsType.BLANK_LINES_SETTINGS) {
            consumer.showStandardOptions("BLANK_LINES_SETTINGS");
        }
    }


    @Override
    protected void customizeDefaults(@NotNull CommonCodeStyleSettings commonSettings,
                                     CommonCodeStyleSettings.@NotNull IndentOptions indentOptions) {
        indentOptions.TAB_SIZE = 2;
        indentOptions.INDENT_SIZE = 2;
        // strip all blank lines by default
        commonSettings.KEEP_BLANK_LINES_IN_CODE = 2;
    }

    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {
        return SAMPLE;
    }

    @Nullable
    @Override
    public IndentOptionsEditor getIndentOptionsEditor() {
        return new SmartIndentOptionsEditor();
    }
}
