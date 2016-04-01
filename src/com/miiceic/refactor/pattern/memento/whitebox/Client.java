package com.miiceic.refactor.pattern.memento.whitebox;
public class Client
{
    private static Originator o = new Originator();
    private static Caretaker c = new Caretaker();

    public static void main(String[] args)
    {
    	//�ı䷢���˶����״̬
        o.setState("On");

	    // Store internal state��������¼���� ���������˶���״̬�洢����
	    c.saveMemento( o.createMemento() );
	    System.out.println(o.getState());
	    // Continue changing originator
	   o.setState("Off");

	    // Restore saved state
	   o.restoreMemento( c.retrieveMemento() );
	    System.out.println(o.getState());
	    //�ƻ��˶Է�����״̬�ķ�װ

    }
}
