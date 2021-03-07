package org.example.child.consumer.controller;

import child.leisure.rpc.annotation.InjectService;
import org.example.child.api.ApiResult;
import org.example.child.api.User;
import org.example.child.api.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者 controller
 *
 * @author shichao
 * @since 1.0.0
 * 2021/3/6 23:29
 */
@RestController
@RequestMapping("/index")
public class ConsumerController {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @InjectService
    private UserService userService;

    @RequestMapping("/getUser")
    public ApiResult<User> getUser(Long id) {
        logger.info("Get request getUser by id:{}.", id);
        ApiResult<User> result = userService.getUser(id);
        logger.info("Get response from service:{}.", result);
        return result;
    }
}
