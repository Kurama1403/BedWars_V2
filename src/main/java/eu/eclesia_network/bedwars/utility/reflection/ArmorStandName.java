package eu.eclesia_network.bedwars.utility.reflection;

import eu.eclesia_network.bedwars.BedWars;
import org.bukkit.entity.ArmorStand;

public class ArmorStandName {

    public static String getName(ArmorStand stand) {
        if (BedWars.SERVER_VERSION > 8) return stand.getCustomName();

        String name = null;
        try {
            name = (String) ArmorStand.class.getMethod("getCustomName").invoke(stand);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

}
