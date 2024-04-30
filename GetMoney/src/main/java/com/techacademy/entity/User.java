package com.techacademy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    /** 性別 */
    public static enum Gender {
        男性, 女性, どちらでもない
    }
    /** 主キー */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    /** 名前　nullだめ */
    @Column(length = 30, nullable = false)
    private String name;
    
    /** 性別。2桁。列挙型（文字列） */
    @Column(length = 2)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    /** 年齢 */
    private Integer age;
    
    /** メールアドレス。50桁。nullだめ */
    @Column(length = 50, nullable = false)
    private String email;
}
