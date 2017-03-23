/* This file was generated by SableCC (http://www.sablecc.org/). */

package baz.syntax.node;

import baz.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AAndConjunction extends PConjunction
{
    private PConjunction _left_;
    private TAnd _and_;
    private PEquality _right_;

    public AAndConjunction()
    {
        // Constructor
    }

    public AAndConjunction(
        @SuppressWarnings("hiding") PConjunction _left_,
        @SuppressWarnings("hiding") TAnd _and_,
        @SuppressWarnings("hiding") PEquality _right_)
    {
        // Constructor
        setLeft(_left_);

        setAnd(_and_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AAndConjunction(
            cloneNode(this._left_),
            cloneNode(this._and_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndConjunction(this);
    }

    public PConjunction getLeft()
    {
        return this._left_;
    }

    public void setLeft(PConjunction node)
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

    public TAnd getAnd()
    {
        return this._and_;
    }

    public void setAnd(TAnd node)
    {
        if(this._and_ != null)
        {
            this._and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._and_ = node;
    }

    public PEquality getRight()
    {
        return this._right_;
    }

    public void setRight(PEquality node)
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
            + toString(this._and_)
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

        if(this._and_ == child)
        {
            this._and_ = null;
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
            setLeft((PConjunction) newChild);
            return;
        }

        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PEquality) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
