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
	protected Key avatarKey;

	/**
	 * Player's key.
	 */
	@Getter
	protected Key playerKey;

	/**
	 * Avatar's faction.
	 */
	@Getter
	protected FactionType faction;

	/**
	 * Avatar's race.
	 */
	@Getter
	protected RaceType race;

	/**
	 * Avatar's gender.
	 */
	@Getter
	protected GenderType gender;

	/**
	 * Avatar's specialization (class).
	 */
	@Getter
	protected SpecializationType specialization;

	/**
	 * Avatar's status.
	 */
	@Getter
	protected HealthStatusType status;

	/**
	 * Avatar's name.
	 */
	@Getter
	protected String name;

	/**
	 * Avatar's age.
	 */
	@Getter
	protected byte age;

	/**
	 * Avatar's level.
	 */
	@Getter
	protected short level;

	/**
	 * Avatar's health.
	 */
	@Getter
	protected Health health;

	/**
	 * Avatar's energy.
	 */
	@Getter
	protected Energy energy;

	/**
	 * Avatar's position.
	 */
	@Getter
	protected Position position;

	/**
	 * Avatar's title.
	 */
	@Getter
	protected TitleType title;

	/**
	 * Avatar's speed.
	 */
	@Getter
	protected short speed;

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
		status = HealthStatusType.UNDEFINED;
		specialization = SpecializationType.UNDEFINED;
		race = RaceType.UNDEFINED;
		faction = race.getFaction();

		health = new Health();
		energy = new Energy();
		position = new Position();

		avatarKey = new Key();
		playerKey = new Key();
	}

	/**
	 * Generates randomly a new avatar.
	 * <hr>
	 * @return Newly created avatar.
	 */
	public abstract IAvatar generate();

	@SuppressWarnings("nls")
	@Override
	public String toString()
	{
		return new StringBuilder()
				.append("name " + this.getName())
				.append(", race: " + this.getRace())
				.append(", class: " + this.getSpecialization())
				.append(", faction: " + this.getFaction())
				.append(", gender: " + this.getGender())
				.append(", age: " + this.getAge())
				.append(", level: " + this.getLevel())
				.append(", status: " + this.getStatus())
				.toString();
	}
}
