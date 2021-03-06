package com.junpanda.memo.post.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.junpanda.memo.post.dao.PostDAO;
import com.junpanda.memo.post.model.Post;

@Service
public class PostBO {
	
	@Autowired
	private PostDAO postDAO;
	
	public int addPost(int userId, String subject, String content, MultipartFile file) {
		
		
		
		return postDAO.insertPost(userId, subject, content);
	}
	
	public List<Post> getPostList(int userId){
		return postDAO.selectPostList(userId);
	}
	
	public Post getPost(int postId) {
		return postDAO.selectPost(postId);
	}
	
	public int deletePost(int postId) {
		return postDAO.deletePost(postId);
	}
}
