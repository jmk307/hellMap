package com.jimin.hellmap.domain.member.entity;

import com.jimin.hellmap.domain.member.model.Social;
import com.jimin.hellmap.global.config.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private Social provider;

    private String providerId;

    @Builder
    public Member(String nickname, Social provider, String providerId) {
        this.nickname = nickname;
        this.provider = provider;
        this.providerId = providerId;
    }
}
