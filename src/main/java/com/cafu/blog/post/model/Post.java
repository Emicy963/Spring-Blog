package com.cafu.blog.post.model;

import com.cafu.blog.accounts.model.User;
import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPost;

    private User author;

    private String title;
    private String content;

    public Long getIdPost(){return idPost;}
    public void setIdPost(long idPost){this.idPost=idPost;}

    public User getAuthor(){return author;}
    public void setAuthor(User author){this.author=author;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}

    public String getContent(){return content;}
    public void setContent(String content){this.content=content;}
}
