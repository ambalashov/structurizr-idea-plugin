// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrAutoLayoutExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrComponentExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrComponentViewExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrContainerExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrContainerViewExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrDescriptionImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrDslIncludeImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrElementExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrExcludeExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrGroupContainerExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrGroupModelExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrGroupSsExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrIdentifierImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrIdentifierRefImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrIdentifiersHierarchicalImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrIncludeExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrIncludeExpressionImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrIncludeFileImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrIncludeKeywordImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrItemNameImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrKeyImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrModelExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrModelPropertiesImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrModelPropertiesItemImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrPersonExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrPropKeyImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrPropValueImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrRelationExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrShapeExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrSoftwareSystemExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrStylesExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrSystemContextExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrSystemLandscapeExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrTagsImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrTechnologyImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrThemeExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrTitleExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrViewsExprImpl;
import io.github.ambalashov.sturcturizr.psi.impl.StructurizrWorkspaceExpressionImpl;

public interface StructurizrTypes {

  IElementType AUTO_LAYOUT_EXPR = new StructurizrElementType("AUTO_LAYOUT_EXPR");
  IElementType COMPONENT_EXPR = new StructurizrElementType("COMPONENT_EXPR");
  IElementType COMPONENT_VIEW_EXPR = new StructurizrElementType("COMPONENT_VIEW_EXPR");
  IElementType CONTAINER_EXPR = new StructurizrElementType("CONTAINER_EXPR");
  IElementType CONTAINER_VIEW_EXPR = new StructurizrElementType("CONTAINER_VIEW_EXPR");
  IElementType DESCRIPTION = new StructurizrElementType("DESCRIPTION");
  IElementType DSL_INCLUDE = new StructurizrElementType("DSL_INCLUDE");
  IElementType ELEMENT_EXPR = new StructurizrElementType("ELEMENT_EXPR");
  IElementType EXCLUDE_EXPR = new StructurizrElementType("EXCLUDE_EXPR");
  IElementType GROUP_CONTAINER_EXPR = new StructurizrElementType("GROUP_CONTAINER_EXPR");
  IElementType GROUP_MODEL_EXPR = new StructurizrElementType("GROUP_MODEL_EXPR");
  IElementType GROUP_SS_EXPR = new StructurizrElementType("GROUP_SS_EXPR");
  IElementType IDENTIFIER = new StructurizrElementType("IDENTIFIER");
  IElementType IDENTIFIERS_HIERARCHICAL = new StructurizrElementType("IDENTIFIERS_HIERARCHICAL");
  IElementType IDENTIFIER_REF = new StructurizrElementType("IDENTIFIER_REF");
  IElementType INCLUDE_EXPR = new StructurizrElementType("INCLUDE_EXPR");
  IElementType INCLUDE_EXPRESSION = new StructurizrElementType("INCLUDE_EXPRESSION");
  IElementType INCLUDE_FILE = new StructurizrElementType("INCLUDE_FILE");
  IElementType INCLUDE_KEYWORD = new StructurizrElementType("INCLUDE_KEYWORD");
  IElementType ITEM_NAME = new StructurizrElementType("ITEM_NAME");
  IElementType KEY = new StructurizrElementType("KEY");
  IElementType MODEL_EXPR = new StructurizrElementType("MODEL_EXPR");
  IElementType MODEL_PROPERTIES = new StructurizrElementType("MODEL_PROPERTIES");
  IElementType MODEL_PROPERTIES_ITEM = new StructurizrElementType("MODEL_PROPERTIES_ITEM");
  IElementType PERSON_EXPR = new StructurizrElementType("PERSON_EXPR");
  IElementType PROP_KEY = new StructurizrElementType("PROP_KEY");
  IElementType PROP_VALUE = new StructurizrElementType("PROP_VALUE");
  IElementType RELATION_EXPR = new StructurizrElementType("RELATION_EXPR");
  IElementType SHAPE_EXPR = new StructurizrElementType("SHAPE_EXPR");
  IElementType SOFTWARE_SYSTEM_EXPR = new StructurizrElementType("SOFTWARE_SYSTEM_EXPR");
  IElementType STYLES_EXPR = new StructurizrElementType("STYLES_EXPR");
  IElementType SYSTEM_CONTEXT_EXPR = new StructurizrElementType("SYSTEM_CONTEXT_EXPR");
  IElementType SYSTEM_LANDSCAPE_EXPR = new StructurizrElementType("SYSTEM_LANDSCAPE_EXPR");
  IElementType TAGS = new StructurizrElementType("TAGS");
  IElementType TECHNOLOGY = new StructurizrElementType("TECHNOLOGY");
  IElementType THEME_EXPR = new StructurizrElementType("THEME_EXPR");
  IElementType TITLE_EXPR = new StructurizrElementType("TITLE_EXPR");
  IElementType VIEWS_EXPR = new StructurizrElementType("VIEWS_EXPR");
  IElementType WORKSPACE_EXPRESSION = new StructurizrElementType("WORKSPACE_EXPRESSION");

