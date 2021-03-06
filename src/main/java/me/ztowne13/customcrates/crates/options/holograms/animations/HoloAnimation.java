package me.ztowne13.customcrates.crates.options.holograms.animations;

import me.ztowne13.customcrates.SpecializedCrates;
import me.ztowne13.customcrates.crates.options.CHologram;
import me.ztowne13.customcrates.crates.options.holograms.DynamicHologram;

/**
 * Hologram, Animation subtype
 */
public abstract class HoloAnimation extends Animation {
    protected DynamicHologram dynamicHologram;
    protected CHologram holograms;
    private int intTicks = 0;

    public HoloAnimation(SpecializedCrates instance, DynamicHologram dynamicHologram) {
        super(instance);
        this.dynamicHologram = dynamicHologram;
        this.holograms = dynamicHologram.getPlacedCrate().getHologram();
    }

    public int getIntTicks() {
        return intTicks;
    }

    public void setIntTicks(int intTicks) {
        this.intTicks = intTicks;
    }

    public DynamicHologram getDynamicHologram() {
        return dynamicHologram;
    }

    public void setDynamicHologram(DynamicHologram dynamicHologram) {
        this.dynamicHologram = dynamicHologram;
    }

    public CHologram getHolograms() {
        return holograms;
    }

    public void setHolograms(CHologram holograms) {
        this.holograms = holograms;
    }


}
