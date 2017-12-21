package com.gtcom.config;

import com.gtcom.bean.User;
import com.gtcom.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cdyoue on 2016/10/21.
 */

public class ShiroRealm extends AuthorizingRealm {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;
//    @Autowired
//    private PermissionDao permissionService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("doGetAuthorizationInfo+"+principalCollection.toString());
        System.out.println("############################################");
//        User user = userService.getUserByName((String) principalCollection.getPrimaryPrincipal());
        User user = new User();
        user.setUserName("123");
        user.setPassWord("123");
        //把principals放session中 key=userId value=principals
        SecurityUtils.getSubject().getSession().setAttribute("xxxx",SecurityUtils.getSubject().getPrincipals());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRole("admin");
        info.addStringPermission("/index");
        //赋予角色
//        for(Role userRole:user.getRoles()){
//            info.addRole(userRole.getName());
//        }
//        //赋予权限
//        for(Permission permission:permissionService.getByUserId(user.getId())){
////            if(StringUtils.isNotBlank(permission.getPermCode()))
//                info.addStringPermission(permission.getName());
//        }

        //设置登录次数、时间
//        userService.updateUserLogin(user);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("doGetAuthenticationInfo +"  + authenticationToken.toString());

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName = token.getUsername();
        logger.info(userName+token.getPassword());
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("user", "aa");
        System.out.println("xxxxxxxxxxxsadsadsssx");
        return new SimpleAuthenticationInfo(userName,"123","123");
//        User user = userService.getByUserName(token.getUsername());
//        if (true) {
////            byte[] salt = Encodes.decodeHex(user.getSalt());
////            ShiroUser shiroUser=new ShiroUser(user.getId(), user.getLoginName(), user.getName());
//            //设置用户session

//            return new SimpleAuthenticationInfo(userName,"123","123");
//        } else {
//            return null;
//        }
//        return null;
    }

}
