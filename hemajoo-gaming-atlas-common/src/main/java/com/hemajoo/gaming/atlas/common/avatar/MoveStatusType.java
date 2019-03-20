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
 * Enumerates the several possible move status types for a creature.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public enum MoveStatusType
{
	/**
	 * The creature is not moving.
	 */
	NONE,

	/**
	 * The creature is walking.
	 */
	WALKING,

	/**
	 * The creature is running.
	 */
	RUNNING,

	/**
	 * The creature is swimming.
	 */
	SWIMMING,

	/**
	 * The creature is flying.
	 */
	FLYING,

	/**
	 * The creature is crawling.
	 */
	CRAWLING,
}
