package fileupload.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {

    private static final String SAVE_PATH = "/fileupload-files";
    // webapp 밑에 없다. images 라는 링크를 fileupload-files 로 매핑하려고 한다 ! 
    private static final String URL_PATH = "/images";

    public String restore(MultipartFile file) {
        String url = null;
        try {
            File uploadDirectory = new File(SAVE_PATH);
            if (!uploadDirectory.exists()) {
                uploadDirectory.mkdirs();
            }

            if (file.isEmpty()) {
                return url;
            }

            String originFilename = file.getOriginalFilename();
            String extName = originFilename.substring(originFilename.lastIndexOf(".") + 1);
            String saveFilename = generateSaveFilename(extName);
            Long fileSize = file.getSize();

            // 사용자가 올린 파일의 이름이다
            System.out.println("########" + originFilename);
            System.out.println("########" + saveFilename);
            System.out.println("########" + fileSize);

            byte[] data = file.getBytes();
            OutputStream os = new FileOutputStream(SAVE_PATH + "/" + saveFilename);
            os.write(data);
            os.close();
            
            url = URL_PATH  +"/" + saveFilename;
            

          

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return url;
    }

    private String generateSaveFilename(String extName) {
        String filename = "";

        Calendar calendar = Calendar.getInstance();
        filename += calendar.get(Calendar.YEAR);
        filename += calendar.get(Calendar.MONTH);
        filename += calendar.get(Calendar.DATE);
        filename += calendar.get(Calendar.HOUR);
        filename += calendar.get(Calendar.MINUTE);
        filename += calendar.get(Calendar.SECOND);
        filename += calendar.get(Calendar.MILLISECOND);
        filename += ("." + extName);

        return filename;
    }
}
