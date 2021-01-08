package persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Storage {
    
    public void store(Object object) {
        File storage = new File("./storage");
        storage.mkdir();
        
        File classfolder = new File(storage.getAbsolutePath() + "/" + object.getClass().getName());
        classfolder.mkdir();
        
        File objectfile = new File(classfolder + "/" + object.hashCode());
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(objectfile));
        } catch (IOException exception) {
        }
        try {
            outputStream.writeObject(object);
        } catch (IOException exception) {
        }
        try {
            outputStream.close();
        } catch (IOException exception) {
        }
    }
    
    public void unstore(Object object) {
        File storage = new File("./storage");
        
        File classfolder = new File(storage.getAbsolutePath() + "/" + object.getClass().getName());
        
        File objectfile = new File(classfolder + "/" + object.hashCode());
        objectfile.delete();
    }
    
    public <T> List<T> load(Class<T> clazz) {
        File storage = new File("./storage");
        File classfolder = new File(storage.getAbsolutePath() + "/" + clazz.getName());
        
        List<T> list = new ArrayList<>();
        File[] files = classfolder.listFiles();
        
        for (File file : files) {
            ObjectInputStream inputStream = null;
            try {
                inputStream = new ObjectInputStream(new FileInputStream(file));
            } catch (IOException ex) {
            }
            try {
                list.add((T) inputStream.readObject());
            } catch (IOException ex) {
            } catch (ClassNotFoundException ex) {
            }
            try {
                inputStream.close();
            } catch (IOException ex) {
            }
        }
        
        return list;
    }
}
