package com.example.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.domain.Board;
import com.example.parameter.BoardParameter;
import com.example.parameter.BoardSearchParameter;

/**게시판 Repository
 * @author 이유나
 *
 */
@Repository
public interface BoardRepository {
	
	List<Board> getList(BoardSearchParameter parameter);
	
	Board get(int boardIdx);
	
	void save(BoardParameter board);
	
	void saveList(Map<String, Object> paramMap);
	
	void update(BoardParameter board);
	
	void delete(int boardIdx);

}
