package org.springframework.note;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : qisi
 * @date: 2023/7/21
 * @description: 通过注解配置application
 */
@ComponentScan(basePackageClasses = {NoteAnnotationConfig.class})
public class NoteAnnotationConfig {
	@Bean
	public NoteFirst noteFirst(){
		return new NoteFirst();
	}
}
