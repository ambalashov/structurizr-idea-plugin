package io.github.ambalashov.sturcturizr;

import com.intellij.lexer.FlexAdapter;
import io.github.ambalashov.sturcturizr.StructurizrLexer;

public class StructurizrLexerAdapter extends FlexAdapter {
    public StructurizrLexerAdapter() {
        super(new StructurizrLexer(null));
    }
}
