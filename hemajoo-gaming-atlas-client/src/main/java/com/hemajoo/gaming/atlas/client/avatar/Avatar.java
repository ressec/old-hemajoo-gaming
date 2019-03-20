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
package com.hemajoo.gaming.atlas.client.avatar;

import com.hemajoo.gaming.atlas.common.avatar.AbstractAvatar;
import com.hemajoo.gaming.atlas.common.avatar.IAvatar;
import com.hemajoo.gaming.atlas.common.base.IFrontEnd;

/**
 * Provides a concrete implementation of an avatar on the front-end side.
 * <hr>
 * @author  <a href="mailto:christophe.resse@gmail.com">Resse Christophe - Hemajoo</a>
 * @version 1.0.0
 */
public final class Avatar extends AbstractAvatar implements IFrontEnd
{
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

	@Override
	public IAvatar generate()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
