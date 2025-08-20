
public class PractiseString {

	public static void main(String[] args) 
	{
		String series="Stranger";
		String series1=new String("Things");
		String series2="stranger";
		StringBuffer series3=new StringBuffer("Very");
		System.out.println(series.length());
		System.out.println(series.charAt(2));
		System.out.println(series.toUpperCase());
		System.out.println(series.toLowerCase());
		System.out.println(series.substring(2));
		System.out.println(series.substring(4,6));
		System.out.println(series==series1);
		System.out.println(series.equals(series2));
		System.out.println(series.equalsIgnoreCase(series2));
		System.out.println(series.contains("r"));
		System.out.println(series.concat(series1));
		System.out.println(series3.reverse());
		System.out.println(series3);
		System.out.println(series2.reverse());
		
		
	

	}

}
