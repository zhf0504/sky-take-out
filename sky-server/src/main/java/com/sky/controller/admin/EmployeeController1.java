//package com.sky.controller.admin;
//
//import com.sky.constant.JwtClaimsConstant;
//import com.sky.dto.EmployeeLoginDTO;
//import com.sky.entity.Employee;
//import com.sky.properties.JwtProperties;
//import com.sky.result.Result;
//import com.sky.service.EmployeeService1;
//import com.sky.utils.JwtUtil;
//import com.sky.vo.EmployeeLoginVO;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/admin/employee")
//@Slf4j
//public class EmployeeController1 {
//    @Autowired
//    private EmployeeService1 employeeService1;
//
//    @Autowired
//    private JwtProperties jwtProperties;
//
//    /**
//     * 登录
//     * @param employeeLoginDTO
//     * @return
//     */
//    @PostMapping("/login")
//    public Result<EmployeeLoginVO> login(@RequestBody EmployeeLoginDTO employeeLoginDTO){
//        Employee employee = employeeService1.login(employeeLoginDTO);
//
//        Map<String,Object> claims = new HashMap<>();
//        claims.put(JwtClaimsConstant.EMP_ID,employee.getId());
//        String token = JwtUtil.createJWT(
//                jwtProperties.getAdminSecretKey(),
//                jwtProperties.getAdminTtl(),
//                claims
//        );
//
//        EmployeeLoginVO employeeLoginVO =EmployeeLoginVO.builder()
//                .id(employee.getId())
//                .userName(employee.getName())
//                .name(employee.getName())
//                .token(token)
//                .build();
//        return Result.success(employeeLoginVO);
//    }
//
//}
