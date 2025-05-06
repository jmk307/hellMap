package com.jimin.hellmap.domain.member.dto;

import com.jimin.hellmap.domain.member.model.Social;
import lombok.Builder;

@Builder
public record ValidateMemberDto(
        boolean isValid,
        Social provider,
        String providerId,
        String accessToken
) {
    public static ValidateMemberDto of(Social provider, String providerId) {
        return ValidateMemberDto.builder()
                .isValid(false)
                .provider(provider)
                .providerId(providerId)
                .accessToken("")
                .build();
    }

    public static ValidateMemberDto of(Social provider, String providerId, String accessToken) {
        return ValidateMemberDto.builder()
                .isValid(true)
                .provider(provider)
                .providerId("")
                .accessToken(accessToken)
                .build();
    }
}
