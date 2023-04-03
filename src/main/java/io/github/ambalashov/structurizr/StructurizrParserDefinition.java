package io.github.ambalashov.structurizr;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.github.ambalashov.structurizr.parser.StructurizrParser;
import io.github.ambalashov.structurizr.psi.StructurizrTypes;
import org.jetbrains.annotations.NotNull;

public class StructurizrParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(StructurizrLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new StructurizrLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return StructurizrTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new StructurizrParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new StructurizrFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return StructurizrTypes.Factory.createElement(node);
    }

}