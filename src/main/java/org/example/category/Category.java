package org.example.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.example.common.BaseEntity;

import java.util.UUID;

@AllArgsConstructor@NoArgsConstructor
@Data
@ToString(callSuper = true)
public class Category extends BaseEntity<UUID> {
    private String name;
}
