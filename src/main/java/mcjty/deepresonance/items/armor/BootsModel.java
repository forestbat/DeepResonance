package mcjty.deepresonance.items.armor;

// Date: 24/10/2015 20:14:17
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BootsModel extends ModelBiped {
    public static BootsModel bootsModel = new BootsModel();

    //fields
    ModelRenderer leftfootbase;
    ModelRenderer rightfootbase;
    ModelRenderer leftback;
    ModelRenderer rightback;
    ModelRenderer leftfront;
    ModelRenderer rightfront;
    ModelRenderer rightside2;
    ModelRenderer leftside2;
    ModelRenderer leftside1;
    ModelRenderer rightside1;
    ModelRenderer lefttip;
    ModelRenderer righttip;

    public BootsModel() {
        textureWidth = 64;
        textureHeight = 32;

        leftfootbase = new ModelRenderer(this, 12, 0);
        leftfootbase.addBox(0F, 0F, 0F, 4, 0, 4);
        leftfootbase.setRotationPoint(0F, 24F, -2F);
        leftfootbase.setTextureSize(64, 32);
        leftfootbase.mirror = true;
        setRotation(leftfootbase, 0F, 0F, 0F);
        rightfootbase = new ModelRenderer(this, 12, 0);
        rightfootbase.addBox(0F, 0F, 0F, 4, 0, 4);
        rightfootbase.setRotationPoint(-4F, 24F, -2F);
        rightfootbase.setTextureSize(64, 32);
        rightfootbase.mirror = true;
        setRotation(rightfootbase, 0F, 0F, 0F);
        leftback = new ModelRenderer(this, 0, 8);
        leftback.addBox(0F, 0F, 0F, 4, 4, 2);
        leftback.setRotationPoint(0F, 20F, 2F);
        leftback.setTextureSize(64, 32);
        leftback.mirror = true;
        setRotation(leftback, 0F, 0F, 0F);
        rightback = new ModelRenderer(this, 0, 8);
        rightback.addBox(0F, 0F, 0F, 4, 4, 2);
        rightback.setRotationPoint(-4F, 20F, 2F);
        rightback.setTextureSize(64, 32);
        rightback.mirror = true;
        setRotation(rightback, 0F, 0F, 0F);
        leftfront = new ModelRenderer(this, 0, 8);
        leftfront.addBox(0F, 0F, 0F, 4, 4, 2);
        leftfront.setRotationPoint(0F, 20F, -4F);
        leftfront.setTextureSize(64, 32);
        leftfront.mirror = true;
        setRotation(leftfront, 0F, 0F, 0F);
        rightfront = new ModelRenderer(this, 0, 8);
        rightfront.addBox(0F, 0F, 0F, 4, 4, 2);
        rightfront.setRotationPoint(-4F, 20F, -4F);
        rightfront.setTextureSize(64, 32);
        rightfront.mirror = true;
        setRotation(rightfront, 0F, 0F, 0F);
        rightside2 = new ModelRenderer(this, 0, 0);
        rightside2.addBox(0F, 0F, 0F, 2, 4, 4);
        rightside2.setRotationPoint(-2F, 20F, -2F);
        rightside2.setTextureSize(64, 32);
        rightside2.mirror = true;
        setRotation(rightside2, 0F, 0F, 0F);
        leftside2 = new ModelRenderer(this, 0, 0);
        leftside2.addBox(0F, 0F, 0F, 2, 4, 4);
        leftside2.setRotationPoint(0F, 20F, -2F);
        leftside2.setTextureSize(64, 32);
        leftside2.mirror = true;
        setRotation(leftside2, 0F, 0F, 0F);
        leftside1 = new ModelRenderer(this, 0, 0);
        leftside1.addBox(0F, 0F, 0F, 2, 4, 4);
        leftside1.setRotationPoint(4F, 20F, -2F);
        leftside1.setTextureSize(64, 32);
        leftside1.mirror = true;
        setRotation(leftside1, 0F, 0F, 0F);
        rightside1 = new ModelRenderer(this, 0, 0);
        rightside1.addBox(0F, 0F, 0F, 2, 4, 4);
        rightside1.setRotationPoint(-6F, 20F, -2F);
        rightside1.setTextureSize(64, 32);
        rightside1.mirror = true;
        setRotation(rightside1, 0F, 0F, 0F);
        lefttip = new ModelRenderer(this, 12, 4);
        lefttip.addBox(0F, 0F, 0F, 2, 3, 1);
        lefttip.setRotationPoint(1F, 21F, -5F);
        lefttip.setTextureSize(64, 32);
        lefttip.mirror = true;
        setRotation(lefttip, 0F, 0F, 0F);
        righttip = new ModelRenderer(this, 12, 4);
        righttip.addBox(0F, 0F, 0F, 2, 3, 1);
        righttip.setRotationPoint(-3F, 21F, -5F);
        righttip.setTextureSize(64, 32);
        righttip.mirror = true;
        setRotation(righttip, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(entity, f, f1, f2, f3, f4, f5);
        leftfootbase.render(f5);
        rightfootbase.render(f5);
        leftback.render(f5);
        rightback.render(f5);
        leftfront.render(f5);
        rightfront.render(f5);
        rightside2.render(f5);
        leftside2.render(f5);
        leftside1.render(f5);
        rightside1.render(f5);
        lefttip.render(f5);
        righttip.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}