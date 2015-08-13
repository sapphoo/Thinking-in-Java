package two;

import java.lang.ProcessBuilder.Redirect;

public class E11_AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	void changeTheHueOfTheColor(int newHue){
		anIntegerRepresentingColors = newHue;
		//anIntegerRepresentingColors++;
	}
	public static void main(String[] args) {
		E11_AllTheColorsOfTheRainbow atc = new E11_AllTheColorsOfTheRainbow();
		//atc.anIntegerRepresentingColors = 0;
		atc.changeTheHueOfTheColor(27);
		//while(atc.anIntegerRepresentingColors <= 6){
		System.out.println(atc.anIntegerRepresentingColors);
			//atc.changeTheHueOfTheColor();
		//}
	}


}
