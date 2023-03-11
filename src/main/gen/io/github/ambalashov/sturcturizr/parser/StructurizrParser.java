// This is a generated file. Not intended for manual editing.
package io.github.ambalashov.sturcturizr.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.github.ambalashov.sturcturizr.psi.StructurizrTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class StructurizrParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return structurizrFile(b, l + 1);
  }

  /* ********************************************************** */
  // 'autoLayout'
  public static boolean auto_layout_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "auto_layout_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AUTO_LAYOUT_EXPR, "<auto layout expr>");
    r = consumeToken(b, "autoLayout");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [identifier '='] component item_name [description] [technology] [tags]
  // ('{' (relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}')?
  public static boolean component_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr")) return false;
    if (!nextTokenIs(b, "<component expr>", COMPONENT, ID_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_EXPR, "<component expr>");
    r = component_expr_0(b, l + 1);
    r = r && consumeToken(b, COMPONENT);
    r = r && item_name(b, l + 1);
    r = r && component_expr_3(b, l + 1);
    r = r && component_expr_4(b, l + 1);
    r = r && component_expr_5(b, l + 1);
    r = r && component_expr_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [identifier '=']
  private static boolean component_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_0")) return false;
    component_expr_0_0(b, l + 1);
    return true;
  }

  // identifier '='
  private static boolean component_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // [description]
  private static boolean component_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_3")) return false;
    description(b, l + 1);
    return true;
  }

  // [technology]
  private static boolean component_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_4")) return false;
    technology(b, l + 1);
    return true;
  }

  // [tags]
  private static boolean component_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_5")) return false;
    tags(b, l + 1);
    return true;
  }

  // ('{' (relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}')?
  private static boolean component_expr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_6")) return false;
    component_expr_6_0(b, l + 1);
    return true;
  }

  // '{' (relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}'
  private static boolean component_expr_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && component_expr_6_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)*
  private static boolean component_expr_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_6_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!component_expr_6_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "component_expr_6_0_1", c)) break;
    }
    return true;
  }

  // relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF
  private static boolean component_expr_6_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_expr_6_0_1_0")) return false;
    boolean r;
    r = relation_expr(b, l + 1);
    if (!r) r = identifier_ref(b, l + 1);
    if (!r) r = dsl_include(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // component identifier_ref [key] [description] '{'
  //   (view_item_)*
  // '}'
  public static boolean component_view_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_expr")) return false;
    if (!nextTokenIs(b, COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPONENT);
    r = r && identifier_ref(b, l + 1);
    r = r && component_view_expr_2(b, l + 1);
    r = r && component_view_expr_3(b, l + 1);
    r = r && consumeToken(b, LB);
    r = r && component_view_expr_5(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, COMPONENT_VIEW_EXPR, r);
    return r;
  }

  // [key]
  private static boolean component_view_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_expr_2")) return false;
    key(b, l + 1);
    return true;
  }

  // [description]
  private static boolean component_view_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_expr_3")) return false;
    description(b, l + 1);
    return true;
  }

  // (view_item_)*
  private static boolean component_view_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_expr_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!component_view_expr_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "component_view_expr_5", c)) break;
    }
    return true;
  }

  // (view_item_)
  private static boolean component_view_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_view_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = view_item_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [identifier '='] container item_name [description] [technology] [tags]
  // ('{' (component_expr
  //   | group_container_expr
  //   | relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}')?
  public static boolean container_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr")) return false;
    if (!nextTokenIs(b, "<container expr>", CONTAINER, ID_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTAINER_EXPR, "<container expr>");
    r = container_expr_0(b, l + 1);
    r = r && consumeToken(b, CONTAINER);
    r = r && item_name(b, l + 1);
    r = r && container_expr_3(b, l + 1);
    r = r && container_expr_4(b, l + 1);
    r = r && container_expr_5(b, l + 1);
    r = r && container_expr_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [identifier '=']
  private static boolean container_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_0")) return false;
    container_expr_0_0(b, l + 1);
    return true;
  }

  // identifier '='
  private static boolean container_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // [description]
  private static boolean container_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_3")) return false;
    description(b, l + 1);
    return true;
  }

  // [technology]
  private static boolean container_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_4")) return false;
    technology(b, l + 1);
    return true;
  }

  // [tags]
  private static boolean container_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_5")) return false;
    tags(b, l + 1);
    return true;
  }

  // ('{' (component_expr
  //   | group_container_expr
  //   | relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}')?
  private static boolean container_expr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_6")) return false;
    container_expr_6_0(b, l + 1);
    return true;
  }

  // '{' (component_expr
  //   | group_container_expr
  //   | relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}'
  private static boolean container_expr_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && container_expr_6_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (component_expr
  //   | group_container_expr
  //   | relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)*
  private static boolean container_expr_6_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_6_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!container_expr_6_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "container_expr_6_0_1", c)) break;
    }
    return true;
  }

  // component_expr
  //   | group_container_expr
  //   | relation_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF
  private static boolean container_expr_6_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_expr_6_0_1_0")) return false;
    boolean r;
    r = component_expr(b, l + 1);
    if (!r) r = group_container_expr(b, l + 1);
    if (!r) r = relation_expr(b, l + 1);
    if (!r) r = identifier_ref(b, l + 1);
    if (!r) r = dsl_include(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // container identifier_ref [key] [description] '{'
  //   (view_item_)*
  // '}'
  public static boolean container_view_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_expr")) return false;
    if (!nextTokenIs(b, CONTAINER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTAINER);
    r = r && identifier_ref(b, l + 1);
    r = r && container_view_expr_2(b, l + 1);
    r = r && container_view_expr_3(b, l + 1);
    r = r && consumeToken(b, LB);
    r = r && container_view_expr_5(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, CONTAINER_VIEW_EXPR, r);
    return r;
  }

  // [key]
  private static boolean container_view_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_expr_2")) return false;
    key(b, l + 1);
    return true;
  }

  // [description]
  private static boolean container_view_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_expr_3")) return false;
    description(b, l + 1);
    return true;
  }

  // (view_item_)*
  private static boolean container_view_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_expr_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!container_view_expr_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "container_view_expr_5", c)) break;
    }
    return true;
  }

  // (view_item_)
  private static boolean container_view_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "container_view_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = view_item_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTED_TEXT
  public static boolean description(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "description")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_TEXT);
    exit_section_(b, m, DESCRIPTION, r);
    return r;
  }

  /* ********************************************************** */
  // include_keyword (include_file)
  public static boolean dsl_include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dsl_include")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DSL_INCLUDE, "<dsl include>");
    r = include_keyword(b, l + 1);
    r = r && dsl_include_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (include_file)
  private static boolean dsl_include_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dsl_include_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include_file(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'element' key ('{'
  //   (COMMENT | CRLF | shape_expr)*
  // '}')?
  public static boolean element_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_EXPR, "<element expr>");
    r = consumeToken(b, "element");
    r = r && key(b, l + 1);
    r = r && element_expr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('{'
  //   (COMMENT | CRLF | shape_expr)*
  // '}')?
  private static boolean element_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_expr_2")) return false;
    element_expr_2_0(b, l + 1);
    return true;
  }

  // '{'
  //   (COMMENT | CRLF | shape_expr)*
  // '}'
  private static boolean element_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_expr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && element_expr_2_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMENT | CRLF | shape_expr)*
  private static boolean element_expr_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_expr_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!element_expr_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "element_expr_2_0_1", c)) break;
    }
    return true;
  }

  // COMMENT | CRLF | shape_expr
  private static boolean element_expr_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_expr_2_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    if (!r) r = shape_expr(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // 'exclude' include_item_+
  public static boolean exclude_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclude_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCLUDE_EXPR, "<exclude expr>");
    r = consumeToken(b, "exclude");
    r = r && exclude_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // include_item_+
  private static boolean exclude_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclude_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include_item_(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!include_item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "exclude_expr_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier_decl group item_name ('{'
  //     (component_expr
  //     | relation_expr
  //     | group_container_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF)*
  //   '}')?
  public static boolean group_container_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_container_expr")) return false;
    if (!nextTokenIs(b, "<group container expr>", GROUP, ID_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_CONTAINER_EXPR, "<group container expr>");
    r = identifier_decl(b, l + 1);
    r = r && consumeToken(b, GROUP);
    r = r && item_name(b, l + 1);
    r = r && group_container_expr_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('{'
  //     (component_expr
  //     | relation_expr
  //     | group_container_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF)*
  //   '}')?
  private static boolean group_container_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_container_expr_3")) return false;
    group_container_expr_3_0(b, l + 1);
    return true;
  }

  // '{'
  //     (component_expr
  //     | relation_expr
  //     | group_container_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF)*
  //   '}'
  private static boolean group_container_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_container_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && group_container_expr_3_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (component_expr
  //     | relation_expr
  //     | group_container_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF)*
  private static boolean group_container_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_container_expr_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!group_container_expr_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_container_expr_3_0_1", c)) break;
    }
    return true;
  }

  // component_expr
  //     | relation_expr
  //     | group_container_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF
  private static boolean group_container_expr_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_container_expr_3_0_1_0")) return false;
    boolean r;
    r = component_expr(b, l + 1);
    if (!r) r = relation_expr(b, l + 1);
    if (!r) r = group_container_expr(b, l + 1);
    if (!r) r = identifier_ref(b, l + 1);
    if (!r) r = dsl_include(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // identifier_decl group item_name ('{'
  //   ( software_system_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)*
  // '}')?
  public static boolean group_model_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_model_expr")) return false;
    if (!nextTokenIs(b, "<group model expr>", GROUP, ID_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_MODEL_EXPR, "<group model expr>");
    r = identifier_decl(b, l + 1);
    r = r && consumeToken(b, GROUP);
    r = r && item_name(b, l + 1);
    r = r && group_model_expr_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('{'
  //   ( software_system_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)*
  // '}')?
  private static boolean group_model_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_model_expr_3")) return false;
    group_model_expr_3_0(b, l + 1);
    return true;
  }

  // '{'
  //   ( software_system_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)*
  // '}'
  private static boolean group_model_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_model_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && group_model_expr_3_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( software_system_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)*
  private static boolean group_model_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_model_expr_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!group_model_expr_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_model_expr_3_0_1", c)) break;
    }
    return true;
  }

  // software_system_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF
  private static boolean group_model_expr_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_model_expr_3_0_1_0")) return false;
    boolean r;
    r = software_system_expr(b, l + 1);
    if (!r) r = relation_expr(b, l + 1);
    if (!r) r = group_ss_expr(b, l + 1);
    if (!r) r = identifier_ref(b, l + 1);
    if (!r) r = dsl_include(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // identifier_decl group item_name ('{'
  //   (container_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}')?
  public static boolean group_ss_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_ss_expr")) return false;
    if (!nextTokenIs(b, "<group ss expr>", GROUP, ID_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_SS_EXPR, "<group ss expr>");
    r = identifier_decl(b, l + 1);
    r = r && consumeToken(b, GROUP);
    r = r && item_name(b, l + 1);
    r = r && group_ss_expr_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('{'
  //   (container_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}')?
  private static boolean group_ss_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_ss_expr_3")) return false;
    group_ss_expr_3_0(b, l + 1);
    return true;
  }

  // '{'
  //   (container_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)* '}'
  private static boolean group_ss_expr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_ss_expr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && group_ss_expr_3_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (container_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF)*
  private static boolean group_ss_expr_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_ss_expr_3_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!group_ss_expr_3_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_ss_expr_3_0_1", c)) break;
    }
    return true;
  }

  // container_expr
  //   | relation_expr
  //   | group_ss_expr
  //   | identifier_ref
  //   | dsl_include
  //   | COMMENT | CRLF
  private static boolean group_ss_expr_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_ss_expr_3_0_1_0")) return false;
    boolean r;
    r = container_expr(b, l + 1);
    if (!r) r = relation_expr(b, l + 1);
    if (!r) r = group_ss_expr(b, l + 1);
    if (!r) r = identifier_ref(b, l + 1);
    if (!r) r = dsl_include(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // ID_TOKEN
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, ID_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID_TOKEN);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // [identifier '=']
  static boolean identifier_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_decl")) return false;
    identifier_decl_0(b, l + 1);
    return true;
  }

  // identifier '='
  private static boolean identifier_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID_TOKEN
  public static boolean identifier_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_ref")) return false;
    if (!nextTokenIs(b, ID_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID_TOKEN);
    exit_section_(b, m, IDENTIFIER_REF, r);
    return r;
  }

  /* ********************************************************** */
  // '!identifiers hierarchical'
  public static boolean identifiers_hierarchical(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifiers_hierarchical")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIERS_HIERARCHICAL, "<identifiers hierarchical>");
    r = consumeToken(b, "!identifiers hierarchical");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'include' include_item_+
  public static boolean include_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_EXPR, "<include expr>");
    r = consumeToken(b, "include");
    r = r && include_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // include_item_+
  private static boolean include_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = include_item_(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!include_item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "include_expr_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTED_TEXT
  public static boolean include_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_expression")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_TEXT);
    exit_section_(b, m, INCLUDE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // FILE
  public static boolean include_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_file")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    exit_section_(b, m, INCLUDE_FILE, r);
    return r;
  }

  /* ********************************************************** */
  // '*' | identifier_ref | include_expression
  static boolean include_item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_item_")) return false;
    boolean r;
    r = consumeToken(b, ASTERISK);
    if (!r) r = identifier_ref(b, l + 1);
    if (!r) r = include_expression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '!include'
  public static boolean include_keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_keyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_KEYWORD, "<include keyword>");
    r = consumeToken(b, "!include");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // workspaceExpression
  //   | person_expr
  //   | software_system_expr
  //   | relation_expr
  //   | identifier
  //   | COMMENT
  //   | CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = workspaceExpression(b, l + 1);
    if (!r) r = person_expr(b, l + 1);
    if (!r) r = software_system_expr(b, l + 1);
    if (!r) r = relation_expr(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // QUOTED_TEXT
  public static boolean item_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_name")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_TEXT);
    exit_section_(b, m, ITEM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTED_TEXT
  public static boolean key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_TEXT);
    exit_section_(b, m, KEY, r);
    return r;
  }

  /* ********************************************************** */
  // model '{'
  //     ( model_properties
  //     | software_system_expr
  //     | relation_expr
  //     | group_model_expr
  //     | person_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT
  //     | CRLF)*
  //   '}'
  public static boolean modelExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modelExpr")) return false;
    if (!nextTokenIs(b, MODEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MODEL, LB);
    r = r && modelExpr_2(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, MODEL_EXPR, r);
    return r;
  }

  // ( model_properties
  //     | software_system_expr
  //     | relation_expr
  //     | group_model_expr
  //     | person_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT
  //     | CRLF)*
  private static boolean modelExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modelExpr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!modelExpr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "modelExpr_2", c)) break;
    }
    return true;
  }

  // model_properties
  //     | software_system_expr
  //     | relation_expr
  //     | group_model_expr
  //     | person_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT
  //     | CRLF
  private static boolean modelExpr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "modelExpr_2_0")) return false;
    boolean r;
    r = model_properties(b, l + 1);
    if (!r) r = software_system_expr(b, l + 1);
    if (!r) r = relation_expr(b, l + 1);
    if (!r) r = group_model_expr(b, l + 1);
    if (!r) r = person_expr(b, l + 1);
    if (!r) r = identifier_ref(b, l + 1);
    if (!r) r = dsl_include(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // properties '{'
  //   (model_properties_item | COMMENT | CRLF )*
  //   '}'
  public static boolean model_properties(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_properties")) return false;
    if (!nextTokenIs(b, PROPERTIES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PROPERTIES, LB);
    r = r && model_properties_2(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, MODEL_PROPERTIES, r);
    return r;
  }

  // (model_properties_item | COMMENT | CRLF )*
  private static boolean model_properties_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_properties_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!model_properties_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "model_properties_2", c)) break;
    }
    return true;
  }

  // model_properties_item | COMMENT | CRLF
  private static boolean model_properties_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_properties_2_0")) return false;
    boolean r;
    r = model_properties_item(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // prop_key prop_value
  public static boolean model_properties_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "model_properties_item")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = prop_key(b, l + 1);
    r = r && prop_value(b, l + 1);
    exit_section_(b, m, MODEL_PROPERTIES_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // identifier_decl person item_name [description] [tags] ('{'
  //     (COMMENT)*
  //   '}')?
  public static boolean person_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_expr")) return false;
    if (!nextTokenIs(b, "<person expr>", ID_TOKEN, PERSON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PERSON_EXPR, "<person expr>");
    r = identifier_decl(b, l + 1);
    r = r && consumeToken(b, PERSON);
    r = r && item_name(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, person_expr_3(b, l + 1));
    r = p && report_error_(b, person_expr_4(b, l + 1)) && r;
    r = p && person_expr_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [description]
  private static boolean person_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_expr_3")) return false;
    description(b, l + 1);
    return true;
  }

  // [tags]
  private static boolean person_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_expr_4")) return false;
    tags(b, l + 1);
    return true;
  }

  // ('{'
  //     (COMMENT)*
  //   '}')?
  private static boolean person_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_expr_5")) return false;
    person_expr_5_0(b, l + 1);
    return true;
  }

  // '{'
  //     (COMMENT)*
  //   '}'
  private static boolean person_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && person_expr_5_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMENT)*
  private static boolean person_expr_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "person_expr_5_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "person_expr_5_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // QUOTED_TEXT
  public static boolean prop_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_key")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_TEXT);
    exit_section_(b, m, PROP_KEY, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTED_TEXT
  public static boolean prop_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prop_value")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_TEXT);
    exit_section_(b, m, PROP_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // identifier_ref '->' identifier_ref
  static boolean relation_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_")) return false;
    if (!nextTokenIs(b, ID_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = identifier_ref(b, l + 1);
    r = r && consumeToken(b, REL);
    p = r; // pin = 2
    r = r && identifier_ref(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // [identifier '='] (relation_ [item_name] [description] [technology] [tags] ('{'
  //     (COMMENT)*
  //   '}')?)
  public static boolean relation_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr")) return false;
    if (!nextTokenIs(b, ID_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation_expr_0(b, l + 1);
    r = r && relation_expr_1(b, l + 1);
    exit_section_(b, m, RELATION_EXPR, r);
    return r;
  }

  // [identifier '=']
  private static boolean relation_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_0")) return false;
    relation_expr_0_0(b, l + 1);
    return true;
  }

  // identifier '='
  private static boolean relation_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation_ [item_name] [description] [technology] [tags] ('{'
  //     (COMMENT)*
  //   '}')?
  private static boolean relation_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation_(b, l + 1);
    r = r && relation_expr_1_1(b, l + 1);
    r = r && relation_expr_1_2(b, l + 1);
    r = r && relation_expr_1_3(b, l + 1);
    r = r && relation_expr_1_4(b, l + 1);
    r = r && relation_expr_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [item_name]
  private static boolean relation_expr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_1_1")) return false;
    item_name(b, l + 1);
    return true;
  }

  // [description]
  private static boolean relation_expr_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_1_2")) return false;
    description(b, l + 1);
    return true;
  }

  // [technology]
  private static boolean relation_expr_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_1_3")) return false;
    technology(b, l + 1);
    return true;
  }

  // [tags]
  private static boolean relation_expr_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_1_4")) return false;
    tags(b, l + 1);
    return true;
  }

  // ('{'
  //     (COMMENT)*
  //   '}')?
  private static boolean relation_expr_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_1_5")) return false;
    relation_expr_1_5_0(b, l + 1);
    return true;
  }

  // '{'
  //     (COMMENT)*
  //   '}'
  private static boolean relation_expr_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_1_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && relation_expr_1_5_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMENT)*
  private static boolean relation_expr_1_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_expr_1_5_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "relation_expr_1_5_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // 'shape' SHAPE_TYPE
  public static boolean shape_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shape_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHAPE_EXPR, "<shape expr>");
    r = consumeToken(b, "shape");
    r = r && consumeToken(b, SHAPE_TYPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [identifier '='] softwareSystem item_name [description] [tags] [('{'
  //     (group_ss_expr
  //     | container_expr
  //     | relation_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF)*
  //   '}')]
  public static boolean software_system_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr")) return false;
    if (!nextTokenIs(b, "<software system expr>", ID_TOKEN, SOFTWARESYSTEM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SOFTWARE_SYSTEM_EXPR, "<software system expr>");
    r = software_system_expr_0(b, l + 1);
    r = r && consumeToken(b, SOFTWARESYSTEM);
    r = r && item_name(b, l + 1);
    r = r && software_system_expr_3(b, l + 1);
    r = r && software_system_expr_4(b, l + 1);
    r = r && software_system_expr_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [identifier '=']
  private static boolean software_system_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr_0")) return false;
    software_system_expr_0_0(b, l + 1);
    return true;
  }

  // identifier '='
  private static boolean software_system_expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // [description]
  private static boolean software_system_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr_3")) return false;
    description(b, l + 1);
    return true;
  }

  // [tags]
  private static boolean software_system_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr_4")) return false;
    tags(b, l + 1);
    return true;
  }

  // [('{'
  //     (group_ss_expr
  //     | container_expr
  //     | relation_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF)*
  //   '}')]
  private static boolean software_system_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr_5")) return false;
    software_system_expr_5_0(b, l + 1);
    return true;
  }

  // '{'
  //     (group_ss_expr
  //     | container_expr
  //     | relation_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF)*
  //   '}'
  private static boolean software_system_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && software_system_expr_5_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (group_ss_expr
  //     | container_expr
  //     | relation_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF)*
  private static boolean software_system_expr_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr_5_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!software_system_expr_5_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "software_system_expr_5_0_1", c)) break;
    }
    return true;
  }

  // group_ss_expr
  //     | container_expr
  //     | relation_expr
  //     | identifier_ref
  //     | dsl_include
  //     | COMMENT | CRLF
  private static boolean software_system_expr_5_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_system_expr_5_0_1_0")) return false;
    boolean r;
    r = group_ss_expr(b, l + 1);
    if (!r) r = container_expr(b, l + 1);
    if (!r) r = relation_expr(b, l + 1);
    if (!r) r = identifier_ref(b, l + 1);
    if (!r) r = dsl_include(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean structurizrFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structurizrFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structurizrFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // element_expr
  static boolean style_item_(PsiBuilder b, int l) {
    return element_expr(b, l + 1);
  }

  /* ********************************************************** */
  // 'styles' '{' (style_item_)* '}'
  public static boolean styles_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "styles_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STYLES_EXPR, "<styles expr>");
    r = consumeToken(b, "styles");
    r = r && consumeToken(b, LB);
    r = r && styles_expr_2(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (style_item_)*
  private static boolean styles_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "styles_expr_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!styles_expr_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "styles_expr_2", c)) break;
    }
    return true;
  }

  // (style_item_)
  private static boolean styles_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "styles_expr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = style_item_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // systemContext identifier_ref [key] [description] '{'
  //    (view_item_)*
  // '}'
  public static boolean system_context_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_expr")) return false;
    if (!nextTokenIs(b, SYSTEMCONTEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYSTEMCONTEXT);
    r = r && identifier_ref(b, l + 1);
    r = r && system_context_expr_2(b, l + 1);
    r = r && system_context_expr_3(b, l + 1);
    r = r && consumeToken(b, LB);
    r = r && system_context_expr_5(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, SYSTEM_CONTEXT_EXPR, r);
    return r;
  }

  // [key]
  private static boolean system_context_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_expr_2")) return false;
    key(b, l + 1);
    return true;
  }

  // [description]
  private static boolean system_context_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_expr_3")) return false;
    description(b, l + 1);
    return true;
  }

  // (view_item_)*
  private static boolean system_context_expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_expr_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!system_context_expr_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "system_context_expr_5", c)) break;
    }
    return true;
  }

  // (view_item_)
  private static boolean system_context_expr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_context_expr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = view_item_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // systemLandscape [key] [description] '{'
  //   (view_item_)*
  // '}'
  public static boolean system_landscape_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_expr")) return false;
    if (!nextTokenIs(b, SYSTEMLANDSCAPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYSTEMLANDSCAPE);
    r = r && system_landscape_expr_1(b, l + 1);
    r = r && system_landscape_expr_2(b, l + 1);
    r = r && consumeToken(b, LB);
    r = r && system_landscape_expr_4(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, SYSTEM_LANDSCAPE_EXPR, r);
    return r;
  }

  // [key]
  private static boolean system_landscape_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_expr_1")) return false;
    key(b, l + 1);
    return true;
  }

  // [description]
  private static boolean system_landscape_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_expr_2")) return false;
    description(b, l + 1);
    return true;
  }

  // (view_item_)*
  private static boolean system_landscape_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_expr_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!system_landscape_expr_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "system_landscape_expr_4", c)) break;
    }
    return true;
  }

  // (view_item_)
  private static boolean system_landscape_expr_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "system_landscape_expr_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = view_item_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTED_TEXT
  public static boolean tags(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tags")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_TEXT);
    exit_section_(b, m, TAGS, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTED_TEXT
  public static boolean technology(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "technology")) return false;
    if (!nextTokenIs(b, QUOTED_TEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTED_TEXT);
    exit_section_(b, m, TECHNOLOGY, r);
    return r;
  }

  /* ********************************************************** */
  // 'theme' ('default')
  public static boolean theme_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "theme_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THEME_EXPR, "<theme expr>");
    r = consumeToken(b, "theme");
    r = r && theme_expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('default')
  private static boolean theme_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "theme_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "default");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'title' item_name
  public static boolean title_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "title_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TITLE_EXPR, "<title expr>");
    r = consumeToken(b, "title");
    r = r && item_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // include_expr | exclude_expr | title_expr | auto_layout_expr | COMMENT | CRLF
  static boolean view_item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "view_item_")) return false;
    boolean r;
    r = include_expr(b, l + 1);
    if (!r) r = exclude_expr(b, l + 1);
    if (!r) r = title_expr(b, l + 1);
    if (!r) r = auto_layout_expr(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // views ('{'
  //     ( system_landscape_expr
  //     | system_context_expr
  //     | container_view_expr
  //     | component_view_expr
  //     | theme_expr
  //     | styles_expr
  //     | COMMENT | CRLF)*
  //  '}')?
  public static boolean viewsExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "viewsExpr")) return false;
    if (!nextTokenIs(b, VIEWS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VIEWS);
    r = r && viewsExpr_1(b, l + 1);
    exit_section_(b, m, VIEWS_EXPR, r);
    return r;
  }

  // ('{'
  //     ( system_landscape_expr
  //     | system_context_expr
  //     | container_view_expr
  //     | component_view_expr
  //     | theme_expr
  //     | styles_expr
  //     | COMMENT | CRLF)*
  //  '}')?
  private static boolean viewsExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "viewsExpr_1")) return false;
    viewsExpr_1_0(b, l + 1);
    return true;
  }

  // '{'
  //     ( system_landscape_expr
  //     | system_context_expr
  //     | container_view_expr
  //     | component_view_expr
  //     | theme_expr
  //     | styles_expr
  //     | COMMENT | CRLF)*
  //  '}'
  private static boolean viewsExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "viewsExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && viewsExpr_1_0_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( system_landscape_expr
  //     | system_context_expr
  //     | container_view_expr
  //     | component_view_expr
  //     | theme_expr
  //     | styles_expr
  //     | COMMENT | CRLF)*
  private static boolean viewsExpr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "viewsExpr_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!viewsExpr_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "viewsExpr_1_0_1", c)) break;
    }
    return true;
  }

  // system_landscape_expr
  //     | system_context_expr
  //     | container_view_expr
  //     | component_view_expr
  //     | theme_expr
  //     | styles_expr
  //     | COMMENT | CRLF
  private static boolean viewsExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "viewsExpr_1_0_1_0")) return false;
    boolean r;
    r = system_landscape_expr(b, l + 1);
    if (!r) r = system_context_expr(b, l + 1);
    if (!r) r = container_view_expr(b, l + 1);
    if (!r) r = component_view_expr(b, l + 1);
    if (!r) r = theme_expr(b, l + 1);
    if (!r) r = styles_expr(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // workspace [item_name] [description] '{'
  //     (COMMENT | CRLF)*
  //     identifiers_hierarchical?
  //     (COMMENT | CRLF)*
  //     modelExpr?
  //     (COMMENT | CRLF)*
  //     viewsExpr?
  //     (COMMENT | CRLF)*
  //  '}'
  public static boolean workspaceExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression")) return false;
    if (!nextTokenIs(b, WORKSPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WORKSPACE);
    r = r && workspaceExpression_1(b, l + 1);
    r = r && workspaceExpression_2(b, l + 1);
    r = r && consumeToken(b, LB);
    r = r && workspaceExpression_4(b, l + 1);
    r = r && workspaceExpression_5(b, l + 1);
    r = r && workspaceExpression_6(b, l + 1);
    r = r && workspaceExpression_7(b, l + 1);
    r = r && workspaceExpression_8(b, l + 1);
    r = r && workspaceExpression_9(b, l + 1);
    r = r && workspaceExpression_10(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, WORKSPACE_EXPRESSION, r);
    return r;
  }

  // [item_name]
  private static boolean workspaceExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_1")) return false;
    item_name(b, l + 1);
    return true;
  }

  // [description]
  private static boolean workspaceExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_2")) return false;
    description(b, l + 1);
    return true;
  }

  // (COMMENT | CRLF)*
  private static boolean workspaceExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!workspaceExpression_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "workspaceExpression_4", c)) break;
    }
    return true;
  }

  // COMMENT | CRLF
  private static boolean workspaceExpression_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_4_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  // identifiers_hierarchical?
  private static boolean workspaceExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_5")) return false;
    identifiers_hierarchical(b, l + 1);
    return true;
  }

  // (COMMENT | CRLF)*
  private static boolean workspaceExpression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!workspaceExpression_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "workspaceExpression_6", c)) break;
    }
    return true;
  }

  // COMMENT | CRLF
  private static boolean workspaceExpression_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_6_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  // modelExpr?
  private static boolean workspaceExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_7")) return false;
    modelExpr(b, l + 1);
    return true;
  }

  // (COMMENT | CRLF)*
  private static boolean workspaceExpression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_8")) return false;
    while (true) {
      int c = current_position_(b);
      if (!workspaceExpression_8_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "workspaceExpression_8", c)) break;
    }
    return true;
  }

  // COMMENT | CRLF
  private static boolean workspaceExpression_8_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_8_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  // viewsExpr?
  private static boolean workspaceExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_9")) return false;
    viewsExpr(b, l + 1);
    return true;
  }

  // (COMMENT | CRLF)*
  private static boolean workspaceExpression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_10")) return false;
    while (true) {
      int c = current_position_(b);
      if (!workspaceExpression_10_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "workspaceExpression_10", c)) break;
    }
    return true;
  }

  // COMMENT | CRLF
  private static boolean workspaceExpression_10_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "workspaceExpression_10_0")) return false;
    boolean r;
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

}
