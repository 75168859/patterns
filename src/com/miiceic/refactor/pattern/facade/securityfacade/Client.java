package com.miiceic.refactor.pattern.facade.securityfacade;
public class Client
{
    /**
     * @link aggregation
     * @directed 
     */
    private static SecurityFacade security;

    public static void main(String[] args)
    {
		security.activate();
		
		
		
    }
}