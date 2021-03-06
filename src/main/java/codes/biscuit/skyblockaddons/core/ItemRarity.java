package codes.biscuit.skyblockaddons.core;

import codes.biscuit.skyblockaddons.utils.ColorCode;
import lombok.Getter;

/**
 * Skyblock item rarity definitions
 */
@Getter
public enum ItemRarity {

    COMMON("COMMON", ColorCode.WHITE),
    UNCOMMON("UNCOMMON", ColorCode.GREEN),
    RARE("RARE", ColorCode.BLUE),
    EPIC("EPIC", ColorCode.DARK_PURPLE),
    LEGENDARY("LEGENDARY", ColorCode.GOLD),
    MYTHIC("MYTHIC", ColorCode.LIGHT_PURPLE),
    SPECIAL("SPECIAL", ColorCode.RED),
    VERY_SPECIAL("VERY SPECIAL", ColorCode.RED);

    private String tag;
    private ColorCode colorCode;

    ItemRarity(String loreName, ColorCode colorCode) {
        this.tag = loreName;
        this.colorCode = colorCode;
    }
}
