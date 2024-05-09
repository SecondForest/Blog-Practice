package org.second.springbootdeveloper;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  @Autowired // 빈 주입
  MemberRepository memberRepository;

  public List<Member> getAllMembers() {
    return memberRepository.findAll(); // 멤버 목록 얻기
  }

}
