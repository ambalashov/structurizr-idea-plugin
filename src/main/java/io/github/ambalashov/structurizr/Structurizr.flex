package io.github.ambalahov.sturcturizr;

import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static io.github.ambalashov.structurizr.psi.StructurizrTypes.*;

%%

%{
  public StructurizrLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class StructurizrLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode


CRLF=\R
WHITE_SPACE=[\ \n\t\f]
QUOTED_TEXT=\"[^\"]*\"
COMMENT=("//")+(.)*\n
left_ref=[a-z][a-zA-Z0-9_\-]*
right_ref=[a-z][a-zA-Z0-9_\-]*
ID_TOKEN=[a-z][a-zA-Z0-9_]*
SHAPE_TYPE=Cylinder|Box
END_OF_LINE_COMMENT=("//")[^\r\n]*
FILE=[a-zA-Z][a-zA-Z0-9_\/]*(\.[a-zA-Z0-9_]+)*

%%
<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return COMMENT; }

<YYINITIAL> {

// keywords
  "workspace"          { return WORKSPACE; }
  "model"              { return MODEL; }
  "properties"         { return PROPERTIES; }
  "person"             { return PERSON; }
  "softwareSystem"     { return SOFTWARESYSTEM; }
  "group"              { return GROUP; }
  "container"          { return CONTAINER; }
  "component"          { return COMPONENT; }
  "views"              { return VIEWS; }
  "systemLandscape"    { return SYSTEMLANDSCAPE; }
  "systemContext"      { return SYSTEMCONTEXT; }
  "!identifiers hierarchical" { return IDENTIFIERS_HIERARCHICAL; }
  "!include"           { return INCLUDE_KEYWORD; }

  "{"                  { return LB; }
  "}"                  { return RB; }
  "="                  { return EQ; }
  "->"                 { return REL; }
  "*"                  { return ASTERISK; }

  {CRLF}               { return WHITE_SPACE; }
  {WHITE_SPACE}        { return WHITE_SPACE; }
  {QUOTED_TEXT}        { return QUOTED_TEXT; }
//  {COMMENT}            { return COMMENT; }
  {ID_TOKEN}           { return ID_TOKEN; }
  {SHAPE_TYPE}         { return SHAPE_TYPE; }
  {FILE}               { return FILE; }

}


[^] { return BAD_CHARACTER; }
