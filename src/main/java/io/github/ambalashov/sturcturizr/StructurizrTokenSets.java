package io.github.ambalashov.sturcturizr;

import com.intellij.psi.tree.TokenSet;
import io.github.ambalashov.sturcturizr.psi.StructurizrTypes;

public interface StructurizrTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(StructurizrTypes.IDENTIFIER);
    TokenSet IDENTIFIER_REF = TokenSet.create(StructurizrTypes.IDENTIFIER_REF);
    TokenSet COMMENTS = TokenSet.create(StructurizrTypes.COMMENT);
}
