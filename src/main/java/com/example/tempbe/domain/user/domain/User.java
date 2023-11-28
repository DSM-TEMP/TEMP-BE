package com.example.tempbe.domain.user.domain;

import com.example.tempbe.global.entity.BaseIdEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User extends BaseIdEntity {
    @Column(nullable = false, length = 30)
    private String userId;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 300)
    private String password;

    @Column(nullable = false, length = 30)
    private String department;

    @Column(nullable = false, length = 20)
    private String contact;

    @Builder
    public User(String userId, String name, String password, String department, String contact){
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.department = department;
        this.contact = contact;
    }


    public void updateUserProfile(String userId, String name, String department, String contact){
        this.userId = userId;
        this.name = name;
        this.department = department;
        this.contact = contact;
    }
}
