package mcjty.deepresonance.items.armor;

// Date: 24/10/2015 20:14:41
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HelmetModel extends ModelBiped {
    public static HelmetModel helmetModel = new HelmetModel();

    //fields
    ModelRenderer top;
    ModelRenderer side1;
    ModelRenderer side2;
    ModelRenderer bottom;
    ModelRenderer front1;
    ModelRenderer front2;
    ModelRenderer front3;
    ModelRenderer front4;
    ModelRenderer back;
    ModelRenderer visor;

    public HelmetModel() {
        textureWidth = 64;
        textureHeight = 32;

        top = new ModelRenderer(this, 18, 0);
        top.addBox(0F, 0F, 0F, 8, 1, 8);
        top.setRotationPoint(-4F, -9F, -4F);
        top.setTextureSize(64, 32);
        top.mirror = true;
        setRotation(top, 0F, 0F, 0F);
        side1 = new ModelRenderer(this, 0, 9);
        side1.addBox(0F, 0F, 0F, 1, 8, 8);
        side1.setRotationPoint(4F, -8F, -4F);
        side1.setTextureSize(64, 32);
        side1.mirror = true;
        setRotation(side1, 0F, 0F, 0F);
        side2 = new ModelRenderer(this, 0, 9);
        side2.addBox(0F, 0F, 0F, 1, 8, 8);
        side2.setRotationPoint(-5F, -8F, -4F);
        side2.setTextureSize(64, 32);
        side2.mirror = true;
        setRotation(side2, 0F, 0F, 0F);
        bottom = new ModelRenderer(this, 18, 17);
        bottom.addBox(0F, 0F, 0F, 8, 0, 8);
        bottom.setRotationPoint(-4F, 0F, -4F);
        bottom.setTextureSize(64, 32);
        bottom.mirror = true;
        setRotation(bottom, 0F, 0F, 0F);
        front1 = new ModelRenderer(this, 18, 9);
        front1.addBox(0F, 0F, 0F, 8, 2, 1);
        front1.setRotationPoint(-4F, -8F, -5F);
        front1.setTextureSize(64, 32);
        front1.mirror = true;
        setRotation(front1, 0F, 0F, 0F);
        front2 = new ModelRenderer(this, 18, 12);
        front2.addBox(0F, 0F, 0F, 3, 4, 1);
        front2.setRotationPoint(2F, -6F, -5F);
        front2.setTextureSize(64, 32);
        front2.mirror = true;
        setRotation(front2, 0F, 0F, 0F);
        front3 = new ModelRenderer(this, 18, 12);
        front3.addBox(0F, 0F, 0F, 3, 4, 1);
        front3.setRotationPoint(-5F, -6F, -5F);
        front3.setTextureSize(64, 32);
        front3.mirror = true;
        setRotation(front3, 0F, 0F, 0F);
        front4 = new ModelRenderer(this, 18, 9);
        front4.addBox(0F, 0F, 0F, 8, 2, 1);
        front4.setRotationPoint(-4F, -2F, -5F);
        front4.setTextureSize(64, 32);
        front4.mirror = true;
        setRotation(front4, 0F, 0F, 0F);
        back = new ModelRenderer(this, 0, 0);
        back.addBox(0F, 0F, 0F, 8, 8, 1);
        back.setRotationPoint(-4F, -8F, 4F);
        back.setTextureSize(64, 32);
        back.mirror = true;
        setRotation(back, 0F, 0F, 0F);
        visor = new ModelRenderer(this, 26, 12);
        visor.addBox(0F, 0F, 0F, 4, 4, 0);
        visor.setRotationPoint(-2F, -6F, -4F);
        visor.setTextureSize(64, 32);
        visor.mirror = true;
        setRotation(visor, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(entity, f, f1, f2, f3, f4, f5);
        top.render(f5);
        side1.render(f5);
        side2.render(f5);
        bottom.render(f5);
        front1.render(f5);
        front2.render(f5);
        front3.render(f5);
        front4.render(f5);
        back.render(f5);
        visor.render(f5);
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