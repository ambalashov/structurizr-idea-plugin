package org.intellij.sdk.language;

import com.intellij.application.options.CodeStyle;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.psi.PsiReference;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import com.intellij.usageView.UsageInfo;
import com.intellij.util.containers.ContainerUtil;
import io.github.ambalashov.sturcturizr.psi.StructurizrIncludeFile;

import java.util.Collection;

public class SimpleCodeInsightTest extends BasePlatformTestCase {

    @Override
    protected String getTestDataPath() {
        return "src/test/testData";
    }

    public void testFindUsages() {
        Collection<UsageInfo> usageInfos = myFixture.testFindUsages("FindUsageTestData.dsl");
        assertEquals(1, usageInfos.size());
    }

    public void testRename() {
        myFixture.configureByFiles("RenameTestData.dsl");
        myFixture.renameElementAtCaret("ss_ref");
        myFixture.checkResultByFile("RenameTestDataAfter.dsl", false);
    }

    public void testFolding() {
        myFixture.configureByFile("FoldingTest.dsl");
        myFixture.testFolding(getTestDataPath() + "/FoldingTestData.dsl");
    }

    public void testAnnotator() {
        myFixture.configureByFiles("AnnotateErrorTest.dsl");
        myFixture.checkHighlighting(false, false, true, true);
    }

    public void testFormatter() {
        myFixture.configureByFile("FormatterTestData.dsl");
        CodeStyle.getLanguageSettings(myFixture.getFile()).KEEP_BLANK_LINES_IN_CODE = 2;
        CodeStyle.getIndentOptions(myFixture.getFile()).INDENT_SIZE = 2;
        WriteCommandAction.writeCommandAction(getProject()).run(() ->
            CodeStyleManager.getInstance(getProject()).reformatText(
                myFixture.getFile(),
                ContainerUtil.newArrayList(myFixture.getFile().getTextRange())
            )
        );
        myFixture.checkResultByFile("FormatterTestDataAfter.dsl");
    }

    public void testReference() {
        myFixture.configureByFiles("FileReferenceTest.dsl", "other.dsl");

        StructurizrIncludeFile elementByText = myFixture.findElementByText("other.dsl", StructurizrIncludeFile.class);
        PsiReference[] references = elementByText.getReferences();
        assertSize(1, references);
        assertEquals("other.dsl", references[0].getCanonicalText());
    }

    public void testCompletion() {
        // myFixture.configureByFiles("CompletionTestData.dsl");
        // myFixture.complete(CompletionType.BASIC);
        // List<String> lookupElementStrings = myFixture.getLookupElementStrings();
        // assertNotNull(lookupElementStrings);
        // assertSameElements(lookupElementStrings, "p1");
    }
}
