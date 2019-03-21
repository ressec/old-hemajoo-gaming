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
package com.hemajoo.gaming.atlas.common.bestiary.creature;

/**
 * Interface specifying the behavior of a creature.
 * <p>
 * When specialized, a creature can become a monster, a critter, a pet, a non playable character or an avatar.
 * <hr>
 * @author <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo <a/>
 * @version 1.0.0
 */
public interface ICreature
{
	/**
	 * Generates a fake creature.
	 * <p>
	 * Generally used for testing purpose.
	 * <p>
	 * @return Newly generated fake creature.
	 */
	ICreature fake();
}
