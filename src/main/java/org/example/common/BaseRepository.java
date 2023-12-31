package org.example.common;

import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class BaseRepository<ID, ENTITY extends BaseEntity<ID>> implements Repository<ID, ENTITY> {
    protected abstract String getFileName();

    @Override
    public ENTITY add(ENTITY entity) {
        List<ENTITY> entities = readFromFile();
        entities.add(entity);
        writeToFile(entities);
        return entity;
    }

    @Override
    public void delete(ID id) {
        List<ENTITY> entities = readFromFile();
        entities.removeIf(entity -> entity.getId().equals(id));
        writeToFile(entities);
    }

    @Override
    public List<ENTITY> getAll() {
        return readFromFile();
    }

    @Override
    public Optional<ENTITY> findById(ID id) {
        List<ENTITY> entities = readFromFile();
        return entities.stream().filter(entity -> entity.getId().equals(id)).findFirst();
    }

    @SneakyThrows
    private void writeToFile(List<ENTITY> entities) {
        File file = new File(getFileName());
        if (!file.exists()) {
            file.createNewFile();
        }
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(entities);
        outputStream.close();
    }

    @SneakyThrows
    private List<ENTITY> readFromFile() {
        List<ENTITY> entities = new ArrayList<>();
        File file = new File(getFileName());
        if (!file.exists()) {
            return entities;
        }
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(getFileName()));
        entities = (List<ENTITY>) inputStream.readObject();
        inputStream.close();
        return entities;
    }

}
