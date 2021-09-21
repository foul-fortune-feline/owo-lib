package com.glisco.owo.itemgroup.gui;

import com.glisco.owo.itemgroup.Icon;
import com.glisco.owo.itemgroup.TabbedItemGroup;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public record ItemGroupTab(Icon icon, String name, Tag<Item> contentTag, Identifier texture) implements TabbedItemGroup.DrawableComponent {

    public static final Identifier DEFAULT_TEXTURE = new Identifier("owo", "textures/gui/tabs.png");

    public boolean includes(Item item) {
        return (contentTag != null && contentTag.contains(item));
    }

    public String getTranslationKey(String groupKey) {
        return "itemGroup." + groupKey + ".tab." + name;
    }
}