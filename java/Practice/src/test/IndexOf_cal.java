		package test;

		public class IndexOf_cal {
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		public int cal(String scn) {

			System.out.println(scn);

			int pos = scn.indexOf('+');

			System.out.println("pos �� Ȯ��:" +pos);

			// System.out.println("1111"+scn.substring(0, 2) + scn.substring(3));

		
			if (pos != -1) { // ���ڰ� �����ϱ� -1�� �ƴϿ��� ��

			System.out.println("if �� �ȿ� ���������� ���Դ��� Ȯ�� ");

			return cal(scn.substring(0, pos)) + cal(scn.substring(pos + 1));

			}

			
			System.out.println("return loop");

			String r = scn.trim();

			System.out.println("<!--------!> " + r);

			return Integer.parseInt(r);
	}

}
