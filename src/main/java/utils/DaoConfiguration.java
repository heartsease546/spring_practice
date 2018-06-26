package utils;

import dao.*;
import dao.impl.*;
import org.springframework.context.annotation.Bean;

public class DaoConfiguration {

    @Bean
    public AdminDao getAdminDao () {
        return new AdminDaoImpl();
    }

    @Bean
    public ArticleDao getArticleDao () {
        return new ArticleDaoImpl();
    }

    @Bean
    public CategoryDao getCategoryDao () {
        return new CategoryDaoImpl();
    }

    @Bean
    public CommentDao getCommentDao () {
        return new CommentDaoImpl();
    }

    @Bean
    public PrivilegeDao getPrivilegeDao () {
        return new PrivilegeDaoImpl();
    }

    @Bean
    public ReplyDao getReplyDao () {
        return new ReplyDaoImpl();
    }

    @Bean
    public RoleDao getRoleDao () {
        return new RoleDaoImpl();
    }

    @Bean
    public TagDao getTagDao () {
        return new TagDaoImpl();
    }
}
