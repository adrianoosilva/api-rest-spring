package br.com.api.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*");
    }

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> arg0) {
		
	}

	@Override
	public void addFormatters(FormatterRegistry arg0) {
		
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry arg0) {
		
	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> arg0) {
		
	}

	@Override
	public void addViewControllers(ViewControllerRegistry arg0) {
		
	}

	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer arg0) {
		
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer arg0) {
		
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer arg0) {
		
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
		
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> arg0) {
		
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer arg0) {
		
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry arg0) {
		
	}

	@Override
	public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> arg0) {
		
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> arg0) {
		
	}

	@Override
	public MessageCodesResolver getMessageCodesResolver() {
		return null;
	}

	@Override
	public Validator getValidator() {
		return null;
	}
}
