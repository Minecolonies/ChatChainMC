package co.chatchain.mc.forge.configs.formatting;

import co.chatchain.mc.forge.configs.AbstractConfig;
import co.chatchain.mc.forge.configs.formatting.formats.DefaultFormats;
import co.chatchain.mc.forge.configs.formatting.formats.MessageFormats;
import lombok.Getter;
import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@ConfigSerializable
public class FormattingConfig extends AbstractConfig
{
    @Getter
    @Setting("default-formats")
    private MessageFormats formats = new DefaultFormats();

    @NotNull
    public List<String> getOverride(final FormatAction action)
    {
        return action.invoke(formats);
    }
}
