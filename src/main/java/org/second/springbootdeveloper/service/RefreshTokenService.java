package org.second.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.second.springbootdeveloper.domain.RefreshToken;
import org.second.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {

  private final RefreshTokenRepository refreshTokenRepository;

  public RefreshToken findByRefreshToken(String refreshToken) {
    return refreshTokenRepository.findByRefreshToken(refreshToken)
        .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));

  }

}
