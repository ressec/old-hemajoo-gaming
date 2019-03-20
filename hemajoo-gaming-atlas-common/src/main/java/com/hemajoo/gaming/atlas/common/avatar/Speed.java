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
 * Provides a concrete implementation of a speed object for a creature.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public final class Speed
{
	/**
	 * Default serialization identifier.
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	/**
	 * The current status of the speed for the creature.
	 */
	@Getter
	private MoveStatusType type = MoveStatusType.NONE;

	/**
	 * The maximum movement speed value expressed in base percentage.
	 * <p>
	 * Each creature can move initially at a maximum of 100% of the normal speed for this kind of creature.
	 */
	@Getter
	private int maximum = 100;

	/**
	 * The current movement speed value expressed as a percentage of the maximum value.
	 * <br>
	 * For example, if maximum speed is 100% and the creature is walking, its current speed will be of 50%
	 * (of the maximum speed). If creature is swimming, its current speed will be of 25%. If the creature
	 * is crawling, its current speed will be of 15%, etc.
	 * <p>
	 * Lots of modifiers can be applied to adjust the speed such as for example the weight of equipment the
	 * creature is carrying, etc.
	 */
	@Getter
	private int current = 50;

	/**
	 * Creates a new empty speed object.
	 */
	public Speed()
	{
		// Empty.
	}

	/**
	 * Creates a new speed object with current movement speed equals to the maximum movement speed provided.
	 * <hr>
	 * @param maximum Maximum movement speed. If the number provided is less than zero, then it's set to zero.
	 */
	public Speed(final int maximum)
	{
		if (maximum < 0)
		{
			this.maximum = 0;
		}

		this.maximum = maximum;
		this.current = maximum;

		// In this case the creature is considered as running.
		this.type = MoveStatusType.RUNNING;
	}

	/**
	 * Creates a new speed object with maximum and current speed being different.
	 * <hr>
	 * @param current Current speed expressed in percentage of the maximum speed.
	 * @param maximum Maximum speed expressed in percentage.
	 */
	public Speed(final int current, final int maximum)
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
