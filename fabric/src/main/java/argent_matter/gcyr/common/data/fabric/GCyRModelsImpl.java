package argent_matter.gcyr.common.data.fabric;

import argent_matter.gcyr.GCyR;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;

public class GCyRModelsImpl {
    public static void rocketMotorModel(DataGenContext<Block, RotatedPillarBlock> ctx, RegistrateBlockstateProvider prov) {
        prov.simpleBlock(ctx.getEntry(), prov.models().cubeBottomTop("rocket_motor",
                GCyR.id("block/casings/rocket/rocket_motor_side"), GCyR.id("block/casings/rocket/rocket_motor_bottom"), GCyR.id("block/casings/rocket/rocket_motor_top")
        ));
    }

    public static void airlockDoorModel(DataGenContext<Block, DoorBlock> ctx, RegistrateBlockstateProvider prov) {
        prov.doorBlock(ctx.getEntry(), GCyR.id("block/airlock_door_bottom"), GCyR.id("block/airlock_door_top"));
    }

    public static void axisModel(DataGenContext<Block, RotatedPillarBlock> ctx, RegistrateBlockstateProvider prov) {
        prov.axisBlock(ctx.getEntry());
    }

    public static void seatModel(DataGenContext<Block, CarpetBlock> ctx, RegistrateBlockstateProvider prov) {
        prov.simpleBlock(ctx.getEntry(), prov.models().carpet("seat", new ResourceLocation("block/light_gray_wool")));
    }
}