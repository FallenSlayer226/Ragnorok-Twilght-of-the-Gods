
package net.mcreator.ragnoroktaleofthevikings.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

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
public class ChilledGrassBlock extends RagnorokTaleOfTheVikingsModElements.ModElement {
	@ObjectHolder("ragnorok_tale_of_the_vikings:chilled_grass")
	public static final Block block = null;
	public ChilledGrassBlock(RagnorokTaleOfTheVikingsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(NifilheimItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.EARTH).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.SHOVEL).setRequiresTool());
			setRegistryName("chilled_grass");
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
