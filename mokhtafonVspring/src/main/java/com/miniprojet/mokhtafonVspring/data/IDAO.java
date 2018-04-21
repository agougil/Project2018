package com.miniprojet.mokhtafonVspring.data;

import java.util.List;

import com.miniprojet.mokhtafonVspring.model.Article;
import com.miniprojet.mokhtafonVspring.model.Personne;

public interface IDAO {
	public Personne checkLogin(String email, String userPassword);
	public List<Article> getArticlesOfUser(String Email );
	public void addArticle(Article a);
	public void addUser(Personne p);
	
	
}
