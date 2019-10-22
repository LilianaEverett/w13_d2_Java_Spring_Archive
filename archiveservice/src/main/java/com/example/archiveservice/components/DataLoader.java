package com.example.archiveservice.components;

import com.example.archiveservice.models.File;
import com.example.archiveservice.models.Folder;
import com.example.archiveservice.models.User;
import com.example.archiveservice.repositories.FileRepository;
import com.example.archiveservice.repositories.FolderRepository;
import com.example.archiveservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Override
    public void run(ApplicationArguments args) {
        User user = new User("Liliana");
        userRepository.save(user);

        Folder folder = new Folder("Codeclan", user);
        folderRepository.save(folder);

        File file = new File("many_classes", ".java", 45, folder);
        fileRepository.save(file);
    }
}
