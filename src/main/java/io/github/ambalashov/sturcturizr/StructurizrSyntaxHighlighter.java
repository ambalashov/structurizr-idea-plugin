package io.github.ambalashov.sturcturizr;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import io.github.ambalashov.sturcturizr.psi.StructurizrTypes;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class StructurizrSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey SEPARATOR =
        createTextAttributesKey("STRUCTURIZR_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY =
        createTextAttributesKey("STRUCTURIZR_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
        createTextAttributesKey("STRUCTURIZR_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
        createTextAttributesKey("STRUCTURIZR_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
        createTextAttributesKey("STRUCTURIZR_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[] {BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[] {SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[] {KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[] {VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[] {COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new StructurizrLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(StructurizrTypes.EQ)) {
            return SEPARATOR_KEYS;
        }
        if (tokenType.equals(StructurizrTypes.REL)) {
            return SEPARATOR_KEYS;
        }
        if (isKeyword(tokenType)) {
            return KEY_KEYS;
        }
        if (tokenType.equals(StructurizrTypes.QUOTED_TEXT)) {
            return VALUE_KEYS;
        }
        if (tokenType.equals(StructurizrTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }

    private List<IElementType> keywords = List.of(
        StructurizrTypes.WORKSPACE,
        StructurizrTypes.MODEL,
        StructurizrTypes.PERSON,
        StructurizrTypes.SOFTWARESYSTEM,
        StructurizrTypes.CONTAINER,
        StructurizrTypes.COMPONENT,
        StructurizrTypes.GROUP,
        StructurizrTypes.VIEWS,
        StructurizrTypes.SYSTEMLANDSCAPE,
        StructurizrTypes.SYSTEMCONTEXT
    );

    private boolean isKeyword(IElementType tokenType) {
        return keywords.stream().anyMatch(tokenType::equals);
    }
}
