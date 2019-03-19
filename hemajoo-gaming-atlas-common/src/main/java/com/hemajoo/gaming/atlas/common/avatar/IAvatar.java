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

/**
 * This interface defines the behavior of an avatar.
 * <hr>
 * @author <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo <a/>
 * @version 1.0.0
 */
public interface IAvatar
{
	/**
	 * Returns the key of this avatar.
	 * <hr>
	 * @return Avatar {@link Key}.
	 */
	Key getAvatarKey();

	/**
	 * Returns the key of the player being the parent of this avatar.
	 * <hr>
	 * @return Player {@link Key}.
	 */
	Key getPlayerKey();

	/**
	 * Returns the avatar name.
	 * <hr>
	 * @return Avatar name.
	 */
	String getName();

	/**
	 * Returns the avatar title.
	 * <hr>
	 * @return Avatar title.
	 */
	TitleType getTitle();

	/**
	 * Returns the avatar faction.
	 * <hr>
	 * @return Avatar {@link FactionType}.
	 */
	FactionType getFaction();

	/**
	 * Returns the avatar race.
	 * <hr>
	 * @return Avatar {@link RaceType}.
	 */
	RaceType getRace();

	/**
	 * Returns the avatar gender.
	 * <hr>
	 * @return Avatar {@link GenderType}.
	 */
	GenderType getGender();

	/**
	 * Returns the avatar specialization type.
	 * <hr>
	 * @return Avatar {@link SpecializationType}.
	 */
	SpecializationType getSpecialization();

	/**
	 * Returns the avatar status.
	 * <hr>
	 * @return Avatar {@link StatusType}.
	 */
	StatusType getStatus();

	/**
	 * Returns the avatar level.
	 * <hr>
	 * @return Avatar level.
	 */
	short getLevel();

	/**
	 * Returns the avatar age.
	 * <hr>
	 * @return Avatar age.
	 */
	byte getAge();

	/**
	 * Returns the avatar health.
	 * <hr>
	 * @return Avatar {@link Health}.
	 */
	Health getHealth();

	/**
	 * Returns the avatar energy.
	 * <hr>
	 * @return Avatar {@link Energy}.
	 */
	Energy getEnergy();

	/**
	 * Returns the avatar position.
	 * <hr>
	 * @return Avatar {@link Position}.
	 */
	Position getPosition();
}
