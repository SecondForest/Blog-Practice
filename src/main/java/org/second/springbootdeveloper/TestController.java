package org.second.springbootdeveloper;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Autowired
  TestService testService;

  @GetMapping("/test")
  public List<Member> getAllMember() {
    List<Member> members = testService.getAllMembers();
    return members;
  }

}
