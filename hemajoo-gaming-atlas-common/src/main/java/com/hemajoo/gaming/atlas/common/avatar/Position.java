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

import lombok.Getter;

/**
 * Provides a concrete implementation of a {@link Position}.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public class Position
{
	/**
	 * Default serialization identifier.
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	/**
	 * X coordinate.
	 */
	@Getter
	private int x = 0;

	/**
	 * Y coordinate.
	 */
	@Getter
	private int y = 0;

	/**
	 * Altitude.
	 */
	@Getter
	private int altitude = 0;

	/**
	 * Creates a new empty position.
	 */
	public Position()
	{
		// Empty.
	}
}
