package ch.piyamon.sound;

import ch.piyamon.Neogeum;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent NEO = registerSoundEvent("neo");
    public static final RegistryKey<JukeboxSong> NEO_KEY = of("neo");


    private static RegistryKey<JukeboxSong> of(String name) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Neogeum.MOD_ID, name));
    }

    private static SoundEvent registerSoundEvent(String name) {
        return Registry.register(Registries.SOUND_EVENT, Identifier.of(Neogeum.MOD_ID, name),
                SoundEvent.of(Identifier.of(Neogeum.MOD_ID, name)));
    }

    public static void registerSounds() {
        Neogeum.LOGGER.info("Registering Mod Sounds for " + Neogeum.MOD_ID);
    }
}