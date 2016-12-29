package io.mulberry.ms.hong.parsers;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class Mp3Parser extends AbstractMediaParser {
    private int MAX_BUF_BYTE = 1024;
    public Mp3Parser(String path) {
        super(path);
    }

    @Override
    public void parse(OutputStream outputStream){
        InputStream in = null;
        BufferedInputStream bis = null;
        ByteArrayOutputStream arrayBuff = new ByteArrayOutputStream();
        try {

            byte[] buffer = new byte[MAX_BUF_BYTE];

            in=new FileInputStream(new File(path));
            bis = new BufferedInputStream(in);
            int len = 0;
            while ((len = bis.read(buffer)) >= 0) {
                outputStream.write(buffer, 0, len);
            }

        } catch (Exception e) {
            //log.info(e.toString());
        } finally {

            try {

                in.close();
                bis.close();
                outputStream.close();


            } catch (Exception e) {
            }
        }
        arrayBuff.toByteArray();

    }
}
