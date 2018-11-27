package com.powersys.alquila.services.implementations;



import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.powersys.alquila.domain.Property;

import java.io.*;
import java.util.UUID;

@Service
public class StorageServise {

    public String store(MultipartFile input){
        String name;
        try {
        	String originalName = input.getOriginalFilename();
            name = UUID
            		.randomUUID()
            		.toString()
            		.concat(originalName.substring(originalName.indexOf('.'), originalName.length()));
            
            File file = new File("C:/Users/Public/Documents" + File.separator + name);
            FileCopyUtils.copy(input.getInputStream(), new FileOutputStream(file));
        }catch (IOException e){
            throw new RuntimeException("Cause by: " + e.getStackTrace() + "--" + e.getMessage() + "--" + e.getClass());
        }

        return name;
    }
}
