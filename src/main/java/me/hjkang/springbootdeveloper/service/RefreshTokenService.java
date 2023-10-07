package me.hjkang.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.hjkang.springbootdeveloper.domain.RefreshToken;
import me.hjkang.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected refresh token"));
    }
}
