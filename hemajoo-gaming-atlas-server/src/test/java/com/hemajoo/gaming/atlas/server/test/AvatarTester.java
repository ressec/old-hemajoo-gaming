/*
 * Copyright(c) 2018 Hemajoo Ltd.
 * ---------------------------------------------------------------------------
 * This file is part of the Hemajoo's Incubation Software (HIS) project which is licensed
 * under the Apache license version 2 and use is subject to license terms.
 * You should have received a copy of the license with the project's artifact
 * binaries and/or sources.
 * 
 * License can be consulted at http://www.apache.org/licenses/LICENSE-2.0
 * ---------------------------------------------------------------------------
 */
package com.hemajoo.gaming.atlas.server.test;

import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;
import com.hemajoo.gaming.atlas.server.avatar.Avatar;

/**
 * Provides a test class for the back-end avatars entities.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public class AvatarTester
{
	/**
	 * Random number generator.
	 */
	private static Random random = new Random();

	/**
	 * Random faker generator.
	 */
	private static Faker faker = new Faker();


	/**
	 * Avatar tester entry point.
	 * <hr>
	 * @param arguments Command line arguments.
	 */
	public static void main(String[] arguments)
	{
		List<Avatar> avatars = Avatar.generate(random, faker, 10);
		avatars.stream().forEach(a -> System.out.println(a.toString()));

	}
}
