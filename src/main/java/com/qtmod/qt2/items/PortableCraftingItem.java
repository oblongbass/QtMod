package com.qtmod.qt2.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class PortableCraftingItem extends Item {
    private static final Text TITLE = Text.translatable("container.crafting");

    public PortableCraftingItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            user.openHandledScreen(new SimpleNamedScreenHandlerFactory(
                (syncId, inventory, player) -> new CraftingScreenHandler(syncId, inventory),
                TITLE
            ));
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}