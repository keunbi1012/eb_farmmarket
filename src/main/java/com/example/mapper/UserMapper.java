package com.example.mapper;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.example.vo.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@Mapper
public class UserMapper {
    //TODO: Connect this to DB.

    private static Map<Long, User> store = new HashMap<>();
    private static long seq = 0L;

    public User save(User user){
        user.setId(++seq); // auto incremental
        log.info("Save member = {}", user);
        store.put(user.getId(), user);
        return user;
    }

    public User findById(Long id){
        return store.get(id);
    }

    public Optional<User> findByLoginId(String loginId){
        return store.values().stream()
                .filter(u -> u.getUserId().equals(loginId))
                .findFirst();
    }

    public void clearStore(){
        store.clear();
    }

}
