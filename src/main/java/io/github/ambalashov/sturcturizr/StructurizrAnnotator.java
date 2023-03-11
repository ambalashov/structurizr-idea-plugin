package io.github.ambalashov.sturcturizr;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import io.github.ambalashov.sturcturizr.psi.StructurizrIdentifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class StructurizrAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element instanceof StructurizrIdentifier)) {
            return;
        }

        String id = ((StructurizrIdentifier) element).getId();

        List<StructurizrIdentifier> references = StructurizrUtil.findReferences(element.getProject(), id);
        if (references.size() > 1) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Duplicate identifier")
                .range(element.getTextRange())
                .create();

        }


        // // Define the text ranges (start is inclusive, end is exclusive)
//     // "simple:key"
//     //  01234567890
//     TextRange prefixRange = TextRange.from(element.getTextRange().getStartOffset(), SIMPLE_PREFIX_STR.length() + 1);
//     TextRange separatorRange = TextRange.from(prefixRange.getEndOffset(), SIMPLE_SEPARATOR_STR.length());
//     TextRange keyRange = new TextRange(separatorRange.getEndOffset(), element.getTextRange().getEndOffset() - 1);
//
//     // highlight "simple" prefix and ":" separator
//     holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
//             .range(prefixRange).textAttributes(DefaultLanguageHighlighterColors.KEYWORD).create();
//     holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
//             .range(separatorRange).textAttributes(SimpleSyntaxHighlighter.SEPARATOR).create();
//
//
//     // Get the list of properties for given key
//     String key = value.substring(SIMPLE_PREFIX_STR.length() + SIMPLE_SEPARATOR_STR.length());
//     List<SimpleProperty> properties = SimpleUtil.findProperties(element.getProject(), key);
//     if (properties.isEmpty()) {
//       holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved property")
//               .range(keyRange)
//               .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
//               // ** Tutorial step 18.3 - Add a quick fix for the string containing possible properties
//               .withFix(new SimpleCreatePropertyQuickFix(key))
//               .create();
//     } else {
//       // Found at least one property, force the text attributes to Simple syntax value character
//       holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
//               .range(keyRange).textAttributes(SimpleSyntaxHighlighter.VALUE).create();
//     }
    }
}
