package fr.samlegamer.spartanbewitchment.item;
/*
import java.util.HashSet;
import java.util.Set;
import com.bewitchment.api.BewitchmentAPI;
import com.bewitchment.api.misc.Weakness;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.api.weaponproperty.WeaponPropertyWithCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
*/
public class ColdIronWeaponProperty{}/* extends WeaponPropertyWithCallback
{
	public static final Set<Item> COLD_IRON_TOOLS = new HashSet<>(), COLD_IRON_ARMOR = new HashSet<>();

    public ColdIronWeaponProperty(String propType, String propModId)
    {
        super(propType, propModId);
    }
    
	public static float getDamage(float initialDamage, Weakness weakness, EntityLivingBase target, EntityLivingBase attacker, Set<Item> tools) {
		float amount = weakness.get(target);

		if (amount > 1.0F && tools.contains(attacker.getHeldItemMainhand().getItem()))
			return initialDamage * amount;

		amount = weakness.get(attacker);

		if (amount > 1.0F) {
			int a = 0;

			//for (ItemStack stack : target.getArmorInventoryList());

			if (a > 0) {
				attacker.attackEntityFrom(DamageSource.causeThornsDamage(target), a);
				return initialDamage * (1 - (0.06F * a));
			}
		}

		return initialDamage;
	}

	
	public void onHitEntity(ToolMaterialEx material, ItemStack stack, LivingHurtEvent event)
	{
		EntityLivingBase target = event.getEntityLiving();
		Entity entity = event.getSource().getImmediateSource();

		if (!target.world.isRemote) {
			if (entity instanceof EntityLivingBase) {
				EntityLivingBase attacker = (EntityLivingBase) entity;

				float damage = getDamage(event.getAmount(), BewitchmentAPI.COLD_IRON_WEAKNESS, target, attacker, COLD_IRON_TOOLS);
				event.setAmount(damage);

			}
		}

	}
}*/