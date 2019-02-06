/*
 * Copyright(c) 2018 - Hemajoo Company.
 * ---------------------------------------------------------------------------
 * This file is part of the Hemajoo's Atlas Gaming project which is licensed
 * under the Apache license version 2 and use is subject to license terms.
 * You should have received a copy of the license with the project's artifact
 * binaries and/or sources.
 * 
 * License can be consulted at http://www.apache.org/licenses/LICENSE-2.0
 * ---------------------------------------------------------------------------
 */
package com.hemajoo.gaming.atlas.common.entity;

import lombok.Getter;
import lombok.NonNull;

/**
 * Represents an Hemajoo entity. An entity is a basic low level element that has a
 * name and an identifier.
 * <hr>
 * @author <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public final class Entity
{
	/**
	 * Entity key.
	 */
	@Getter
	private IEntityKey key;

	/**
	 * Creates a new entity.
	 * <hr>
	 * @param type Entity type.
	 * @param name Entity name.
	 */
	public Entity(@NonNull final EntityType type, @NonNull final String name)
	{
		key = new EntityKey(type, name);
	}

	/**
	 * Creates a new entity given a key.
	 * <hr>
	 * @param key Entity key.
	 */
	public Entity(@NonNull final IEntityKey key)
	{
		this.key = key;
	}
}
