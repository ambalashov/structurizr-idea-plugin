package io.github.ambalashov.structurizr;

import com.intellij.formatting.Alignment;
import com.intellij.formatting.Block;
import com.intellij.formatting.Indent;
import com.intellij.formatting.Spacing;
import com.intellij.formatting.SpacingBuilder;
import com.intellij.formatting.Wrap;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static io.github.ambalashov.structurizr.psi.StructurizrTypes.*;

public class StructurizrBlock extends AbstractBlock {

    private final SpacingBuilder spacingBuilder;

    protected StructurizrBlock(@NotNull ASTNode node,
                               @Nullable Wrap wrap,
                               @Nullable Alignment alignment,
                               SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;
    }

    @Override
    protected List<Block> buildChildren() {
        List<Block> blocks = new ArrayList<>();
        ASTNode child = myNode.getFirstChildNode();
        while (child != null) {

            if (child.getElementType() != TokenType.WHITE_SPACE) {
                Block block = new StructurizrBlock(child,
                    null,
                    null,
                    spacingBuilder);
                blocks.add(block);
            }
            child = child.getTreeNext();
        }
        return blocks;
    }

    private static Set<IElementType> expressions = Set.of(
        WORKSPACE_EXPRESSION,
        MODEL_EXPR,
        MODEL_PROPERTIES,
        MODEL_PROPERTIES_ITEM,
        PERSON_EXPR,
        SOFTWARE_SYSTEM_EXPR,
        CONTAINER_EXPR,
        COMPONENT_EXPR,
        RELATION_EXPR,
        GROUP_MODEL_EXPR,
        GROUP_SS_EXPR,
        GROUP_CONTAINER_EXPR,
        VIEWS_EXPR,
        SYSTEM_LANDSCAPE_EXPR,
        SYSTEM_CONTEXT_EXPR,
        CONTAINER_VIEW_EXPR,
        COMPONENT_VIEW_EXPR,
        THEME_EXPR,
        STYLES_EXPR,
        INCLUDE_EXPR,
        EXCLUDE_EXPR,
        TITLE_EXPR,
        COMMENT,
        IDENTIFIERS_HIERARCHICAL,
        AUTO_LAYOUT_EXPR,
        ELEMENT_EXPR,
        SHAPE_EXPR,
        DSL_INCLUDE
        );


    private boolean isExpression(IElementType type) {
        return expressions.contains(type);
    }


    @Override
    public Indent getIndent() {
        if (isExpression(myNode.getElementType()) && (!(myNode.getPsi().getParent() instanceof PsiFile))) {
            return Indent.getNormalIndent();
        }
        return Indent.getNoneIndent();
    }

    @Override
    protected @Nullable Indent getChildIndent() {
        if (isExpression(myNode.getElementType()) && (!(myNode.getPsi().getParent() instanceof PsiFile))) {
            return Indent.getNormalIndent();
        }
        return Indent.getNoneIndent();
    }

    @Override
    public @Nullable Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return spacingBuilder.getSpacing(this, child1, child2);

    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }

}