  IElementType ASTERISK = new StructurizrTokenType("*");
  IElementType COMMENT = new StructurizrTokenType("COMMENT");
  IElementType COMPONENT = new StructurizrTokenType("component");
  IElementType CONTAINER = new StructurizrTokenType("container");
  IElementType CRLF = new StructurizrTokenType("CRLF");
  IElementType EQ = new StructurizrTokenType("=");
  IElementType FILE = new StructurizrTokenType("FILE");
  IElementType GROUP = new StructurizrTokenType("group");
  IElementType ID_TOKEN = new StructurizrTokenType("ID_TOKEN");
  IElementType LB = new StructurizrTokenType("{");
  IElementType MODEL = new StructurizrTokenType("model");
  IElementType PERSON = new StructurizrTokenType("person");
  IElementType PROPERTIES = new StructurizrTokenType("properties");
  IElementType QUOTED_TEXT = new StructurizrTokenType("QUOTED_TEXT");
  IElementType RB = new StructurizrTokenType("}");
  IElementType REL = new StructurizrTokenType("->");
  IElementType SHAPE_TYPE = new StructurizrTokenType("SHAPE_TYPE");
  IElementType SOFTWARESYSTEM = new StructurizrTokenType("softwareSystem");
  IElementType SYSTEMCONTEXT = new StructurizrTokenType("systemContext");
  IElementType SYSTEMLANDSCAPE = new StructurizrTokenType("systemLandscape");
  IElementType VIEWS = new StructurizrTokenType("views");
  IElementType WORKSPACE = new StructurizrTokenType("workspace");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == AUTO_LAYOUT_EXPR) {
        return new StructurizrAutoLayoutExprImpl(node);
      }
      else if (type == COMPONENT_EXPR) {
        return new StructurizrComponentExprImpl(node);
      }
      else if (type == COMPONENT_VIEW_EXPR) {
        return new StructurizrComponentViewExprImpl(node);
      }
      else if (type == CONTAINER_EXPR) {
        return new StructurizrContainerExprImpl(node);
      }
      else if (type == CONTAINER_VIEW_EXPR) {
        return new StructurizrContainerViewExprImpl(node);
      }
      else if (type == DESCRIPTION) {
        return new StructurizrDescriptionImpl(node);
      }
      else if (type == DSL_INCLUDE) {
        return new StructurizrDslIncludeImpl(node);
      }
      else if (type == ELEMENT_EXPR) {
        return new StructurizrElementExprImpl(node);
      }
      else if (type == EXCLUDE_EXPR) {
        return new StructurizrExcludeExprImpl(node);
      }
      else if (type == GROUP_CONTAINER_EXPR) {
        return new StructurizrGroupContainerExprImpl(node);
      }
      else if (type == GROUP_MODEL_EXPR) {
        return new StructurizrGroupModelExprImpl(node);
      }
      else if (type == GROUP_SS_EXPR) {
        return new StructurizrGroupSsExprImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new StructurizrIdentifierImpl(node);
      }
      else if (type == IDENTIFIERS_HIERARCHICAL) {
        return new StructurizrIdentifiersHierarchicalImpl(node);
      }
      else if (type == IDENTIFIER_REF) {
        return new StructurizrIdentifierRefImpl(node);
      }
      else if (type == INCLUDE_EXPR) {
        return new StructurizrIncludeExprImpl(node);
      }
      else if (type == INCLUDE_EXPRESSION) {
        return new StructurizrIncludeExpressionImpl(node);
      }
      else if (type == INCLUDE_FILE) {
        return new StructurizrIncludeFileImpl(node);
      }
      else if (type == INCLUDE_KEYWORD) {
        return new StructurizrIncludeKeywordImpl(node);
      }
      else if (type == ITEM_NAME) {
        return new StructurizrItemNameImpl(node);
      }
      else if (type == KEY) {
        return new StructurizrKeyImpl(node);
      }
      else if (type == MODEL_EXPR) {
        return new StructurizrModelExprImpl(node);
      }
      else if (type == MODEL_PROPERTIES) {
        return new StructurizrModelPropertiesImpl(node);
      }
      else if (type == MODEL_PROPERTIES_ITEM) {
        return new StructurizrModelPropertiesItemImpl(node);
      }
      else if (type == PERSON_EXPR) {
        return new StructurizrPersonExprImpl(node);
      }
      else if (type == PROP_KEY) {
        return new StructurizrPropKeyImpl(node);
      }
      else if (type == PROP_VALUE) {
        return new StructurizrPropValueImpl(node);
      }
      else if (type == RELATION_EXPR) {
        return new StructurizrRelationExprImpl(node);
      }
      else if (type == SHAPE_EXPR) {
        return new StructurizrShapeExprImpl(node);
      }
      else if (type == SOFTWARE_SYSTEM_EXPR) {
        return new StructurizrSoftwareSystemExprImpl(node);
      }
      else if (type == STYLES_EXPR) {
        return new StructurizrStylesExprImpl(node);
      }
      else if (type == SYSTEM_CONTEXT_EXPR) {
        return new StructurizrSystemContextExprImpl(node);
      }
      else if (type == SYSTEM_LANDSCAPE_EXPR) {
        return new StructurizrSystemLandscapeExprImpl(node);
      }
      else if (type == TAGS) {
        return new StructurizrTagsImpl(node);
      }
      else if (type == TECHNOLOGY) {
        return new StructurizrTechnologyImpl(node);
      }
      else if (type == THEME_EXPR) {
        return new StructurizrThemeExprImpl(node);
      }
      else if (type == TITLE_EXPR) {
        return new StructurizrTitleExprImpl(node);
      }
      else if (type == VIEWS_EXPR) {
        return new StructurizrViewsExprImpl(node);
      }
      else if (type == WORKSPACE_EXPRESSION) {
        return new StructurizrWorkspaceExpressionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
