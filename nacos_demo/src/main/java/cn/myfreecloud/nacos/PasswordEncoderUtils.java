package cn.myfreecloud.nacos;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author: zhangyang
 * @date: 2020/5/8 13:55
 * @description:
 */
public class PasswordEncoderUtils {
    public static void main(String[] args) {
        String encode = new BCryptPasswordEncoder().encode("123");
        System.out.println(encode);
    }
}
