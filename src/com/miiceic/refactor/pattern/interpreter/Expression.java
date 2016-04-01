package com.miiceic.refactor.pattern.interpreter;
/**
 * 这个抽象类代表终结类和非终结类的抽象化其中终结类和非终结类来自下面
 * 的文法<br>
 * <pre>
 * BooleanExp ::=
 *           BooleanExp AND BooleanExp
 *         | BooleanExp OR BooleanExp
 *         | NOT BooleanExp
 *         | Variable
 *         | Constant
 * Variable ::= ... // a string of printable, non-white space characters
 * Contant ::= "true" | "false"
 * </pre>
 */
public abstract class Expression {
    /**
     * Given a BooleanExp object denoting a term,
     * this method interprets this term relative to a Context
     * object.
     */
    public abstract boolean interpret(Context ctx);

    /**
     * Given a BooleanExp object denoting a term,
     * this method test whether the given argument
     * denoting another term is structurally the same.
     * 检验两个表达式结构上是否相同
     */
    public abstract boolean equals(Object o);

    /**
     * Returns a hash code of this term.
     */
    public abstract int hashCode();

    /**
     * Converts a term into a string. Can be used as the
     * basis for calculating the hashCode.
     */
    public abstract String toString();
}
