package com.geeckon.instantdamagecalculator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.FontID;

/**
 * Fonts that can be used for xp drops. The game only ships a fixed set of fonts, so the text of an
 * xp drop can not be scaled freely; it can only be switched between these.
 */
@AllArgsConstructor
@Getter
public enum XpDropFont
{
	DEFAULT("Game default", -1),
	QUILL_8("Quill 8 (smallest)", FontID.QUILL_8),
	PLAIN_11("Plain 11 (game small)", FontID.PLAIN_11),
	PLAIN_12("Plain 12 (game medium)", FontID.PLAIN_12),
	BOLD_12("Bold 12 (game large)", FontID.BOLD_12),
	VERDANA_11("Verdana 11", FontID.VERDANA_11),
	VERDANA_11_BOLD("Verdana 11 bold", FontID.VERDANA_11_BOLD),
	VERDANA_13("Verdana 13", FontID.VERDANA_13),
	VERDANA_13_BOLD("Verdana 13 bold", FontID.VERDANA_13_BOLD),
	VERDANA_15("Verdana 15 (largest)", FontID.VERDANA_15);

	private final String name;
	private final int fontId;

	@Override
	public String toString()
	{
		return name;
	}
}
