package org.example.category;

import org.example.common.BaseRepository;

import java.util.UUID;

public class CategoryRepository extends BaseRepository<UUID, Category> {
    private static final CategoryRepository categoryRepository = new CategoryRepository();

    @Override
    protected String getFileName() {
        return "src/main/resources/category.txt";
    }

    public static CategoryRepository getInstance() {
        return categoryRepository;
    }
}
