/*
 * Copyright(c) 2016 - Heliosphere Corp.
 * ---------------------------------------------------------------------------
 * This file is part of the Heliosphere's project which is licensed under the
 * Apache license version 2 and use is subject to license terms.
 * You should have received a copy of the license with the project's artifact
 * binaries and/or sources.
 * 
 * License can be consulted at http://www.apache.org/licenses/LICENSE-2.0
 * ---------------------------------------------------------------------------
 */
package com.hemajoo.gaming.atlas.common.avatar;

import lombok.NonNull;

/**
 * Enumerates the several possible race types for an {@link Avatar}.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public enum RaceType
{
	/**
	 * Undefined race type.
	 */
	UNDEFINED(FactionType.UNDEFINED),

	/**
	 * Draenei race type.
	 */
	DRAENEI(FactionType.ALLIANCE),

	/**
	 * Dwarf race type.
	 */
	DWARF(FactionType.ALLIANCE),

	/**
	 * Human race type.
	 */
	HUMAN(FactionType.ALLIANCE),

	/**
	 * Night Elf race type.
	 */
	NIGHT_ELF(FactionType.ALLIANCE),

	/**
	 * Worgen race type.
	 */
	WORGEN(FactionType.ALLIANCE),

	/**
	 * Void Elf race type.
	 */
	VOID_ELF(FactionType.ALLIANCE),

	/**
	 * Gnome race type.
	 */
	GNOME(FactionType.ALLIANCE),

	/**
	 * Goblin race type.
	 */
	GOBLIN(FactionType.HORDE),

	/**
	 * Orc race type.
	 */
	ORC(FactionType.HORDE),

	/**
	 * Tauren race type.
	 */
	TAUREN(FactionType.HORDE),

	/**
	 * Troll race type.
	 */
	TROLL(FactionType.HORDE),

	/**
	 * Undead race type.
	 */
	UNDEAD(FactionType.HORDE),

	/**
	 * Pandaren race type.
	 */
	PANDAREN(FactionType.NEUTRAL);

	/**
	 * The faction type.
	 */
	private FactionType faction = FactionType.UNDEFINED;

	/**
	 * Creates a new race type.
	 * <hr>
	 * @param faction {@link FactionType} associated to the race type.
	 */
	private RaceType(@NonNull final FactionType faction)
	{
		this.faction = faction;
	}

	/**
	 * Returns the faction type of the race type.
	 * <hr>
	 * @return {@link FactionType} associated to the race type.
	 */
	public final FactionType getFaction()
	{
		return faction;
	}
}
