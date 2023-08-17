/**
 * 
 */
package com.tutorial.poc.security;

/*import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;*/

/**
 * @author jitsha
 *
 */
public class PocBasicAuthenticationProvider { /*implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {


		String password = String.valueOf(authentication.getCredentials());
		String username = String.valueOf(authentication.getPrincipal());

		System.out.println(username + "," + password);

		if ("akshya".equalsIgnoreCase(username) && "chutiya".equalsIgnoreCase(password)) {
			UserDetails user = User.withUsername(username).password(password).roles("ADMIN").build();
			return new UsernamePasswordAuthenticationToken(user, user.getPassword(), user.getAuthorities());
		} else if ("jits".equalsIgnoreCase(username) && "chutiya".equalsIgnoreCase(password)) {
			UserDetails user = User.withUsername(username).password(password).roles("USER").build();
			return new UsernamePasswordAuthenticationToken(user, user.getPassword(), user.getAuthorities());
		}
		throw new BadCredentialsException("Chutiya ka login fail");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}
*/
}
