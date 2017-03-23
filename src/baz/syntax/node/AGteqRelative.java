/* This file was generated by SableCC (http://www.sablecc.org/). */

package baz.syntax.node;

import baz.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AGteqRelative extends PRelative
{
    private PRelative _left_;
    private TGteq _gteq_;
    private PAdditive _right_;

    public AGteqRelative()
    {
        // Constructor
    }

    public AGteqRelative(
        @SuppressWarnings("hiding") PRelative _left_,
        @SuppressWarnings("hiding") TGteq _gteq_,
        @SuppressWarnings("hiding") PAdditive _right_)
    {
        // Constructor
        setLeft(_left_);

        setGteq(_gteq_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AGteqRelative(
            cloneNode(this._left_),
            cloneNode(this._gteq_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGteqRelative(this);
    }

    public PRelative getLeft()
    {
        return this._left_;
    }

    public void setLeft(PRelative node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TGteq getGteq()
    {
        return this._gteq_;
    }

    public void setGteq(TGteq node)
    {
        if(this._gteq_ != null)
        {
            this._gteq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._gteq_ = node;
    }

    public PAdditive getRight()
    {
        return this._right_;
    }

    public void setRight(PAdditive node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._gteq_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._gteq_ == child)
        {
            this._gteq_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PRelative) newChild);
            return;
        }

        if(this._gteq_ == oldChild)
        {
            setGteq((TGteq) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PAdditive) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
