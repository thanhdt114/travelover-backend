package hcmute.kltn.Backend.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
	@Value("${frontend.dev.domain}")
    private String frontendDevDomain;
	
	@Value("${frontend.prod.domain}")
    private String frontendProdDomain;
	
	@Value("${frontend.test1}")
    private String frontendTest1;
	
	@Value("${frontend.test2}")
    private String frontendTest2;
	
	@Value("${frontend.all}")
    private String frontendAll;
	
	@Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        
//        // Thêm danh sách các domain vào đây
//        List<String> allowedOrigins = Arrays.asList(
//        		frontendDevDomain, 
//        		frontendProdDomain,
//        		frontendTest1,
//        		frontendTest2);
//        config.setAllowedOrigins(allowedOrigins);
        config.setAllowCredentials(true);
        
        config.setAllowedOrigins(Arrays.asList("*"));
        config.setAllowedMethods(Arrays.asList("*"));
        config.setAllowedHeaders(Arrays.asList("*"));
        
        config.addAllowedOrigin("*"); // Thay đổi địa chỉ frontend của bạn tại đây
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
