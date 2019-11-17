package divinerpg.objects.entities.assets.model.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelWreckForm2 extends ModelBase
{
    //fields
    ModelRenderer part1;
    ModelRenderer part2;
    ModelRenderer leftarm1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg1;
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer leftarm2;
    ModelRenderer part3;
    ModelRenderer part4;
    ModelRenderer part5;
    ModelRenderer rightleg2;
    ModelRenderer rightleg3;
    ModelRenderer leftleg2;
    ModelRenderer rightleg4;
    ModelRenderer leftleg3;
    ModelRenderer rightleg5;
    ModelRenderer leftleg4;
    ModelRenderer leftleg5;
    ModelRenderer rightleg6;
    ModelRenderer leftleg6;
    ModelRenderer rightleg7;
    ModelRenderer leftleg7;
    ModelRenderer rightleg8;
    ModelRenderer leftleg8;
    ModelRenderer part6;
    ModelRenderer part7;
    ModelRenderer part8;
    ModelRenderer leftarm3;
    ModelRenderer leftarm4;
    ModelRenderer leftarm5;
    ModelRenderer rightarm3;
    ModelRenderer rightarm4;
    ModelRenderer rightarm5;
    ModelRenderer rightarm6;
    ModelRenderer rightarm7;
    ModelRenderer rightarm8;
    ModelRenderer rightarm9;
    ModelRenderer rightarm10;
    ModelRenderer rightarm11;
    ModelRenderer rightarm12;
    ModelRenderer rightarm13;
    ModelRenderer leftarm6;
    ModelRenderer leftarm7;
    ModelRenderer leftarm8;
    ModelRenderer leftarm9;

    public ModelWreckForm2()
    {
        textureWidth = 64;
        textureHeight = 32;

        part1 = new ModelRenderer(this, 5, 0);
        part1.addBox(1F, -7F, -4F, 3, 8, 8);
        part1.setRotationPoint(0F, -1F, -3F);
        part1.setTextureSize(64, 32);
        part1.mirror = true;
        setRotation(part1, 0.1396263F, 0F, 0F);
        part2 = new ModelRenderer(this, 19, 0);
        part2.addBox(-5F, 9F, -3F, 8, 2, 4);
        part2.setRotationPoint(1F, -1F, -2F);
        part2.setTextureSize(64, 32);
        part2.mirror = true;
        setRotation(part2, 0.4363323F, 0F, 0F);
        leftarm1 = new ModelRenderer(this, 42, 20);
        leftarm1.addBox(4F, -14F, -1F, 4, 10, 2);
        leftarm1.setRotationPoint(-5F, 2F, 0F);
        leftarm1.setTextureSize(64, 32);
        leftarm1.mirror = true;
        setRotation(leftarm1, 0F, 0F, 0.8726646F);
        rightleg1 = new ModelRenderer(this, 0, 18);
        rightleg1.addBox(-4F, -4F, -1F, 4, 2, 6);
        rightleg1.setRotationPoint(-2F, 12F, 0F);
        rightleg1.setTextureSize(64, 32);
        rightleg1.mirror = true;
        setRotation(rightleg1, -0.3490659F, 0F, 0F);
        leftleg1 = new ModelRenderer(this, 0, 19);
        leftleg1.addBox(0F, -4F, -1F, 4, 2, 6);
        leftleg1.setRotationPoint(2F, 12F, 0F);
        leftleg1.setTextureSize(64, 32);
        leftleg1.mirror = true;
        setRotation(leftleg1, -0.3490659F, 0F, 0F);
        rightarm1 = new ModelRenderer(this, 42, 20);
        rightarm1.addBox(-2F, -7F, -1F, 4, 10, 2);
        rightarm1.setRotationPoint(-5F, 2F, 0F);
        rightarm1.setTextureSize(64, 32);
        rightarm1.mirror = true;
        setRotation(rightarm1, 0F, 0F, -0.8726646F);
        rightarm2 = new ModelRenderer(this, 40, 16);
        rightarm2.addBox(-6F, 2F, -1F, 2, 7, 2);
        rightarm2.setRotationPoint(-5F, 2F, 0F);
        rightarm2.setTextureSize(64, 32);
        rightarm2.mirror = true;
        setRotation(rightarm2, 0F, 0F, 0F);
        leftarm2 = new ModelRenderer(this, 40, 16);
        leftarm2.addBox(4F, 0F, 9F, 2, 7, 2);
        leftarm2.setRotationPoint(5F, 2F, 0F);
        leftarm2.setTextureSize(64, 32);
        leftarm2.mirror = true;
        setRotation(leftarm2, -1.675516F, 0F, 0F);
        part3 = new ModelRenderer(this, 19, 16);
        part3.addBox(-4F, 0F, -2F, 6, 12, 2);
        part3.setRotationPoint(1F, -1F, -2F);
        part3.setTextureSize(64, 32);
        part3.mirror = true;
        setRotation(part3, 0.4363323F, 0F, 0F);
        part4 = new ModelRenderer(this, 19, 0);
        part4.addBox(-5F, 1F, -3F, 8, 2, 4);
        part4.setRotationPoint(1F, -1F, -2F);
        part4.setTextureSize(64, 32);
        part4.mirror = true;
        setRotation(part4, 0.4363323F, 0F, 0F);
        part5 = new ModelRenderer(this, 19, 0);
        part5.addBox(-5F, 5F, -3F, 8, 2, 4);
        part5.setRotationPoint(1F, -1F, -2F);
        part5.setTextureSize(64, 32);
        part5.mirror = true;
        setRotation(part5, 0.4363323F, 0F, 0F);
        rightleg2 = new ModelRenderer(this, 4, 21);
        rightleg2.addBox(0F, 5F, 0F, 1, 8, 2);
        rightleg2.setRotationPoint(-2F, 12F, 0F);
        rightleg2.setTextureSize(64, 32);
        rightleg2.mirror = true;
        setRotation(rightleg2, -0.4712389F, 0F, 0F);
        rightleg3 = new ModelRenderer(this, 0, 16);
        rightleg3.addBox(-3F, -3F, 0F, 2, 8, 4);
        rightleg3.setRotationPoint(-2F, 12F, 0F);
        rightleg3.setTextureSize(64, 32);
        rightleg3.mirror = true;
        setRotation(rightleg3, -0.3490659F, 0F, 0F);
        leftleg2 = new ModelRenderer(this, 0, 17);
        leftleg2.addBox(1F, -3F, 0F, 2, 8, 4);
        leftleg2.setRotationPoint(2F, 12F, 0F);
        leftleg2.setTextureSize(64, 32);
        leftleg2.mirror = true;
        setRotation(leftleg2, -0.3490659F, 0F, 0F);
        rightleg4 = new ModelRenderer(this, 0, 24);
        rightleg4.addBox(0F, 4F, -2F, 2, 2, 2);
        rightleg4.setRotationPoint(-2F, 12F, 0F);
        rightleg4.setTextureSize(64, 32);
        rightleg4.mirror = true;
        setRotation(rightleg4, 0F, 0F, 0F);
        leftleg3 = new ModelRenderer(this, 0, 25);
        leftleg3.addBox(4F, 4F, -2F, 2, 2, 2);
        leftleg3.setRotationPoint(2F, 12F, 0F);
        leftleg3.setTextureSize(64, 32);
        leftleg3.mirror = true;
        setRotation(leftleg3, 0F, 0F, 0F);
        rightleg5 = new ModelRenderer(this, 4, 21);
        rightleg5.addBox(-5F, 5F, 0F, 1, 8, 2);
        rightleg5.setRotationPoint(-2F, 12F, 0F);
        rightleg5.setTextureSize(64, 32);
        rightleg5.mirror = true;
        setRotation(rightleg5, -0.4712389F, 0F, 0F);
        leftleg4 = new ModelRenderer(this, 4, 21);
        leftleg4.addBox(-1F, 5F, 0F, 1, 8, 2);
        leftleg4.setRotationPoint(2F, 12F, 0F);
        leftleg4.setTextureSize(64, 32);
        leftleg4.mirror = true;
        setRotation(leftleg4, -0.4712389F, 0F, 0F);
        leftleg5 = new ModelRenderer(this, 4, 21);
        leftleg5.addBox(4F, 5F, 0F, 1, 8, 2);
        leftleg5.setRotationPoint(2F, 12F, 0F);
        leftleg5.setTextureSize(64, 32);
        leftleg5.mirror = true;
        setRotation(leftleg5, -0.4712389F, 0F, 0F);
        rightleg6 = new ModelRenderer(this, 4, 21);
        rightleg6.addBox(0F, 5F, 0F, 1, 8, 2);
        rightleg6.setRotationPoint(-2F, 12F, 0F);
        rightleg6.setTextureSize(64, 32);
        rightleg6.mirror = true;
        setRotation(rightleg6, -0.4712389F, 0F, 0F);
        leftleg6 = new ModelRenderer(this, 4, 21);
        leftleg6.addBox(4F, 5F, 0F, 1, 8, 2);
        leftleg6.setRotationPoint(2F, 12F, 0F);
        leftleg6.setTextureSize(64, 32);
        leftleg6.mirror = true;
        setRotation(leftleg6, -0.4712389F, 0F, 0F);
        rightleg7 = new ModelRenderer(this, 0, 19);
        rightleg7.addBox(-4F, 4F, -2F, 4, 8, 4);
        rightleg7.setRotationPoint(-2F, 12F, 0F);
        rightleg7.setTextureSize(64, 32);
        rightleg7.mirror = true;
        setRotation(rightleg7, 0F, 0F, 0F);
        leftleg7 = new ModelRenderer(this, 0, 20);
        leftleg7.addBox(0F, 4F, -2F, 4, 8, 4);
        leftleg7.setRotationPoint(2F, 12F, 0F);
        leftleg7.setTextureSize(64, 32);
        leftleg7.mirror = true;
        setRotation(leftleg7, 0F, 0F, 0F);
        rightleg8 = new ModelRenderer(this, 0, 24);
        rightleg8.addBox(-6F, 4F, -2F, 2, 2, 2);
        rightleg8.setRotationPoint(-2F, 12F, 0F);
        rightleg8.setTextureSize(64, 32);
        rightleg8.mirror = true;
        setRotation(rightleg8, 0F, 0F, 0F);
        leftleg8 = new ModelRenderer(this, 0, 25);
        leftleg8.addBox(-2F, 4F, -2F, 2, 2, 2);
        leftleg8.setRotationPoint(2F, 12F, 0F);
        leftleg8.setTextureSize(64, 32);
        leftleg8.mirror = true;
        setRotation(leftleg8, 0F, 0F, 0F);
        part6 = new ModelRenderer(this, 16, 9);
        part6.addBox(-1F, -4F, -2F, 2, 3, 3);
        part6.setRotationPoint(0F, -1F, -3F);
        part6.setTextureSize(64, 32);
        part6.mirror = true;
        setRotation(part6, 0.1396263F, 0F, 0F);
        part7 = new ModelRenderer(this, 0, 0);
        part7.addBox(-4F, -7F, -4F, 3, 8, 8);
        part7.setRotationPoint(0F, -1F, -3F);
        part7.setTextureSize(64, 32);
        part7.mirror = true;
        setRotation(part7, 0.1396263F, 0F, 0F);
        part8 = new ModelRenderer(this, 56, 0);
        part8.addBox(4F, -7F, -8F, 2, 30, 2);
        part8.setRotationPoint(5F, 2F, 0F);
        part8.setTextureSize(64, 32);
        part8.mirror = true;
        setRotation(part8, -0.1047198F, 0F, 0F);
        leftarm3 = new ModelRenderer(this, 40, 16);
        leftarm3.addBox(3F, -3F, -2F, 4, 7, 4);
        leftarm3.setRotationPoint(5F, 2F, 0F);
        leftarm3.setTextureSize(64, 32);
        leftarm3.mirror = true;
        setRotation(leftarm3, 0F, 0F, 0F);
        leftarm4 = new ModelRenderer(this, 40, 16);
        leftarm4.addBox(4F, 3F, -1F, 2, 7, 2);
        leftarm4.setRotationPoint(5F, 2F, 0F);
        leftarm4.setTextureSize(64, 32);
        leftarm4.mirror = true;
        setRotation(leftarm4, -0.1047198F, 0F, 0F);
        leftarm5 = new ModelRenderer(this, 40, 16);
        leftarm5.addBox(3F, 8F, -2F, 4, 4, 4);
        leftarm5.setRotationPoint(5F, 2F, 0F);
        leftarm5.setTextureSize(64, 32);
        leftarm5.mirror = true;
        setRotation(leftarm5, -0.1047198F, 0F, 0F);
        rightarm3 = new ModelRenderer(this, 40, 16);
        rightarm3.addBox(-7F, -3F, -2F, 4, 7, 4);
        rightarm3.setRotationPoint(-5F, 2F, 0F);
        rightarm3.setTextureSize(64, 32);
        rightarm3.mirror = true;
        setRotation(rightarm3, 0F, 0F, 0F);
        rightarm4 = new ModelRenderer(this, 40, 16);
        rightarm4.addBox(-7F, 7F, -2F, 4, 5, 4);
        rightarm4.setRotationPoint(-5F, 2F, 0F);
        rightarm4.setTextureSize(64, 32);
        rightarm4.mirror = true;
        setRotation(rightarm4, 0F, 0F, 0F);
        rightarm5 = new ModelRenderer(this, 40, 16);
        rightarm5.addBox(16F, -4F, -3F, 2, 5, 1);
        rightarm5.setRotationPoint(-5F, 2F, 0F);
        rightarm5.setTextureSize(64, 32);
        rightarm5.mirror = true;
        setRotation(rightarm5, 0F, 0F, 2.181662F);
        rightarm6 = new ModelRenderer(this, 40, 16);
        rightarm6.addBox(16F, -4F, 2F, 2, 5, 1);
        rightarm6.setRotationPoint(-5F, 2F, 0F);
        rightarm6.setTextureSize(64, 32);
        rightarm6.mirror = true;
        setRotation(rightarm6, 0F, 0F, 2.181662F);
        rightarm7 = new ModelRenderer(this, 40, 16);
        rightarm7.addBox(16F, -4F, -1F, 2, 5, 1);
        rightarm7.setRotationPoint(-5F, 2F, 1F);
        rightarm7.setTextureSize(64, 32);
        rightarm7.mirror = true;
        setRotation(rightarm7, 0F, 0F, 2.181662F);
        rightarm8 = new ModelRenderer(this, 40, 16);
        rightarm8.addBox(16F, -4F, -1F, 2, 5, 1);
        rightarm8.setRotationPoint(-5F, 2F, 0F);
        rightarm8.setTextureSize(64, 32);
        rightarm8.mirror = true;
        setRotation(rightarm8, 0F, 0F, 2.181662F);
        rightarm9 = new ModelRenderer(this, 40, 16);
        rightarm9.addBox(-1F, 11F, 0F, 2, 5, 1);
        rightarm9.setRotationPoint(-5F, 2F, 0F);
        rightarm9.setTextureSize(64, 32);
        rightarm9.mirror = true;
        setRotation(rightarm9, 0F, 0F, 0.6108652F);
        rightarm10 = new ModelRenderer(this, 40, 16);
        rightarm10.addBox(-1F, 11F, 2F, 2, 5, 1);
        rightarm10.setRotationPoint(-5F, 2F, 0F);
        rightarm10.setTextureSize(64, 32);
        rightarm10.mirror = true;
        setRotation(rightarm10, 0F, 0F, 0.6108652F);
        rightarm11 = new ModelRenderer(this, 40, 16);
        rightarm11.addBox(-1F, 11F, -1F, 2, 5, 1);
        rightarm11.setRotationPoint(-5F, 2F, 1F);
        rightarm11.setTextureSize(64, 32);
        rightarm11.mirror = true;
        setRotation(rightarm11, 0F, 0F, 0.6108652F);
        rightarm12 = new ModelRenderer(this, 40, 16);
        rightarm12.addBox(-1F, 11F, -1F, 2, 5, 1);
        rightarm12.setRotationPoint(-5F, 2F, 0F);
        rightarm12.setTextureSize(64, 32);
        rightarm12.mirror = true;
        setRotation(rightarm12, 0F, 0F, 0.6108652F);
        rightarm13 = new ModelRenderer(this, 40, 16);
        rightarm13.addBox(-1F, 11F, -3F, 2, 5, 1);
        rightarm13.setRotationPoint(-5F, 2F, 0F);
        rightarm13.setTextureSize(64, 32);
        rightarm13.mirror = true;
        setRotation(rightarm13, 0F, 0F, 0.6108652F);
        leftarm6 = new ModelRenderer(this, 28, 7);
        leftarm6.addBox(0F, -15F, -8F, 3, 6, 2);
        leftarm6.setRotationPoint(5F, 2F, 0F);
        leftarm6.setTextureSize(64, 32);
        leftarm6.mirror = true;
        setRotation(leftarm6, -0.1047198F, 0F, 0.4363323F);
        leftarm7 = new ModelRenderer(this, 40, 16);
        leftarm7.addBox(3F, 8F, -9F, 4, 4, 4);
        leftarm7.setRotationPoint(5F, 2F, 0F);
        leftarm7.setTextureSize(64, 32);
        leftarm7.mirror = true;
        setRotation(leftarm7, -0.1047198F, 0F, 0F);
        leftarm8 = new ModelRenderer(this, 38, 7);
        leftarm8.addBox(3F, -9F, -9F, 4, 4, 4);
        leftarm8.setRotationPoint(5F, 2F, 0F);
        leftarm8.setTextureSize(64, 32);
        leftarm8.mirror = true;
        setRotation(leftarm8, -0.1047198F, 0F, 0F);
        leftarm9 = new ModelRenderer(this, 28, 7);
        leftarm9.addBox(6F, -11F, -8F, 3, 6, 2);
        leftarm9.setRotationPoint(5F, 2F, 0F);
        leftarm9.setTextureSize(64, 32);
        leftarm9.mirror = true;
        setRotation(leftarm9, -0.1047198F, 0F, -0.4363323F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        part1.render(f5);
        part2.render(f5);
        leftarm1.render(f5);
        rightleg1.render(f5);
        leftleg1.render(f5);
        rightarm1.render(f5);
        rightarm2.render(f5);
        leftarm2.render(f5);
        part3.render(f5);
        part4.render(f5);
        part5.render(f5);
        rightleg2.render(f5);
        rightleg3.render(f5);
        leftleg2.render(f5);
        rightleg4.render(f5);
        leftleg3.render(f5);
        rightleg5.render(f5);
        leftleg4.render(f5);
        leftleg5.render(f5);
        rightleg6.render(f5);
        leftleg6.render(f5);
        rightleg7.render(f5);
        leftleg7.render(f5);
        rightleg8.render(f5);
        leftleg8.render(f5);
        part6.render(f5);
        part7.render(f5);
        part8.render(f5);
        leftarm3.render(f5);
        leftarm4.render(f5);
        leftarm5.render(f5);
        rightarm3.render(f5);
        rightarm4.render(f5);
        rightarm5.render(f5);
        rightarm6.render(f5);
        rightarm7.render(f5);
        rightarm8.render(f5);
        rightarm9.render(f5);
        rightarm10.render(f5);
        rightarm11.render(f5);
        rightarm12.render(f5);
        rightarm13.render(f5);
        leftarm6.render(f5);
        leftarm7.render(f5);
        leftarm8.render(f5);
        leftarm9.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.leftleg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1-0.3490659F;
        this.leftleg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1-0.3490659F;
        this.leftleg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftleg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1-0.4712389F;
        this.leftleg5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1-0.4712389F;
        this.leftleg6.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1-0.4712389F;
        this.leftleg7.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftleg8.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;

        this.rightleg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1-0.3490659F;
        this.rightleg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1-0.4712389F;
        this.rightleg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1-0.3490659F;
        this.rightleg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1-0.4712389F;
        this.rightleg6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightleg8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;

        this.rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm9.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm10.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm11.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm12.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm13.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;

        this.leftarm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F-0.1047198F;
        this.leftarm5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F-0.1047198F;
        this.leftarm6.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F-0.1047198F;
        this.leftarm7.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F-0.1047198F;
        this.leftarm8.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F-0.1047198F;
        this.leftarm9.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F-0.1047198F;
    }

}
