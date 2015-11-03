package mageling.bakery.common.proxy;

import mageling.bakery.common.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {
    	ModItems.createItems();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
