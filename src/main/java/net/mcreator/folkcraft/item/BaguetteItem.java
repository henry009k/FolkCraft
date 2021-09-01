
package net.mcreator.folkcraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.folkcraft.FolkcraftModElements;

@FolkcraftModElements.ModElement.Tag
public class BaguetteItem extends FolkcraftModElements.ModElement {
	@ObjectHolder("folkcraft:baguette")
	public static final Item block = null;
	public BaguetteItem(FolkcraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(15).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("baguette");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 126;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
