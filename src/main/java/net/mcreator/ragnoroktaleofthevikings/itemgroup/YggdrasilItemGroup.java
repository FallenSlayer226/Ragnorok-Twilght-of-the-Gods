
package net.mcreator.ragnoroktaleofthevikings.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.ragnoroktaleofthevikings.RagnorokTaleOfTheVikingsModElements;

@RagnorokTaleOfTheVikingsModElements.ModElement.Tag
public class YggdrasilItemGroup extends RagnorokTaleOfTheVikingsModElements.ModElement {
	public YggdrasilItemGroup(RagnorokTaleOfTheVikingsModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabyggdrasil") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.BOOKSHELF, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
