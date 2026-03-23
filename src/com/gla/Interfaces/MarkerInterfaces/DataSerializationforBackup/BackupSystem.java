package Interfaces.MarkerInterfaces.DataSerializationforBackup;

public class BackupSystem {
    public static void main(String[] args) {

        UserData user = new UserData("Rahul", 101);
        String text = "Hello";

        BackupProcessor.processBackup(user);
        BackupProcessor.processBackup(text);
    }
}
