package stringMethod;

public class StringMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Dubai";  //constant pool area
		String name1=" America";
		String m="Dubai";
		
		String a=new String("Mumbai");  //Non-constant pool area
		String b=new String("Nagpur");
		String c=new String(" Delhi");
		
		// length()---------->integer
		System.out.println(name.length());
		System.out.println(name1.length());
		System.out.println(a.length());
		System.out.println(c.length());
		
		//toUpperCase()------>String
		System.out.println(name.toUpperCase());
		System.out.println(b.toUpperCase());
		
		//toLowerCase()------>String
		System.out.println(m.toLowerCase());
		System.out.println(c.toLowerCase());
		
		//(==) operator----->memory location----->Boolean value----> case sensitive
		System.out.println(name==m);
		System.out.println(m==a);
		System.out.println(b==c);
		
		
		//equals()---->Boolean value----->Case sensitive
		System.out.println(name.equals(m));
		System.out.println(m.equals(c));
		
		
		//equalsIgnoreCase()
		System.out.println(name.equalsIgnoreCase(m));
		System.out.println(name1.equalsIgnoreCase(c));
		
		//contains()
		System.out.println(name1.contains("rica"));
		System.out.println(c.contains(b));
		System.out.println(a.contains("bai"));
		
		
		//isEmpty()
		String h="";
		System.out.println(h.isEmpty());
		String d=" ";
		System.out.println(d.isEmpty());
		System.out.println(d.isBlank());
		//String e=null;
		//System.out.println(e.isEmpty());
		
		System.out.println("Hi");
		
		
		//charAt()
		String s="I am Abhijit Bhamare from Shahada";
		System.out.println(s.charAt(5));
		
		//endsWith()
		String z="Nepal";
		System.out.println(z.endsWith("al"));
		System.out.println(z.endsWith("ep"));
		
		
		//startsWith()
		System.out.println(z.startsWith("Ne"));
		
		//substring()
		String t="Bobby";
		System.out.println(t.substring(3));
		System.out.println(t.substring(0,3));
		
		System.out.println(t.substring(1));
		//System.out.println(t.substring(2,8));
		
		
		//concat()
		System.out.println(name.concat(name1));
		System.out.println(a.concat(c));
		System.out.println(name.concat(" is our city"));
		
		//indexOf()
		System.out.println(z.indexOf('p'));
		
		String r="Application";
		System.out.println(r.indexOf('i'));
		System.out.println(r.lastIndexOf('i'));
		System.out.println(r.indexOf('a',2));
		
		//replace()
		System.out.println(r.replace('i', 'z'));
		System.out.println(r.replace("pp", "uu"));
		
		
		
		
		
		
		
	}

}
