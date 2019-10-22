package com.example.archiveservice.projections;

import com.example.archiveservice.models.File;
import com.example.archiveservice.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = File.class)
public interface EmbedFile {

    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();


}
