package com.minecolonies.chatchainmc.core.config;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

import java.util.HashMap;
import java.util.Map;

@ConfigSerializable
public class TemplatesConfig extends BaseConfig
{
    @Setting(value = "generic-connection-placeholder", comment = "Placeholder for when a new client connects.")
    public String genericConnection = "§6{client-name}§f of §e{client-type}§f connected!";

    @Setting(value = "generic-disconnection-placeholder", comment = "Placeholder for when a new client disconnects.")
    public String genericDisconnection = "§6{client-name}§f of §e{client-type}§f disconnected!";

    @Setting(value = "generic-message-placeholder", comment = "Placeholder for generic messages sent over connection.")
    public String genericMessage = "§6[{client-name}] §e{user-name}:§f {user-message}";

    @Setting(value = "generic-join-placeholder", comment = "Placeholder for a generic user join.")
    public String genericJoin = "§6[{client-name}] §e{user-name} joined!";

    @Setting(value = "generic-leave-placeholder", comment = "Placeholder for a generic user leave.")
    public String genericLeave = "§6[{client-name}] §e{user-name} left!";

    @Setting(value = "client-type-template-overrides", comment = "Override for specific ClientType placeholders in here.")
    public Map<String, TypeOverridesConfig> clientTypeOverrides = new HashMap<>();

    @Setting(value = "client-template-overrides", comment = "Overrides for specific Client placeholders in here.")
    public Map<String, ClientOverridesConfig> clientOverrides = new HashMap<>();

    @Setting(value = "channel-template-overrides", comment = "Override for specific channel placeholders in here.")
    public Map<String, ChannelOverridesConfig> channelOverrides = new HashMap<>();

    @Setting(value = "username-template-overrides", comment = "Override for specific username placeholders in here. Not Reliable!")
    public Map<String, UserOverridesConfig> usernameOverrides = new HashMap<>();

    @ConfigSerializable
    public static class TypeOverridesConfig extends BaseConfig
    {
        @Setting(value = "client-template-overrides", comment = "Overrides for specific Client placeholders in here.")
        public Map<String, ClientOverridesConfig> clientOverrides = new HashMap<>();

        @Setting(value = "channel-template-overrides", comment = "Override for specific channel placeholders in here.")
        public Map<String, ChannelOverridesConfig> channelOverrides = new HashMap<>();

        @Setting(value = "username-template-overrides", comment = "Override for specific username placeholders in here. Not Reliable!")
        public Map<String, UserOverridesConfig> usernameOverrides = new HashMap<>();

        @Setting(value = "generic-connection-placeholder", comment = "Placeholder for when a new client connects.")
        public String genericConnection;

        @Setting(value = "generic-disconnection-placeholder", comment = "Placeholder for when a new client disconnects.")
        public String genericDisconnection;

        @Setting(value = "generic-message-placeholder", comment = "Placeholder for generic messages sent over connection.")
        public String genericMessage;

        @Setting(value = "generic-join-placeholder", comment = "Placeholder for a generic user join.")
        public String genericJoin;

        @Setting(value = "generic-leave-placeholder", comment = "Placeholder for a generic user leave.")
        public String genericLeave;
    }

    @ConfigSerializable
    public static class ClientOverridesConfig extends BaseConfig
    {
        @Setting(value = "channel-template-overrides", comment = "Override for specific channel placeholders in here.")
        public Map<String, ChannelOverridesConfig> channelOverrides = new HashMap<>();

        @Setting(value = "username-template-overrides", comment = "Override for specific username placeholders in here. Not Reliable!")
        public Map<String, UserOverridesConfig> usernameOverrides = new HashMap<>();

        @Setting(value = "generic-connection-placeholder", comment = "Placeholder for when a new client connects.")
        public String genericConnection;

        @Setting(value = "generic-disconnection-placeholder", comment = "Placeholder for when a new client disconnects.")
        public String genericDisconnection;

        @Setting(value = "generic-message-placeholder", comment = "Placeholder for generic messages sent over connection.")
        public String genericMessage;

        @Setting(value = "generic-join-placeholder", comment = "Placeholder for a generic user join.")
        public String genericJoin;

        @Setting(value = "generic-leave-placeholder", comment = "Placeholder for a generic user leave.")
        public String genericLeave;
    }

    @ConfigSerializable
    public static class ChannelOverridesConfig extends BaseConfig
    {
        @Setting(value = "username-template-overrides", comment = "Override for specific username placeholders in here. Not Reliable!")
        public Map<String, UserOverridesConfig> usernameOverrides = new HashMap<>();

        @Setting(value = "generic-connection-placeholder", comment = "Placeholder for when a new client connects.")
        public String genericConnection;

        @Setting(value = "generic-disconnection-placeholder", comment = "Placeholder for when a new client disconnects.")
        public String genericDisconnection;

        @Setting(value = "generic-message-placeholder", comment = "Placeholder for generic messages sent over connection.")
        public String genericMessage;

        @Setting(value = "generic-join-placeholder", comment = "Placeholder for a generic user join.")
        public String genericJoin;

        @Setting(value = "generic-leave-placeholder", comment = "Placeholder for a generic user leave.")
        public String genericLeave;
    }

    @ConfigSerializable
    public static class UserOverridesConfig extends BaseConfig
    {
        @Setting(value = "generic-connection-placeholder", comment = "Placeholder for when a new client connects.")
        public String genericConnection;

        @Setting(value = "generic-disconnection-placeholder", comment = "Placeholder for when a new client disconnects.")
        public String genericDisconnection;

        @Setting(value = "generic-message-placeholder", comment = "Placeholder for generic messages sent over connection.")
        public String genericMessage;

        @Setting(value = "generic-join-placeholder", comment = "Placeholder for a generic user join.")
        public String genericJoin;

        @Setting(value = "generic-leave-placeholder", comment = "Placeholder for a generic user leave.")
        public String genericLeave;
    }
}
