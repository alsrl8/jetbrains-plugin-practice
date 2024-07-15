package com.github.alsrl8.jetbrainspluginpractice.highlight

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors

/**
 * Object that holds custom text attributes keys for highlighting specific words or phrases in the editor.
 */
object HighlighterKeys {
    // Define a TextAttributesKey for custom highlighting. Using the default keyword style as a base,
    // which can be customized further according to your needs.
    @JvmField
    val HIGHLIGHT_KEY: TextAttributesKey = createTextAttributesKey(
        "MY_CUSTOM_HIGHLIGHT",
        DefaultLanguageHighlighterColors.KEYWORD,
    )
}
