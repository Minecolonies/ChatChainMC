package co.chatchain.mc.configs;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class MainConfig extends AbstractConfig
{

    //####### Client ID #######\\

    @Setting(value = "client-id", comment = "ChatChainIdentity User ID for this client")
    private String clientId = "ClientId";

    public String getClientId()
    {
        return getSystemValueOrConfigValue("CHATCHAIN_CLIENT_ID", clientId);
    }

    //####### Client Secret #######\\

    @Setting(value = "client-secret", comment = "ChatChainIdentity User password for this client")
    private String clientSecret = "ClientSecret";

    public String getClientSecret()
    {
        return getSystemValueOrConfigValue("CHATCHAIN_CLIENT_SECRET", clientSecret);
    }

    //####### Api URL #######\\

    @Setting(value = "api-url", comment = "API URL Your client is connecting to")
    private String apiUrl = "https://api.chatchain.co/hubs/chatchain";

    public String getApiUrl()
    {
        return getSystemValueOrConfigValue("CHATCHAIN_API_URL", apiUrl);
    }

    //####### Identity URL #######\\

    @Setting(value = "identity-url", comment = "Identity URL Your client is authenticating against")
    private String identityUrl = "https://identity.chatchain.co/connect/token";

    public String getIdentityUrl()
    {
        return getSystemValueOrConfigValue("CHATCHAIN_IDENTITY_URL", identityUrl);
    }

    private String getSystemValueOrConfigValue(final String systemValue, String configValue)
    {
        final String value = System.getenv(systemValue);
        if (value == null || value.equals(""))
        {
            return configValue;
        }
        return value;
    }

}
