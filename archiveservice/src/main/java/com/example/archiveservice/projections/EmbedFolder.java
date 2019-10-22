package com.example.archiveservice.projections;

import com.example.archiveservice.models.File;
import com.example.archiveservice.models.Folder;
import com.example.archiveservice.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedfolder", types = Folder.class)
public interface EmbedFolder {
    String getTitle();
    User getUser();
    ArrayList<File> getFiles();
}
