package com.example.archiveservice.projections;

import com.example.archiveservice.models.User;

@Projection(name = "embedUser", types = User.class)
public interface EmbedUser {
    String getName
}
