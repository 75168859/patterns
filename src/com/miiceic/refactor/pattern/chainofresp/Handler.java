package com.miiceic.refactor.pattern.chainofresp;
public abstract class Handler
{
    /**
     * @link aggregation 
     * @supplierCardinality 0..1
     */
    protected Handler successor;
    //调用此方法处理请求
    public abstract void handleRequest();
    //调用此方法设定下家
    public void setSuccessor(Handler successor)
    {
        this.successor = successor;
    }

    public Handler getSuccessor()
    {
        return successor;
    }
}
