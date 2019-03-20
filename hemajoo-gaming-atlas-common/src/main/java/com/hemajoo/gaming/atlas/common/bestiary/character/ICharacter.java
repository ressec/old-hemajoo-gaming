/*
 * Copyright(c) 2018 Hemajoo Ltd.
 * ---------------------------------------------------------------------------
 * This file is part of the Hemajoo's Incubation Software (HIS) project which is licensed
 * under the Apache license version 2 and use is subject to license terms.
 * You should have received a copy of the license with the project's artifact
 * binaries and/or sources.
 * 
 * License can be consulted at http://www.apache.org/licenses/LICENSE-2.0
 * ---------------------------------------------------------------------------
 */
package com.hemajoo.gaming.atlas.common.bestiary.character;

import com.hemajoo.gaming.atlas.common.bestiary.creature.ICreature;

/**
 * Interface specifying the behavior of a character.
 * <p>
 * It can be, by opposition of a creature or monster controlled by a human player (in this case
 * it's an avatar also called PC for playable character) or controlled by the AI
 * (artificial intelligence) and in such a case it's a non playable character (also called NPC).
 * <hr>
 * @author <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo <a/>
 * @version 1.0.0
 */
public interface ICharacter extends ICreature
{
	// EMPTY
}
