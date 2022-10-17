package lecture.p01lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // final 필드를 초기화하는 생성자 생성
@AllArgsConstructor
// @NoArgsConstructor <-- final이 있으면 불가능
public class JavaBean7 {
	private final String name;
	private final int age;
	private String address;
}
