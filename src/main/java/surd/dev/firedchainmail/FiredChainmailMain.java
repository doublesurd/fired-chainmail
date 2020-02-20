package surd.dev.firedchainmail;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FiredChainmailMain implements ModInitializer {
    public static final Item CHAINMAIL_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item UNFIRED_CHAINMAIL_HELMET_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item UNFIRED_CHAINMAIL_CHESTPLATE_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item UNFIRED_CHAINMAIL_LEGGINGS_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item UNFIRED_CHAINMAIL_BOOTS_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
	@Override
	public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("firedchainmail", "chainmail"), CHAINMAIL_ITEM);	
        Registry.register(Registry.ITEM, new Identifier("firedchainmail", "chainmail_helmet_unfired"), UNFIRED_CHAINMAIL_HELMET_ITEM);	
        Registry.register(Registry.ITEM, new Identifier("firedchainmail", "chainmail_chestplate_unfired"), UNFIRED_CHAINMAIL_CHESTPLATE_ITEM);	
        Registry.register(Registry.ITEM, new Identifier("firedchainmail", "chainmail_leggings_unfired"), UNFIRED_CHAINMAIL_LEGGINGS_ITEM);	
        Registry.register(Registry.ITEM, new Identifier("firedchainmail", "chainmail_boots_unfired"), UNFIRED_CHAINMAIL_BOOTS_ITEM);	
	}
}
