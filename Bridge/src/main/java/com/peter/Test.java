package com.peter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MobileSoft game =  new MobileGame();
		MobileSoft mp3 =  new MobileMp3();

		Mobile nokia = new NokiaMobile("Nokia");
		nokia.setSoft(game);
		nokia.play();
		nokia.setSoft(mp3);
		nokia.play();

		Mobile moto = new MotoMible("Moto");
		moto.setSoft(game);
		moto.play();
		moto.setSoft(mp3);
		moto.play();
	}
}
