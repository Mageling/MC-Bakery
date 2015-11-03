package mageling.bakery.common.cake;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCakeBatter extends Item {

	public ItemCakeBatter(String unlocalizedName) {
		super();
		
		setUnlocalizedName(unlocalizedName);
		setCreativeTab(CreativeTabs.tabFood);
	}
	
}
