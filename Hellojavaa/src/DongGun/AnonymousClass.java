package DongGun;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {
	public static void main(String[] args) {
		// 익명클래스 - 이름이 없는 클래스 , 일회용
		// 자바스크립트 : function satHello() {} ;
		// 익명스크립트 : function () {} ;

		// 익명 클래스 선언
		Object o = new Object();
		o = new Object() {
		};

		Button btn = new Button("OK");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭 됨");

			}
		});

	}

}
