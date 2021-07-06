package com.study.design.facade;

public class FacadeTest {

    public static void main(String[] args) {
        /* // Facade 패턴을 적용하지 않았을 때
        Ftp ftp = new Ftp("www.test.co.kr", 22, "/home/etc");
        ftp.connect();
        ftp.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftp.disConnect();
        */

        SftpClient sftpClient = new SftpClient("www.test.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
