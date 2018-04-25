
public class ReplacementExample {

	public static void main(String[] args) {
		String s="ffghyfkabdgaghfyabcabcghfdabc";
		String req="abc";
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='a') {
//				if(s.substring(i, i+3).equals(req)) {
//				//	System.out.println("inside if loop");
//				s=s.replace(s.substring(i, i+req.length()), "***");
//			//	System.out.println(s);
//				i=i+2;
//				}
//			}
//	
//		}
		s=s.replace("abc", "***");
		System.out.println(s);
		
	}

}
