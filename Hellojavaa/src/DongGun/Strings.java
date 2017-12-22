package DongGun;

public class Strings {
	public static void main(String[] args) {
		// String 클래스 주요 메서드
		// charAt(),contains() , equalsIhgnoreCase()

		// String (char [] value )
		char[] c = { 'H', 'e', 'l', 'l', 'o' };
		String s = new String(c);
		System.out.println(s);
		// String (StringBuffer buf)

		StringBuffer sb = new StringBuffer("Hello");
		s = new String(sb);
		System.out.println(s);

		// char charAt(int index)
		s = "Hello";
		String n = "1234567890";
		char c1 = s.charAt(1); // 지정한 위치 문자 추출
		char c2 = n.charAt(6);
		System.out.println(c1);
		System.out.println(c2);
		// int compareTo(String str )

		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bb".compareTo("aaa");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);

		// String concat(String str)
		s = "Hello";
		String s2 = s.concat("World");
		System.out.println(s2);

		// boolean contains(charSequence s

		s = "abcedfg";
		boolean b = s.contains("bc");

		// boolean endsWith9String suffix)

		String file = "Hello.txt";
		b = file.endsWith("txt");

		// boolean equals (Object obj )
		s = "Hello";
		b = s.equals("Hello");
		boolean b2 = s.equals("hello");

		// boolean equalsIgnoreCase (String str)

		s = "Hello";
		b = s.equalsIgnoreCase("Hello");
		b2 = s.equalsIgnoreCase("hello");

		// int indexOf(int ch)
		s = "Hello";
		int idx1 = s.indexOf('o');
		int idx2 = s.indexOf('k');

		// int indexOf(int ch, int pos)

		s = "Hello";
		idx1 = s.indexOf('e', 0);
		idx2 = s.indexOf('e', 2);

		// int indexOf ( String str )

		s = "ABCDEFG";
		int idx = s.indexOf("cd");

		// int lastIndexOf(int ch)
		s = "Java.lang.Object";
		idx1 = s.lastIndexOf('.');
		idx2 = s.indexOf('.');
		// int lastIndexOf(String str)
		s = "Java.lang.java";
		idx1 = s.lastIndexOf("java");
		idx2 = s.indexOf("java");
		// int length ()
		s = "Hello";
		int length = s.length();
		// String replace (char old , char nw)

		s = "Hello";
		String s1 = s.replace('H', 'C');

		// String replace (CharSequence old ,CharSequence nw)
		s = "Hello";
		s1 = s.replace("11", "LL");

		// String replace ( String regex , String replacement )

		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");

		// String replaceFirst ( String regex , String replacement )

		ab = "AABBAABB";
		r = ab.replaceAll("BB", "bb");

		// String [] split(String regex )

		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		// String [] split(String regex , int limit )
		animals = "dog,cat,bear";
		arr = animals.split(",", 2);

		// boolean StartsWith (String prefix)
		s = "java.leng.Object";
		b = s.startsWith("java");
		b2 = s.startsWith("leng");

		// String substring (int begin )String substing(int begin , int end ) ;

		s = "java.leng.Object";
		String a = s.substring(10);
		String p = s.substring(5, 9);

		// String toLowerCase ()

		s = "Hello";
		s1 = s.toLowerCase();

		// String to string

		s = "Hello";
		s1 = s.toString();

		// String toUppewCase ()

		s = "Hello";
		s1 = s.toUpperCase();

		// String trim ()

		s = " Hello World";
		s1 = s.trim();

		// static String valueOf(boolean b)
		// static String valueOf(char c)
		// static String valueOf(int i)
		// static String valueOf(long l)
		// static String valueOf(float f)
		// static String valueOf(double d)
		// static String valueOf(Object o)

		String q = String.valueOf(true);
		String w = String.valueOf('a');
		String e = String.valueOf(100);
		String z = String.valueOf(100L);
		String t = String.valueOf(10f);
		String y = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);

		// StringBuffer 클래스

		// StringBuffer ()

		StringBuffer qw = new StringBuffer();
		// StringBuffer(int length)
		qw = new StringBuffer(10);
		// StrinBuffer(String str)
		qw = new StringBuffer("Hi");

		// StringBuffer append(boolean b)
		// StringBuffer append(char c)
		// StringBuffer append(chat[] str)
		// StringBuffer append(double d)
		// StringBuffer append(float f)
		// StringBuffer append(int i)
		// StringBuffer append(long l)
		// StringBuffer append(object obj)
		// StringBuffer append(String str)

		qw = new StringBuffer("avc");
		StringBuffer qw2 = qw.append(true);
		qw.append('d').append(10.0f);
		StringBuffer qw3 = qw.append("ABC").append(123);

		// as = "abctrued10.0ABC123";
		// as = "abctrued10.0ABC123";
		// as = "abctrued10.0ABC123";

		// int capacity ()

		// String
	}
}
