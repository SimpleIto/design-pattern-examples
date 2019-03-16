package structural.facade;

public class EncryptFacade {
    public static void fileEncrypt(String srcFileName, String targetFileName){
        FileWriter.write(targetFileName, CipherMachine.encrypt(FileReader.read(srcFileName)));
    }
}
