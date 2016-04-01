package com.miiceic.refactor.pattern.proxy;
public class ProxySubject extends Subject 
{
    private RealSubject realSubject;
	
	public ProxySubject()
	{
	}
	
	public void request()
	{
        preRequest();

		if( realSubject == null )
        {
			realSubject = new RealSubject();
		}

        realSubject.request();

        postRequest();
	}

    private void preRequest()
    {
    	System.out.println("����ǰ����־");
    	System.out.println("������ ");
        //something you want to do before requesting
    }

    private void postRequest()
    {
    	System.out.println("��������־");
    	System.out.println("���񡣡�����");
        //something you want to do after requesting
    }

	@Override
	public void bus2() {
		preRequest();
		// TODO Auto-generated method stub
		realSubject.bus2();
		postRequest();
	}
    
}
