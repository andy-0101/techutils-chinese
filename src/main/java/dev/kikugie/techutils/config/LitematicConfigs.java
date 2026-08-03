package dev.kikugie.techutils.config;

import com.google.common.collect.ImmutableList;
import dev.kikugie.techutils.Reference;
import fi.dy.masa.malilib.config.options.*;
import fi.dy.masa.malilib.hotkeys.KeybindSettings;

public class LitematicConfigs extends Configs.BaseConfigs
{
	private static final String LITEMATIC_KEY = Reference.MOD_ID+".config.litematic";

	public static final ConfigHotkey ROTATE_PLACEMENT = new ConfigHotkey(
			"rotatePlacement",
			""
	).apply(LITEMATIC_KEY);
	public static final ConfigHotkey MIRROR_PLACEMENT = new ConfigHotkey(
			"mirrorPlacement",
			""
	).apply(LITEMATIC_KEY);
	public static final ConfigBooleanHotkeyed INVENTORY_SCREEN_OVERLAY = new ConfigBooleanHotkeyed(
			"inventoryScreenOverlay",
			true,
			"I,O",
			KeybindSettings.GUI
	).apply(LITEMATIC_KEY);
	public static final ConfigHotkey REFRESH_MATERIAL_LIST = new ConfigHotkey(
			"refreshMaterialList",
			""
	).apply(LITEMATIC_KEY);
	public static final ConfigBooleanHotkeyed EASY_PLACE_FULL_BLOCKS = new ConfigBooleanHotkeyed(
			"easyPlaceFullBlocks",
			false,
			""
	).apply(LITEMATIC_KEY);
	public static final ConfigBooleanHotkeyed VERIFY_ITEM_COMPONENTS = new ConfigBooleanHotkeyed(
			"verifyItemComponents",
			false,
			"",
			KeybindSettings.GUI
	).apply(LITEMATIC_KEY);
	public static final ConfigBooleanHotkeyed REPLACE_ITEM_PREDICATES_WITH_PLACEHOLDERS = new ConfigBooleanHotkeyed(
			"replaceItemPredicatesWithPlaceholders",
			false,
			""
	).apply(LITEMATIC_KEY);
	public static final ConfigBooleanHotkeyed FORCE_SCHEMATIC_ITEM_OVERLAY = new ConfigBooleanHotkeyed(
			"forceSchematicItemOverlay",
			false,
			"",
			KeybindSettings.GUI
	).apply(LITEMATIC_KEY);

	public LitematicConfigs() {
		super(ImmutableList.of(
			ROTATE_PLACEMENT,
			MIRROR_PLACEMENT,
			INVENTORY_SCREEN_OVERLAY,
			REFRESH_MATERIAL_LIST,
			EASY_PLACE_FULL_BLOCKS,
			VERIFY_ITEM_COMPONENTS,
			REPLACE_ITEM_PREDICATES_WITH_PLACEHOLDERS,
			FORCE_SCHEMATIC_ITEM_OVERLAY
		));
	}
}
