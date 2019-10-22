package com.example.archiveservice.projections;

import com.example.archiveservice.models.Folder;
import com.example.archiveservice.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = User.class)
public interface EmbedUser {
    String getName();
    Folder getFolders();
}
