package extrabiomes.items;

import extrabiomes.blocks.BlockNewSapling;
import net.minecraft.item.ItemStack;
import extrabiomes.utility.MultiItemBlock;

public class ItemNewSapling extends MultiItemBlock {

	public ItemNewSapling(int id) {
        super(id);
    }

    private static int unmarkedMetadata(int metadata) {
        return metadata & METADATA_BITMASK;
    }

    private static final int METADATA_BITMASK = 0x7;

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        int metadata = unmarkedMetadata(itemstack.getItemDamage());
        itemstack = itemstack.copy();
        itemstack.setItemDamage(metadata);
        return super.getUnlocalizedName() + "." + BlockNewSapling.BlockType.values()[metadata].toString().toLowerCase();
    }

}
