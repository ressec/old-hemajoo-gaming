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
 * To be reviewed...
 * <hr>
 * @author <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public final class EntityKey implements IEntityKey
{
	/**
	 * Server identifier this entity belongs to.
	 */
	@Getter
	private short serverId;

	/**
	 * Instance identifier this entity belongs to.
	 */
	@Getter
	private short instanceId;

	/**
	 * Zone identifier this entity belongs to.
	 */
	@Getter
	private short zoneId;

	/**
	 * Entity type.
	 */
	@Getter
	private EntityType type;

	/**
	 * Entity identifier (category).
	 */
	@Getter
	private short id;

	/**
	 * Spawn identifier.
	 */
	@Getter
	private short spawnId;

	/**
	 * Entity natural name.
	 */
	@Getter
	private String name;

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
	}

	@Override
	public String getAsString()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
