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

import com.hemajoo.gaming.atlas.common.key.Key;

import lombok.Getter;

/**
 * Provides an abstract implementation of an {@link IAvatar}.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public abstract class AbstractAvatar implements IAvatar
{
	/**
	 * Avatar's key.
	 */
	@Getter
	private Key avatarKey;

	/**
	 * Player's key.
	 */
	@Getter
	private Key playerKey;

	/**
	 * Avatar's faction.
	 */
	@Getter
	private FactionType faction;

	/**
	 * Avatar's race.
	 */
	@Getter
	private RaceType race;

	/**
	 * Avatar's gender.
	 */
	@Getter
	private GenderType gender;

	/**
	 * Avatar's specialization (class).
	 */
	@Getter
	private SpecializationType specialization;

	/**
	 * Avatar's status.
	 */
	@Getter
	private StatusType status;

	/**
	 * Avatar's name.
	 */
	@Getter
	private String name;

	/**
	 * Avatar's age.
	 */
	@Getter
	private byte age;

	/**
	 * Avatar's level.
	 */
	@Getter
	private short level;

	/**
	 * Avatar's health.
	 */
	@Getter
	private Health health;

	/**
	 * Avatar's energy.
	 */
	@Getter
	private Energy energy;

	/**
	 * Avatar's position.
	 */
	@Getter
	private Position position;

	/**
	 * Avatar's title.
	 */
	@Getter
	private TitleType title;

	/**
	 * Avatar's speed.
	 */
	@Getter
	private short speed;

	/**
	 * Creates a new empty avatar.
	 */
	public AbstractAvatar()
	{
		name = "";
		age = 0;
		level = 0;
		speed = 0;
		title = TitleType.NONE;
		gender = GenderType.UNDEFINED;
		status = StatusType.UNDEFINED;
		specialization = SpecializationType.UNDEFINED;
		race = RaceType.UNDEFINED;
		//faction = FactionType.UNDEFINED;
		faction = race.getFaction();

		health = new Health();
		energy = new Energy();
		position = new Position();

		avatarKey = new Key();
		playerKey = new Key();
	}
}
