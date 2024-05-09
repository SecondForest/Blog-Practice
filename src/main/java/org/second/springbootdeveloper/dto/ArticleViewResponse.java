package org.second.springbootdeveloper.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.second.springbootdeveloper.domain.Article;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {

  private Long id;
  private String title;
  private String content;
  private LocalDateTime createdAt;

  public ArticleViewResponse(Article article) {
    this.id = article.getId();
    this.title = article.getTitle();
    this.content = article.getContent();
    this.createdAt = article.getCreatedAt();
  }
}
