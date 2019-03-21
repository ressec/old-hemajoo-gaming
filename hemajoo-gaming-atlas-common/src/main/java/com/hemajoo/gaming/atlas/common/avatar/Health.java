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
 * Provides a concrete implementation of a {@link Health}.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public final class Health
{
	/**
	 * Default serialization identifier.
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	/**
	 * The maximum health points.
	 */
	@Getter
	private int maximum = 100;

	/**
	 * The current health points.
	 */
	@Getter
	private int current = 100;

	/**
	 * Creates a new empty health.
	 */
	public Health()
	{
		// Empty.
	}

	/**
	 * Creates a new health object with current points equals to the maximum points provided.
	 * <hr>
	 * @param maximum Maximum health points. If the number provided is less than zero, then it's set to zero.
	 */
	public Health(final int maximum)
	{
		if (maximum < 0)
		{
			this.maximum = 0;
		}

		this.maximum = maximum;
		this.current = maximum;
	}

	/**
	 * Creates a new health object with maximum and current health points being different.
	 * <hr>
	 * @param current Current number of health points.
	 * @param maximum Maximum number of health points.
	 */
	public Health(final int current, final int maximum)
	{
		if (current < 0)
		{
			this.current = 0;
		}

		if (maximum < 0)
		{
			this.maximum = 0;
		}

		this.current = current;
		this.maximum = maximum;
	}

	/**
	 * Increases the current number of health points by the given value.
	 * <br>
	 * The value provided cannot be less than zero and the current number of health points cannot
	 * be greater than the maximum number of health points.
	 * <hr>
	 * @param value Increases the current number of health points by the given value.
	 * @return Current number of health points.
	 */
	public int increase(final int value)
	{
		if (value > 0 && (current + value <= maximum))
		{
			current += value;
		}

		return current;
	}

	/**
	 * Decreases the current number of health points by the given value.
	 * <br>
	 * The value provided cannot be less than zero and the current number of health points cannot
	 * be less than zero.
	 * <hr>
	 * @param value Decreases the current number of health points by the given value.
	 * @return Current number of health points.
	 */
	public int decrease(final int value)
	{
		if (value > 0)
		{
			if (current - value >= 0)
			{
				current -= value;
			}
			else
			{
				current = 0;
			}
		}

		return current;
	}

	/**
	 * Sets the current number of health points to zero.
	 * <hr>
	 * @return Return the current number of health points.
	 */
	public int zero()
	{
		this.current = 0;

		return current;
	}

	/**
	 * Sets the current number of health points to its maximum.
	 * <hr>
	 * @return Return the current number of health points.
	 */
	public int full()
	{
		this.current = this.maximum;

		return current;
	}
}
