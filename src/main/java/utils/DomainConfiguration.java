package utils;

import domain.*;
import org.springframework.context.annotation.Bean;

public class DomainConfiguration {

    @Bean
    public Admin getAdmin() {
        return new Admin();
    }

    @Bean
    public Article getArticle() {
        return new Article();
    }
    @Bean
    public Category getCategory() {
        return new Category();
    }

    @Bean
    public Comment getComment() {
        return new Comment();
    }

    @Bean
    public Privilege getPrivilege() {
        return new Privilege();
    }

    @Bean
    public Reply getReply() {
        return new Reply();
    }

    @Bean
    public Role getRole() {
        return new Role();
    }

    @Bean
    public Tag getTag() {
        return new Tag();
    }

}
