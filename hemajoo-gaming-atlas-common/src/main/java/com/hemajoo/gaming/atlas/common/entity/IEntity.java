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
 * Behavior of an hemajoo entity which is a low-level object in the Hemajoo's world.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public interface IEntity
{
	/**
	 * Returns the key of this entity.
	 * <br>
	 * @return {@link IEntityKey} representing the key of the entity object.
	 */
	IEntityKey getKey();
}
