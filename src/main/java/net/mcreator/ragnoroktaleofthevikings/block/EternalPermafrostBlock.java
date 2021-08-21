
package net.mcreator.ragnoroktaleofthevikings.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ragnoroktaleofthevikings.itemgroup.NifilheimItemGroup;
import net.mcreator.ragnoroktaleofthevikings.RagnorokTaleOfTheVikingsModElements;

import java.util.List;
import java.util.Collections;

@RagnorokTaleOfTheVikingsModElements.ModElement.Tag
public class EternalPermafrostBlock extends RagnorokTaleOfTheVikingsModElements.ModElement {
	@ObjectHolder("ragnorok_tale_of_the_vikings:eternal_permafrost")
	public static final Block block = null;
	public EternalPermafrostBlock(RagnorokTaleOfTheVikingsModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(NifilheimItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ICE).sound(SoundType.GROUND).hardnessAndResistance(-1, 3600000).setLightLevel(s -> 0));
			setRegistryName("eternal_permafrost");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
