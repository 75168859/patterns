package com.miiceic.refactor.pattern.prototype.monkey;
public class TheGreatestSage
{
    public void change()
    {
	    Monkey copyMonkey;
	    copyMonkey = (Monkey) monkey.clone();
        System.out.println("Monkey King's birth date=" + monkey.getBirthDate() );
        System.out.println("Copy monkey's birth date=" + copyMonkey.getBirthDate() );
        System.out.println("Monkey King == Copy Monkey? " + (monkey == copyMonkey));
        System.out.println("Monkey King's Staff == Copy Monkey's Staff? " + (monkey.getStaff() == copyMonkey.getStaff()));
    }

    public static void main(String[] args)
    {
    	TheGreatestSage sage = new TheGreatestSage();

        sage.change();
    }

    /**
     * @link aggregation
     * @directed 
     */
    private Monkey monkey = new Monkey();
}