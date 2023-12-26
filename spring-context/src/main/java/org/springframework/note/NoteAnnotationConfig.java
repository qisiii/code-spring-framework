package org.springframework.note;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author : qisi
 * @date: 2023/7/21
 * @description: 通过注解配置application
 */
@ComponentScan(basePackageClasses = {NoteAnnotationConfig.class})
@EnableAsync
public class NoteAnnotationConfig {
	@Bean
	public NoteFirst noteFirst(){
		return new NoteFirst();
	}
}
