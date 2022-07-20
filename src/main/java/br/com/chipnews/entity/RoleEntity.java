package br.com.chipnews.entity;

import br.com.chipnews.enums.RoleName;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;


@Data @Getter @Setter
@Entity
@Table(name = "TB_ROLE")
public class RoleEntity implements GrantedAuthority, Serializable {
    private static final long serialVersionID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID roleId;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private String roleName;

    @ManyToMany
    @JoinTable(name = "TB_USERS_ROLES",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<RoleEntity> roles;

    @Override
    public String getAuthority() {
        return this.roleName.toString();
    }
}
