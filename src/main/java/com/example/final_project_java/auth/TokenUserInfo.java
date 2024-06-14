package com.example.final_project_java.auth;

import com.example.final_project_java.userapi.entity.Role;
import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TokenUserInfo {
    private String userId;
    private String email;
    private Role role;
}
