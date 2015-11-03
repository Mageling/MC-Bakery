package mageling.bakery.common;

import mageling.bakery.common.cake.ItemCakeBatter;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static final String CAKE_BATTER_NAME = "cake_batter";
	
	public static void createItems() {
		GameRegistry.registerItem(new ItemCakeBatter(CAKE_BATTER_NAME), CAKE_BATTER_NAME);
	}
}
