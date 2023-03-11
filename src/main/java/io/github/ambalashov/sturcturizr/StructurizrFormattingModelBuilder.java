package io.github.ambalashov.sturcturizr;

import com.intellij.formatting.Alignment;
import com.intellij.formatting.FormattingContext;
import com.intellij.formatting.FormattingModel;
import com.intellij.formatting.FormattingModelBuilder;
import com.intellij.formatting.FormattingModelProvider;
import com.intellij.formatting.SpacingBuilder;
import com.intellij.formatting.Wrap;
import com.intellij.formatting.WrapType;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import io.github.ambalashov.sturcturizr.psi.StructurizrTypes;
import org.jetbrains.annotations.NotNull;

public class StructurizrFormattingModelBuilder implements FormattingModelBuilder {

    private static SpacingBuilder createSpaceBuilder(CodeStyleSettings settings) {
        return new SpacingBuilder(settings, StructurizrLanguage.INSTANCE)
            .around(StructurizrTypes.EQ)
            .spaceIf(settings.getCommonSettings(StructurizrLanguage.INSTANCE.getID()).SPACE_AROUND_ASSIGNMENT_OPERATORS)
            .before(StructurizrTokenSets.IDENTIFIERS)
            .none()
            .around(StructurizrTypes.REL)
            .spaceIf(settings.getCommonSettings(StructurizrLanguage.INSTANCE.getID()).SPACE_AROUND_ASSIGNMENT_OPERATORS)
            .before(StructurizrTypes.RELATION_EXPR)
            .none()
            .around(StructurizrTypes.ITEM_NAME)
            .spaceIf(true)
            .before(StructurizrTypes.ITEM_NAME)
            .none()

            ;
    }

    @Override
    public @NotNull FormattingModel createModel(@NotNull FormattingContext formattingContext) {
        final CodeStyleSettings codeStyleSettings = formattingContext.getCodeStyleSettings();
        return FormattingModelProvider
            .createFormattingModelForPsiFile(formattingContext.getContainingFile(),
                new StructurizrBlock(formattingContext.getNode(),
                    Wrap.createWrap(WrapType.NONE, false),
                    Alignment.createAlignment(),
                    createSpaceBuilder(codeStyleSettings)),
                codeStyleSettings);
    }



}
