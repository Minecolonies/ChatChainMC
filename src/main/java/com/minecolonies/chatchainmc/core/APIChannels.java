package com.minecolonies.chatchainmc.core;

import lombok.Getter;

public enum APIChannels
{

    MAIN("main"),
    STAFF("staff")
    ;

    @Getter
    private final String name;

    APIChannels(final String name)
    {
        this.name = name;
    }

}