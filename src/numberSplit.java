
public class numberSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		String s = "33wqsnfjks732hjsddh71";
		String str[] = s.split("[a-zA-Z]+");
		for (int i = 0; i < str.length; i++)
		{
		count = count + Integer.parseInt(str[i]);
		}
		System.out.println("here is " + str[0]+" : "+count);
	}

}
