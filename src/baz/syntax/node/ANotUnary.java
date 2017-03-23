/* This file was generated by SableCC (http://www.sablecc.org/). */

package baz.syntax.node;

import baz.syntax.analysis.*;

@SuppressWarnings("nls")
public final class ANotUnary extends PUnary
{
    private TNot _not_;
    private PUnary _unary_;

    public ANotUnary()
    {
        // Constructor
    }

    public ANotUnary(
        @SuppressWarnings("hiding") TNot _not_,
        @SuppressWarnings("hiding") PUnary _unary_)
    {
        // Constructor
        setNot(_not_);

        setUnary(_unary_);

    }

    @Override
    public Object clone()
    {
        return new ANotUnary(
            cloneNode(this._not_),
            cloneNode(this._unary_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotUnary(this);
    }

    public TNot getNot()
    {
        return this._not_;
    }

    public void setNot(TNot node)
    {
        if(this._not_ != null)
        {
            this._not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._not_ = node;
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
            + toString(this._not_)
            + toString(this._unary_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._not_ == child)
        {
            this._not_ = null;
            return;
        }

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
        if(this._not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

        if(this._unary_ == oldChild)
        {
            setUnary((PUnary) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
