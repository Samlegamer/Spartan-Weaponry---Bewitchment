package fr.samlegamer.spartanbewitchment.item;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.util.ConfigHandler;
import fr.samlegamer.spartanbewitchment.SpartanBewitchment;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import com.bewitchment.Bewitchment;
import com.bewitchment.registry.ModObjects;

@Mod.EventBusSubscriber
public class SBItemsRegistry
{
	private static final ToolMaterialEx material = new ToolMaterialEx("cold_iron", "ingotColdIron", SpartanBewitchment.MODID, 3897727, 8562085, ModObjects.TOOL_COLD_IRON.getHarvestLevel(), 
			ModObjects.TOOL_COLD_IRON.getMaxUses(), ModObjects.TOOL_COLD_IRON.getEfficiency(), ModObjects.TOOL_COLD_IRON.getAttackDamage(), ModObjects.TOOL_COLD_IRON.getEnchantability()/*, 
			new ColdIronWeaponProperty("cold_iron", SpartanBewitchment.MODID)*/);
    private static final Set<Item> ALL_ITEMS = new HashSet<>();

    private static void createWeaponry(boolean config1, boolean config2, Set<Item> item_set, Item spartan, String reg)
    {
    	if (!config1 && !config2)
		{
    		Item item = spartan;
			SpartanWeaponryAPI.addItemModelToRegistry(item, SpartanBewitchment.MODID, reg+"_cold_iron");
			item_set.add(item);
		}
    }

   @SubscribeEvent
   public static void registerItems(RegistryEvent.Register<Item> ev)
   {
       OreDictionary.registerOre("ingotColdIron", ModObjects.cold_iron_ingot);

       Set<Item> item_set = new LinkedHashSet<>();

       createWeaponry(ConfigHandler.disableDagger, false, item_set, SpartanWeaponryAPI.createDagger(material, SpartanBewitchment.MODID, Bewitchment.tab), "dagger");
       createWeaponry(ConfigHandler.disableMace, false, item_set, SpartanWeaponryAPI.createMace(material, SpartanBewitchment.MODID, Bewitchment.tab), "mace");
       createWeaponry(ConfigHandler.disableParryingDagger, false, item_set, SpartanWeaponryAPI.createParryingDagger(material, SpartanBewitchment.MODID, Bewitchment.tab), "parrying_dagger");
       createWeaponry(ConfigHandler.disableBoomerang, false, item_set, SpartanWeaponryAPI.createBoomerang(material, SpartanBewitchment.MODID, Bewitchment.tab), "boomerang");
       createWeaponry(ConfigHandler.disableBattleaxe, false, item_set, SpartanWeaponryAPI.createBattleaxe(material, SpartanBewitchment.MODID, Bewitchment.tab), "battleaxe");
       createWeaponry(ConfigHandler.disableLongsword, false, item_set, SpartanWeaponryAPI.createLongsword(material, SpartanBewitchment.MODID, Bewitchment.tab), "longsword");
       createWeaponry(ConfigHandler.disableKatana, false, item_set, SpartanWeaponryAPI.createKatana(material, SpartanBewitchment.MODID, Bewitchment.tab), "katana");
       createWeaponry(ConfigHandler.disableSaber, false, item_set, SpartanWeaponryAPI.createSaber(material, SpartanBewitchment.MODID, Bewitchment.tab), "saber");
       createWeaponry(ConfigHandler.disableRapier, false, item_set, SpartanWeaponryAPI.createRapier(material, SpartanBewitchment.MODID, Bewitchment.tab), "rapier");
       createWeaponry(ConfigHandler.disableGreatsword, false, item_set, SpartanWeaponryAPI.createGreatsword(material, SpartanBewitchment.MODID, Bewitchment.tab), "greatsword");
       createWeaponry(ConfigHandler.disableHammer, false, item_set, SpartanWeaponryAPI.createHammer(material, SpartanBewitchment.MODID, Bewitchment.tab), "hammer");
       createWeaponry(ConfigHandler.disableWarhammer, false, item_set, SpartanWeaponryAPI.createWarhammer(material, SpartanBewitchment.MODID, Bewitchment.tab), "warhammer");
       createWeaponry(ConfigHandler.disableSpear, false, item_set, SpartanWeaponryAPI.createSpear(material, SpartanBewitchment.MODID, Bewitchment.tab), "spear");
       createWeaponry(ConfigHandler.disableHalberd, false, item_set, SpartanWeaponryAPI.createHalberd(material, SpartanBewitchment.MODID, Bewitchment.tab), "halberd");
       createWeaponry(ConfigHandler.disablePike, false, item_set, SpartanWeaponryAPI.createPike(material, SpartanBewitchment.MODID, Bewitchment.tab), "pike");
       createWeaponry(ConfigHandler.disableLance, false, item_set, SpartanWeaponryAPI.createLance(material, SpartanBewitchment.MODID, Bewitchment.tab), "lance");
       createWeaponry(ConfigHandler.disableLongbow, ConfigHandler.woodenLongbowOnly, item_set, SpartanWeaponryAPI.createLongbow(material, SpartanBewitchment.MODID, Bewitchment.tab, null), "longbow");
       createWeaponry(ConfigHandler.disableCrossbow, ConfigHandler.woodenCrossbowOnly, item_set, SpartanWeaponryAPI.createCrossbow(material, SpartanBewitchment.MODID, Bewitchment.tab, null), "crossbow");
       createWeaponry(ConfigHandler.disableThrowingKnife, false, item_set, SpartanWeaponryAPI.createThrowingKnife(material, SpartanBewitchment.MODID, Bewitchment.tab), "throwing_knife");
       createWeaponry(ConfigHandler.disableThrowingAxe, false, item_set, SpartanWeaponryAPI.createThrowingAxe(material, SpartanBewitchment.MODID, Bewitchment.tab), "throwing_axe");
       createWeaponry(ConfigHandler.disableJavelin, false, item_set, SpartanWeaponryAPI.createJavelin(material, SpartanBewitchment.MODID, Bewitchment.tab), "javelin");
       createWeaponry(ConfigHandler.disableGlaive, false, item_set, SpartanWeaponryAPI.createGlaive(material, SpartanBewitchment.MODID, Bewitchment.tab), "glaive");
       createWeaponry(ConfigHandler.disableQuarterstaff, false, item_set, SpartanWeaponryAPI.createQuarterstaff(material, SpartanBewitchment.MODID, Bewitchment.tab), "quarterstaff");

       for (Item it : item_set)
       {
           ev.getRegistry().register(it);
       }
       ALL_ITEMS.forEach(ev.getRegistry()::register);
   }

   @SideOnly(Side.CLIENT)
   @SubscribeEvent
   public static void registerModels(ModelRegistryEvent event) {
       ALL_ITEMS.stream()
               .filter(item -> item.getRegistryName() != null)
               .forEach(item ->
                       ModelLoader.setCustomModelResourceLocation(item, 0,
                               new ModelResourceLocation(item.getRegistryName(), "inventory")));
   }
}