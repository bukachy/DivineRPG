package naturix.divinerpg.bases.items.armor;

import naturix.divinerpg.DivineRPG;
import naturix.divinerpg.bases.items.ArmorBase;
import net.minecraft.inventory.EntityEquipmentSlot;

public class Corrupted extends ArmorBase {

	
	private String textureName;
	public Corrupted(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, slot, name);
		this.setCreativeTab(DivineRPG.ArmorTab);
	}

}