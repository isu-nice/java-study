package javaStudy8;

public class BizException extends RuntimeException { 
	public BizException(String msg) {
		super(msg); // 부모 생성자에게 메시지 넘김
	}
	public BizException(Exception ex) {
		super(ex);  // 부모 생성자에게 예외 넘김
	}
}
