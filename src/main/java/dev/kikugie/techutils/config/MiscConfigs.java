package dev.kikugie.techutils.config;

import com.google.common.collect.ImmutableList;
import dev.kikugie.techutils.Reference;
import fi.dy.masa.malilib.config.options.ConfigBoolean;
import fi.dy.masa.malilib.config.options.ConfigBooleanHotkeyed;
import fi.dy.masa.malilib.config.options.ConfigHotkey;
import fi.dy.masa.malilib.config.options.ConfigInteger;

public class MiscConfigs extends Configs.BaseConfigs
{
	private static final String MISC_KEY = Reference.MOD_ID+".config.misc";

	public static final ConfigHotkey OPEN_CONFIG = new ConfigHotkey("openConfig", "U,C").apply(MISC_KEY);
	public static final ConfigBooleanHotkeyed COMPACT_SCOREBOARD = new ConfigBooleanHotkeyed("compactScoreboard", false, "F6").apply(MISC_KEY);
	public static final ConfigHotkey GIVE_FULL_INV = new ConfigHotkey("giveFullInv", "G").apply(MISC_KEY);
	public static final ConfigInteger BUNDLE_FILL = new ConfigInteger("bundleFill", 1, 1, 100, true).apply(MISC_KEY);
	public static final ConfigBoolean FILL_SAFETY = new ConfigBoolean("fillSafety", true).apply(MISC_KEY);
	public static final ConfigInteger FILL_COOLDOWN = new ConfigInteger("fillCooldown", 1000).apply(MISC_KEY);
	public static final ConfigHotkey SCAN_INVENTORY = new ConfigHotkey("scanInventory", "I").apply(MISC_KEY);
	public static final ConfigInteger REQUEST_TIMEOUT = new ConfigInteger("requestTimeout", 60, 1, 1000, false).apply(MISC_KEY);

	public MiscConfigs() {
		super(ImmutableList.of(
			OPEN_CONFIG,
			COMPACT_SCOREBOARD,
			GIVE_FULL_INV,
			BUNDLE_FILL,
			FILL_SAFETY,
			FILL_COOLDOWN
		));
	}
}
