package io.github.ambalashov.structurizr;

import com.intellij.lexer.FlexAdapter;

public class StructurizrLexerAdapter extends FlexAdapter {
    public StructurizrLexerAdapter() {
        super(new StructurizrLexer(null));
    }
}
