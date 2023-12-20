package com.elordenador.eggtherite.materials;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EggtheriteMaterial implements ToolMaterial {
    Item repairItem;
    public EggtheriteMaterial(Item repairItem) {
        this.repairItem = repairItem;
    }
    @Override
    public int getDurability() {
        return 4000;
    }
    @Override 
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }
    @Override 
    public float getAttackDamage() {
        return 10.0F;
    }
    @Override 
    public int getMiningLevel() {
        return 1;
    }
    @Override
    public int getEnchantability() {
        return 40;
    }
    @Override 
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(this.repairItem);
    }
}
