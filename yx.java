package Zfc;
public class yx{
public static void main(String Str , String Stra , String Strb) {
try {
	int count = 0;
	char pome[] = Str.toCharArray();
	StringBuffer A = new StringBuffer();
		for (int i = 0; i < Str.length(); i++) {
			A.append(pome[i]);
			
			for (int j = 0; j < Str.length() / 7; j++) {
				if (i == (2 * j - 1) * 7 - 1 ) {
				A.append("，");
}
				if (i == (2 * j) * 7 - 1 ) {
					A.append("。");
					A.append("\n");
}
}
			if (Stra.charAt(0) == pome[i]) {
				count++;
}
}
		 int length=Str.length();
	     int count1 = 0;
	     int k = 0;
	     for(int i= 0; i<=length; i++){
	         if(Str.indexOf(Strb) == (i-k)){
	             Str = Str.substring(i-k+1,Str.length());
	             count1++;
	             k = i+1;
	         }
	     }

				System.out.println(A);
				System.out.println("“" + Stra + "”" + "字出现的个数为：" + count);
				System.out.println("“" + Strb + "”" + "词出现的个数为：" + count1);

}
			catch (Exception exception) {
				System.out.println("错误原因:" + exception);
}
}
}
