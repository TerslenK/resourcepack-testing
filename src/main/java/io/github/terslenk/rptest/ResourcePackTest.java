package io.github.terslenk.rptest;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

public class ResourcePackTest extends AbstractAddon implements SlimefunAddon {
    private static ResourcePackTest instance;

    public ResourcePackTest() {
        super("TerslenK", "RPTest", "master", "options.auto-update");
    }

    @Override
    protected void enable() {
        instance = this;
    }

    @Override
    protected void disable() {
        instance = null;
    }
}
