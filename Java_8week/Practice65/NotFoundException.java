//20181013������
class NotFoundException extends Exception{
	public NotFoundException(int key) {
		super("�Էµ� ���� " + key + "�� �迭���� �������� �ʽ��ϴ�.");
	}
}