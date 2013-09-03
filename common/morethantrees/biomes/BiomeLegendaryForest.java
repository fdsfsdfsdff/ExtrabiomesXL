package morethantrees.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeLegendaryForest extends BiomeGenBase 
{
	
	public BiomeLegendaryForest(int i)
	{
		
		super(i);
		this.setBiomeName("Legendary Forest");
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.theBiomeDecorator.treesPerChunk = 25;
		this.fillerBlock = (byte)Block.dirt.blockID;
		this.topBlock = (byte)Block.grass.blockID;
		this.maxHeight = 0.15F;
		this.minHeight = 0.15F;
		
	}
	
}