package org.example.child.api;

/**
 * 用户服务
 *
 * @author shichao
 * @since 1.0.0
 * 2021/3/6 23:15
 */
public interface UserService {
    /**
     * 根据用户编号，获取用户信息
     *
     * @param id 用户编号
     * @return 用户信息对象
     */
    ApiResult<User> getUser(Long id);
}
