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
        User user1 = new User("Alex");
        userRepository.save(user);
        userRepository.save(user1);

        Folder folder = new Folder("Codeclan", user);
        Folder folder1 = new Folder("cv", user);
        folderRepository.save(folder);
        folderRepository.save(folder1);

        File file = new File("many_classes", ".java", 45, folder);
        File file1 = new File("java", ".java", 45, folder);
        File file2 = new File("cv", ".txt", 45, folder1);
        File file3 = new File("cover_letter", ".txt", 45, folder1);
        fileRepository.save(file);
        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);

        user.addFolder(folder);
        user.addFolder(folder1);
        user1.addFolder(folder1);
        folder.addFile(file);
        folder.addFile(file1);
        folder1.addFile(file2);
        folder1.addFile(file3);
    }
}
