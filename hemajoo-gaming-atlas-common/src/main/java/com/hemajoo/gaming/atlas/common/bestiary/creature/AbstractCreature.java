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
package com.hemajoo.gaming.atlas.common.bestiary.creature;

import com.hemajoo.gaming.atlas.common.key.Key;

import lombok.Getter;

/**
 * Provides an abstract implementation of a creature.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public abstract class AbstractCreature implements ICreature
{
	/**
	 * Creature key.
	 */
	@Getter
	protected Key key;

	/**
	 * Creature name.
	 */
	@Getter
	protected String name;

	/**
	 * Creates a new empty creature.
	 */
	public AbstractCreature()
	{
		//TODO Implement method body.
	}

	@Override
	public ICreature fake()
	{
		//TODO Implement method body.
		//throw NotYetImplementedException();
		return null;
	}

	@SuppressWarnings("nls")
	@Override
	public String toString()
	{
		return new StringBuilder()
				.append("Creature: name = " + this.getName())
				.toString();
	}
}
