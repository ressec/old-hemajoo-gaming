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
 * Represents the key of an entity.
 * <hr>
 * @author <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public final class EntityKey implements IEntityKey
{
	/**
	 * Entity type.
	 */
	@Getter
	private EntityType type;

	/**
	 * Entity natural name.
	 */
	@Getter
	private String name;

	/**
	 * Entity identity string which is also used as an identifier.
	 * <br>
	 * It is a computed value.
	 */
	private String identity;

	/**
	 * Entity identifier.
	 */
	@Getter
	private Identifier identifier;

	/**
	 * Creates a new entity key.
	 * <hr>
	 * @param type Entity type.
	 * @param name Entity name.
	 * @param identifier Entity unique identifier.
	 */
	public EntityKey(@NonNull final EntityType type, @NonNull String name, @NonNull Identifier identifier)
	{
		this.type = type;
		this.name = name;
		this.identifier = identifier;
	}

	/**
	 * Creates a new entity key.
	 * <hr>
	 * @param type Entity type.
	 * @param name Entity name.
	 */
	public EntityKey(@NonNull final EntityType type, @NonNull String name)
	{
		this.type = type;
		this.name = name;

		//TODO The identifier is to be acquired/computed here using a global registry/manager.
	}

	/**
	 * Returns the string identity for this entity.
	 * <hr>
	 * @return String identity of this entity.
	 */
	@Override
	public String getIdentity()
	{
		//TODO Complete implementation here.
		return identity;
	}
}
