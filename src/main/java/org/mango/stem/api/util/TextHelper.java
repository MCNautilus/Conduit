package org.mango.stem.api.util;

import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class TextHelper {
    /**
     * Generates a new LiteralText
     * @param text the text to show
     * @return a new text without a translation
     */
    public static Text of(String text) {
        // Lower than 1.19
        return new LiteralText(text);
        // 1.19+
        // return Text.of(text);
    }

    /**
     * Generates a new LiteralText
     * @param text the key of the text
     * @return a new translated text component
     */
    public static Text translatable(String text) {
        // Lower than 1.19
        return new TranslatableText(text);
        // 1.19+
        // return Text.translatable(text);
    }
}
