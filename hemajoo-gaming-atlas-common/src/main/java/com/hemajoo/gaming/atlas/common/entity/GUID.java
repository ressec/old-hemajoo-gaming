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
 * Represents an Hemajoo entity GUID or Global Unique Identifier.
 * <hr>
 * @author <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public final class GUID
{
	/**
	 * Server identifier this entity belongs to.
	 */
	private short server;

	/**
	 * Instance identifier this entity belongs to.
	 */
	private short instance;

	/**
	 * Zone identifier this entity belongs to.
	 */
	private short zone;

	/**
	 * Entity type.
	 */
	private EntityType type;

	/**
	 * Entity identifier.
	 */
	private short identifier;

	/**
	 * Spawn identifier.
	 */
	private short spawn;

	/**
	 * Creates a new empty entity GUID.
	 * <hr>
	 */
	public GUID()
	{
	}

	/**
	 * Returns the server identifier of this entity GUID.
	 * <hr>
	 * @return Server identifier.
	 */
	public final short getServerId()
	{
		return server;
	}

	/**
	 * Returns the instance identifier of this entity GUID.
	 * <hr>
	 * @return Instance identifier.
	 */
	public final short getInstanceId()
	{
		return instance;
	}

	/**
	 * Returns the zone identifier of this entity GUID.
	 * <hr>
	 * @return Zone identifier.
	 */
	public final short getZoneId()
	{
		return zone;
	}

	/**
	 * Returns the entity type identifier of this entity GUID.
	 * <hr>
	 * @return Entity type identifier.
	 */
	public final short getTypeId()
	{
		return (short) type.ordinal();
	}

	/**
	 * Returns the identifier of this entity GUID.
	 * <hr>
	 * @return Identifier.
	 */
	public final short getId()
	{
		return identifier;
	}

	/**
	 * Returns the spawn identifier of this entity GUID.
	 * <hr>
	 * @return Spawn identifier.
	 */
	public final short getSpawnId()
	{
		return spawn;
	}

	/**
	 * Returns the entity type of this entity GUID.
	 * <hr>
	 * @return Entity type.
	 */
	public final EntityType getType()
	{
		return type;
	}

	/**
	 * Returns a text representation of this entity GUID.
	 * <hr>
	 * @return Text representation of the GUID.
	 */
	@SuppressWarnings({ "nls", "boxing" })
	@Override
	public final String toString()
	{
		return String.format("%1$d4-%2$d3-%3$d4-%4$d4-%5$d4-%6$d4-%7$d4", server, type.ordinal(), instance, zone, identifier, spawn);
	}
}
