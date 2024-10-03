//package br.com.arenagames.cadastroservicos.service;
//
//import br.com.arenagames.cadastroservicos.model.Usuario;
//import br.com.arenagames.cadastroservicos.repository.UsuarioRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class UsuarioService implements UserDetailsService {
//
//    private final UsuarioRepository usuarioRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        Optional<Usuario> usuario = Optional.ofNullable(usuarioRepository.findByUsername(username)
////                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado")));
////        return new User(usuario.get().getUsername(), usuario.get().getPassword(), getAuthorities(usuario));
//        Usuario usuario = usuarioRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));
//
//        return new User(usuario.getUsername(), usuario.getPassword(), getAuthorities(usuario));
//    }
//    private Collection<? extends GrantedAuthority> getAuthorities(Usuario usuario) {
//        return List.of(new SimpleGrantedAuthority("ROLE_" + usuario.getTipo()));
//    }
//}
