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
package com.hemajoo.gaming.atlas.server.avatar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;
import com.hemajoo.gaming.atlas.common.avatar.AbstractAvatar;
import com.hemajoo.gaming.atlas.common.avatar.GenderType;
import com.hemajoo.gaming.atlas.common.avatar.IAvatar;
import com.hemajoo.gaming.atlas.common.avatar.RaceType;
import com.hemajoo.gaming.atlas.common.avatar.SpecializationType;
import com.hemajoo.gaming.atlas.common.avatar.HealthStatusType;
import com.hemajoo.gaming.atlas.common.avatar.TitleType;
import com.hemajoo.gaming.atlas.common.base.IBackEnd;

/**
 * Provides a concrete implementation of an avatar on the back-end side.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public final class Avatar extends AbstractAvatar implements IBackEnd
{
	/**
	 * Random number generator.
	 */
	private static Random random;

	/**
	 * Random faker generator.
	 */
	private static Faker faker;

	/**
	 * Default serialization identifier.
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a new empty avatar.
	 */
	public Avatar()
	{
		super();
	}

	/**
	 * Creates randomly an avatar.
	 * <hr>
	 * @param random Random number generator.
	 * @param faker Java data faker generator.
	 * @return Newly created avatar.
	 */
	@SuppressWarnings("hiding")
	public static Avatar generate(final Random random, final Faker faker)
	{
		Avatar.random = random;
		Avatar.faker = faker;

		Avatar avatar = new Avatar();
		return (Avatar) avatar.generate();
	}

	/**
	 * Creates randomly multiple avatars.
	 * <hr>
	 * @param random Random number generator.
	 * @param faker Java data faker generator.
	 * @param count Number of avatars to generate randomly.
	 * @return Newly created avatars.
	 */
	@SuppressWarnings("hiding")
	public static List<Avatar> generate(final Random random, final Faker faker, final int count)
	{
		Avatar.random = random;
		Avatar.faker = faker;

		List<Avatar> avatars = new ArrayList<>(count);

		for (int i = 0; i < count; i++)
		{
			Avatar avatar = new Avatar();
			avatars.add((Avatar) avatar.generate());
		}

		return avatars;
	}

	@Override
	public IAvatar generate()
	{
		int range = 0;
		int value = 0;

		// Randomly select a race (and a faction).
		range = RaceType.values().length - 1;
		value = random.nextInt(range);
		this.race = RaceType.values()[value];
		this.faction = race.getFaction();

		// Randomly select a specialization.
		range = SpecializationType.values().length - 1;
		value = random.nextInt(range);
		this.specialization = SpecializationType.values()[value];

		// Randomly select a gender.
		range = GenderType.values().length - 1;
		value = random.nextInt(range);
		this.gender = GenderType.values()[value];

		// Randomly select a status.
		this.status = health.getCurrent() > 0 ? HealthStatusType.ALIVE : HealthStatusType.DEAD;

		// Randomly select a level.
		this.level = (short) (random.nextInt(99) + 1);

		// Randomly select an age.
		this.age = (byte) (random.nextInt(99) + 1);

		// Randomly select a name.
		this.name = faker.name().firstName();

		// Randomly select a title.
		range = TitleType.values().length - 1;
		value = random.nextInt(range);
		this.title = TitleType.values()[value];

		return this;
	}
}
