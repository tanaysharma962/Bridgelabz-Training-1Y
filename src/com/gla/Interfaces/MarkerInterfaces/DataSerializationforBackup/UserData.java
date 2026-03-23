package Interfaces.MarkerInterfaces.DataSerializationforBackup;

public class UserData implements BackupSerializable {
    String name;
    int id;

    UserData(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
