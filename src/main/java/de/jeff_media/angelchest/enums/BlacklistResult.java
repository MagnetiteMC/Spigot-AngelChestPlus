package de.jeff_media.angelchest.enums;

import org.jetbrains.annotations.Nullable;

public enum BlacklistResult {
    MATCH, NO_MATCH_LORE_EXACT, NO_MATCH_LORE_CONTAINS, NO_MATCH_NAME_EXACT, NO_MATCH_NAME_CONTAINS, NO_MATCH_MATERIAL, NO_MATCH_ENCHANTMENTS;

    private @Nullable String name;

    public @Nullable String getName() {
        return name;
    }

    public void setName(@Nullable final String name) {
        this.name = name;
    }
}
