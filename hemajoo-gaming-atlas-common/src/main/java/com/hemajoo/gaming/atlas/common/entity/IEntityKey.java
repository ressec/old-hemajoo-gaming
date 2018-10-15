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

/**
 * Behavior of an entity key which identifies uniquely an entity.
 * <br>
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public interface IEntityKey
{
	/**
	 * Returns the type of this entity.
	 * <br>
	 * @return The type of this entity.
	 */
	EntityType getType();

	/**
	 * Returns the name of this entity.
	 * <br>
	 * @return The name of this entity.
	 */
	String getName();

	/**
	 * Returns the server identifier this entity belongs to.
	 * <br>
	 * @return The server identifier this entity belongs to.
	 */
	short getServerId();

	/**
	 * Returns the instance identifier this entity belongs to.
	 * <br>
	 * @return The instance identifier this entity belongs to.
	 */
	short getInstanceId();

	/**
	 * Returns the zone identifier this entity belongs to.
	 * <br>
	 * @return The zone identifier this entity belongs to.
	 */
	short getZoneId();

	/**
	 * Returns the entity identifier.
	 * <br>
	 * @return The entity identifier.
	 */
	short getId();

	/**
	 * Returns the spawn identifier.
	 * <br>
	 * @return The spawn identifier.
	 */
	short getSpawnId();

	/**
	 * Returns the entity key as a string.
	 * <br>
	 * @return The entity key as a string.
	 */
	String getAsString();
}
