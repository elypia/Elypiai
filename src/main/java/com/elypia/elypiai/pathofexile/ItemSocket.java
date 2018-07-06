package com.elypia.elypiai.pathofexile;

import com.elypia.elypiai.pathofexile.data.*;
import com.google.gson.annotations.SerializedName;

public class ItemSocket {

	@SerializedName("group")
	private int group;

	@SerializedName("attr")
	private GemAttribute attribute;

	@SerializedName("sColour")
	private GemColor color;

	public int getGroup() {
		return group;
	}

	public GemAttribute getAttribute() {
		return attribute;
	}

	public GemColor getColor() {
		return color;
	}
}
