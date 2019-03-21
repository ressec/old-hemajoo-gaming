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

/**
 * Enumerates the several possible action status types for a creature.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public enum ActionStatusType
{
	/**
	 * Undefined action status.
	 */
	UNDEFINED,

	/**
	 * The creature is waiting (doing nothing).
	 */
	WAITING,

	/**
	 * The creature is moving.
	 */
	MOVING,

	/**
	 * The creature is fighting.
	 */
	FIGHTING,

	/**
	 * The creature is drinking.
	 */
	DRINKING,

	/**
	 * The creature is eating.
	 */
	EATING,

	/**
	 * The creature is dancing.
	 */
	DANCING,

	/**
	 * The creature is inspecting his map.
	 */
	INSPECTING,

	/**
	 * The creature is sleeping.
	 */
	SLEEPING,

	/**
	 * The creature is reloading his weapon.
	 */
	RELOADING,

	/**
	 * The creature is interacting with an object.
	 */
	INTERACTING,

	/**
	 * The creature is doing an emote.
	 */
	EMOTE,

	/**
	 * The creature is learning.
	 */
	LEARNING,

	/**
	 * The creature is crafting.
	 */
	CRAFTING;
}
