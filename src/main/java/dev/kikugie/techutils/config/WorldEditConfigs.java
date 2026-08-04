package dev.kikugie.techutils.config;

import com.google.common.collect.ImmutableList;
import dev.kikugie.techutils.Reference;
import fi.dy.masa.malilib.config.options.ConfigBoolean;
import fi.dy.masa.malilib.config.options.ConfigBooleanHotkeyed;
import fi.dy.masa.malilib.config.options.ConfigInteger;

public class WorldEditConfigs extends Configs.BaseConfigs
{
	private static final String WORLDEDIT_KEY = Reference.MOD_ID+".config.worldedit";

	public static final ConfigBooleanHotkeyed WE_SYNC = new ConfigBooleanHotkeyed("autoWeSync", true, "").apply(WORLDEDIT_KEY);
	public static final ConfigInteger WE_SYNC_TICKS = new ConfigInteger("autoWeSyncTicks", 10, 1, 1000, false).apply(WORLDEDIT_KEY);
	public static final ConfigBoolean WE_SYNC_FEEDBACK = new ConfigBoolean("autoWeSyncFeedback", true).apply(WORLDEDIT_KEY);
	public static final ConfigBoolean DISABLE_UPDATES = new ConfigBoolean("autoDisableUpdates", true).apply(WORLDEDIT_KEY);

	public WorldEditConfigs() {
		super(ImmutableList.of(
			WE_SYNC,
			WE_SYNC_TICKS,
			WE_SYNC_FEEDBACK,
			DISABLE_UPDATES
		));
	}
}
