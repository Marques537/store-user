package com.storeuserapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String cpf;
    private String phoneNumber;
}
