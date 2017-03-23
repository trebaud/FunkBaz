/* This file was generated by SableCC (http://www.sablecc.org/). */

package baz.syntax.node;

import baz.syntax.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleFactor extends PFactor
{
    private PUnary _unary_;

    public ASimpleFactor()
    {
        // Constructor
    }

    public ASimpleFactor(
        @SuppressWarnings("hiding") PUnary _unary_)
    {
        // Constructor
        setUnary(_unary_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleFactor(
            cloneNode(this._unary_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleFactor(this);
    }

    public PUnary getUnary()
    {
        return this._unary_;
    }

    public void setUnary(PUnary node)
    {
        if(this._unary_ != null)
        {
            this._unary_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._unary_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._unary_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._unary_ == child)
        {
            this._unary_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._unary_ == oldChild)
        {
            setUnary((PUnary) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
