/*
 * 找出4位数所有吸血鬼数字
 */
package four;

public class E10_VampireNum {
	public static void main(String[] args) {
		int[] twoNum = new int[4];
		int[] resNum = new int[4];
		for(int i = 11; i < 99; i++){
			for(int j = i; j < 99; j++){
				if((i*j)%9 != (i+j)%9)
						continue;
				if(i*j < 1000)
					continue;
				if((i%10==0) && (j%10==0))
					continue;
				twoNum[0] = i%10;
				twoNum[1] = i/10;
				twoNum[2] = j%10;
				twoNum[3] = j/10;
				resNum[0] = i*j%10;
				resNum[1] = i*j/10%10;
				resNum[2] = i*j/100%10;
				resNum[3] = i*j/1000;
				int count = 0;
				for(int a = 0; a < 4; a++){
					for(int b = 0; b < 4; b++){
						if(twoNum[a] == resNum[b]){
							count++;
							twoNum[a] = -1;
							resNum[b] = -2;
						}
					}
				}
				if(count == 4)
					System.out.println(i*j + "=" + i + "*" + j );
				
				
				//System.out.println(i + " " + j);
			}
		}
	}

}
