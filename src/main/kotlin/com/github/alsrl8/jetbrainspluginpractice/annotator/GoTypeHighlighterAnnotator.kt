package com.github.alsrl8.jetbrainspluginpractice.annotator

import com.goide.psi.GoExpression
import com.goide.psi.GoNamedElement
import com.goide.psi.GoReferenceExpression
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.psi.PsiElement
import com.intellij.ui.JBColor
import java.awt.Font

class GoTypeHighlighterAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is GoReferenceExpression && "logger." == element.text) {
            val redAttributes = TextAttributes(JBColor.cyan, null, null, null, Font.ITALIC)
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element)
                .enforcedTextAttributes(redAttributes).create()
        } else if (element is GoNamedElement && "logger." == element.name) {
            val redAttributes = TextAttributes(JBColor.cyan, null, null, null, Font.ITALIC)
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION).range(element)
                .enforcedTextAttributes(redAttributes).create()
        }
    }
}
