package dev.norbiros.emojitype.forge;

import dev.norbiros.emojitype.EmojiType;
import dev.norbiros.emojitype.config.EmojiTypeConfig;
import net.minecraftforge.client.ConfigScreenHandler.ConfigScreenFactory;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(EmojiType.MOD_ID)
public class EmojitypeForge {
    public EmojitypeForge() {
        EmojiType.init();

        if (ModList.get().isLoaded("cloth_config")) {
            ModLoadingContext.get().registerExtensionPoint(ConfigScreenFactory.class,
                    () -> new ConfigScreenFactory((client, parent) -> EmojiTypeConfig.createConfigScreen(parent)));
        }
    }
}