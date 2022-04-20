package co.uk.jsbeansoc.beanmod.block.custom;

        import co.uk.jsbeansoc.beanmod.item.ModItems;
        import net.minecraft.block.Block;
        import net.minecraft.block.BlockState;
        import net.minecraft.block.CropsBlock;
        import net.minecraft.state.IntegerProperty;
        import net.minecraft.state.StateContainer;
        import net.minecraft.util.IItemProvider;
        import net.minecraft.util.math.BlockPos;
        import net.minecraft.util.math.shapes.ISelectionContext;
        import net.minecraft.util.math.shapes.VoxelShape;
        import net.minecraft.world.IBlockReader;

public class BeanPlant extends CropsBlock {


    public static final IntegerProperty AGE = IntegerProperty.create("age",0,3);

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D)};

    public BeanPlant(Properties builder) {
        super(builder);
    }


    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }



    @Override
    protected IItemProvider getSeedsItem(){
        return ModItems.RAW_BEAN.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

}
