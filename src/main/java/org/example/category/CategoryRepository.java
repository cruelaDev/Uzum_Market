package org.example.category;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example.common.BaseRepository;

import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
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
