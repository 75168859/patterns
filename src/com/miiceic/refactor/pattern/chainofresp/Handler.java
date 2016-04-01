package com.miiceic.refactor.pattern.chainofresp;
public abstract class Handler
{
    /**
     * @link aggregation 
     * @supplierCardinality 0..1
     */
    protected Handler successor;
    //���ô˷�����������
    public abstract void handleRequest();
    //���ô˷����趨�¼�
    public void setSuccessor(Handler successor)
    {
        this.successor = successor;
    }

    public Handler getSuccessor()
    {
        return successor;
    }
}
