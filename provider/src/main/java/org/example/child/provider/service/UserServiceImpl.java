package org.example.child.provider.service;

import child.leisure.rpc.annotation.Service;
import org.example.child.api.ApiResult;
import org.example.child.api.User;
import org.example.child.api.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户服务实现类
 *
 * @author shichao
 * @since 1.0.0
 * 2021/3/6 23:42
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public ApiResult<User> getUser(Long id) {
        logger.info("Receive getUser request by id:{}.", id);
        User user = this.getFromDbOrCache(id);
        logger.info("Get user:{} by id:{}.", user, id);
        return ApiResult.success(user);
    }

    private User getFromDbOrCache(Long id) {
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User(id, "shichao", 1,"http123");
    }
}
