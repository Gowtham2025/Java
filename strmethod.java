class strmethod
{
	public static void main(String[] args)
	{
		String s="Revai";
		String s1="revai";
		System.out.println(s.charAt(1));
		System.out.println(s.length());
		System.out.println(s.substring(2));
		System.out.println(s.contains("a"));
		System.out.println(s.concat(s1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
	}
}