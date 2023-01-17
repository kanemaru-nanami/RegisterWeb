package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// コントローラクラス
@Controller
public class Register {

	/*「/」がリクエストされたら、startメソッドを起動
	 * input.html を開くように設定 */
	@RequestMapping("/")
	public String start() {
		return "input.html";
	}

	/* localhost:8080/hello のGETリクエストに対する処理を
	 * getHelloメソッドで行う
	 */

	/* @ModelAttribute
	 * リクエストパラメータを RBeanクラスのオブジェクトrb
	 * に割り当てる*/
	// RBeanクラス(registerBeanのクラス)
	/* ModelAndViewクラス(SpringFrameworkで提供されているクラス)
	 * ModelとViewの情報を保持するクラス */
	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute RegisterBean rb, ModelAndView mav) {
		// リクエストパラメータ(rb)をmavにadd
		mav.addObject("rb", rb);
		// 呼び出すViewの名前を設定する
		mav.setViewName("register.html");
		return mav;
	}
}
