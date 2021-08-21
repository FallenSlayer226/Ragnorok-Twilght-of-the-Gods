
package net.mcreator.ragnoroktaleofthevikings.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.ragnoroktaleofthevikings.itemgroup.MuspelheimItemGroup;
import net.mcreator.ragnoroktaleofthevikings.RagnorokTaleOfTheVikingsModElements;

@RagnorokTaleOfTheVikingsModElements.ModElement.Tag
public class ContainementUnitItem extends RagnorokTaleOfTheVikingsModElements.ModElement {
	@ObjectHolder("ragnorok_tale_of_the_vikings:containement_unit")
	public static final Item block = null;
	public ContainementUnitItem(RagnorokTaleOfTheVikingsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MuspelheimItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("containement_unit");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
