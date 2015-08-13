package three;

public class E04_Velocity {
	public static void main(String[] args) {
		if(args.length < 2){
			System.err.println("We don't have enough parameter");
			System.exit(1);
		}
		float distance = Float.parseFloat(args[0]);
		float time = Float.parseFloat(args[1]);
		System.out.print(distance);
		System.out.print(time);
		System.out.println("velocity = " + distance/time + "m/s");
	}

}
