package divinerpg.client.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import divinerpg.DivineRPG;
import divinerpg.client.menu.FrostedChestMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.*;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class FrostedChestScreen extends AbstractContainerScreen<FrostedChestMenu> implements MenuAccess<FrostedChestMenu> {
    private static final ResourceLocation LOCATION = ResourceLocation.fromNamespaceAndPath(DivineRPG.MODID, "textures/gui/frosted_chest_gui.png");

    public FrostedChestScreen(FrostedChestMenu container, Inventory playerInventory, Component title) {
        super(container, playerInventory, title);
        this.inventoryLabelY -= -2;
    }

    public void render(GuiGraphics matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(matrixStack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, LOCATION);

        int i = leftPos, j = topPos;
        matrixStack.blit(LOCATION, i, j, 0, 0, imageWidth, imageHeight + 1);
    }

    @Override
    protected void renderLabels(GuiGraphics matrixStack, int mouseX, int mouseY) {
        matrixStack.drawString(this.font, this.title, this.titleLabelX, this.titleLabelY, 2118747, false);
        matrixStack.drawString(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY, 2118747, false);
    }

}