package note;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.note.NoteAnnotationConfig;
import org.springframework.note.NoteComponent;
import org.springframework.note.NoteEvent;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author : qisi
 * @date: 2023/7/20
 * @description: spring源码学习
 */
public class SpringCodeSourceLearnTests {
	@Test
	void singleConfigLocation() {
		//从这里开始了解spring流程
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/note/simpleApplication.xml");
		assertThat(ctx.containsBean("noteFirst")).isTrue();
		assertThat(ctx.containsBean("noteBean")).isTrue();
		ctx.close();
	}
	@Test
	void annotationConfigLocation() {
		//通过注解配置spring容器
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(NoteAnnotationConfig.class);
		ctx.getBean(NoteComponent.class).test();
//		ctx.publishEvent(new NoteEvent("event"));
		assertThat(ctx.containsBean("noteFirst")).isTrue();
		assertThat(ctx.containsBean("noteBean")).isTrue();
		ctx.close();
	}
}
