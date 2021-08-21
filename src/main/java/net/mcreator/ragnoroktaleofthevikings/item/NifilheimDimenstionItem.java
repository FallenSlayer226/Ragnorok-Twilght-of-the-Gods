
package net.mcreator.ragnoroktaleofthevikings.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

import net.mcreator.ragnoroktaleofthevikings.world.dimension.NifilheimDimenstionDimension;
import net.mcreator.ragnoroktaleofthevikings.itemgroup.NifilheimItemGroup;

public class NifilheimDimenstionItem extends Item {
	@ObjectHolder("ragnorok_tale_of_the_vikings:nifilheim_dimenstion")
	public static final Item block = null;
	public NifilheimDimenstionItem() {
		super(new Item.Properties().group(NifilheimItemGroup.tab).maxDamage(64));
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		PlayerEntity entity = context.getPlayer();
		BlockPos pos = context.getPos().offset(context.getFace());
		ItemStack itemstack = context.getItem();
		World world = context.getWorld();
		if (!entity.canPlayerEdit(pos, context.getFace(), itemstack)) {
			return ActionResultType.FAIL;
		} else {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			if (world.isAirBlock(pos) && true)
				NifilheimDimenstionDimension.portal.portalSpawn(world, pos);
			itemstack.damageItem(1, entity, c -> c.sendBreakAnimation(context.getHand()));
			return ActionResultType.SUCCESS;
		}
	}
}
