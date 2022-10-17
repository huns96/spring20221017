package lecture.p01lombok;

import lombok.Getter;
import lombok.Setter;

// 특정 필드에만 Getter, Setter 적용

public class JavaBean3 {
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private int age;
}
