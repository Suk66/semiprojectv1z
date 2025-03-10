package com.example.zzyzzy.semiprojectv1.service;

<<<<<<< HEAD
import com.example.zzyzzy.semiprojectv1.domain.Gallery;
=======
import com.example.zzyzzy.semiprojectv1.domain.GalleryImageDTO;
import com.example.zzyzzy.semiprojectv1.domain.GalleryListDTO;
import com.example.zzyzzy.semiprojectv1.domain.GalleryViewDTO;
import com.example.zzyzzy.semiprojectv1.domain.NewGalleryDTO;
import org.springframework.web.multipart.MultipartFile;
>>>>>>> upstream/master

import java.util.List;

public interface GalleryService {

<<<<<<< HEAD
    List<Gallery> selectGallery();


=======
    List<GalleryListDTO> selectGallery();

    GalleryImageDTO readOneGalleryImage(int gno);

    boolean newGalleryImage(NewGalleryDTO gal, List<MultipartFile> ginames);
>>>>>>> upstream/master
}
