//20181013������
import java.util.ArrayList;
public class Practice76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ɻ����� ä�����");
		ArrayList<Double> arr = new ArrayList<Double>();

		for(int i = 0; i < 10; i++) {
			arr.add(Math.random() * 10);
		}
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + "\t");
			if(i % 2 == 1)
				System.out.println();
		}
		
		System.out.println();

		System.out.println("��հ� : " + getAve(arr));
		System.out.println();
		System.out.println("���� ���� ����: " + findMax(arr));
		System.out.println("���� ���� ����: "+ findMin(arr));
		System.out.println();

		System.out.println("�ְ����� �������� ������ ���");
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + "\t");
			if(i % 2 == 1)
				System.out.println();
		}
		
		System.out.println();

		System.out.println("���� ����: " + getAve(arr));

	}
	public static Double findMax(ArrayList<Double> scores) {
		double max = -1;

		for(int i = 0; i < scores.size(); i++)
			if(max < scores.get(i))
				max = scores.get(i);
		scores.remove(max);

		return max;
	}
	public static Double findMin(ArrayList<Double> scores) {
		double min = 100;

		for(int i = 0; i < scores.size(); i++)
			if(min > scores.get(i))
				min = scores.get(i);
		scores.remove(min);

		return min;
	}
	public static Double getAve(ArrayList<Double> scores) {
		double sum = 0;
		for(int i = 0; i < scores.size(); i++)
			sum += scores.get(i);
		return sum / scores.size();
	}
}
